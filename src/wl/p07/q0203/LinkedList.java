package wl.p07.q0203;

public class LinkedList<T extends Comparable<T>> {
    // reference to first item in list
    private ListNode<T> pHead;

    // constructor
    public LinkedList() {
        pHead = null;
    }

    public ListNode<T> insertFirst(T value) {
        ListNode<T> newNode = new ListNode<T>(value);
        newNode.next = pHead;
        pHead = newNode;
        return newNode;
    }
    
    public ListNode<T> insertInOrder(T value) {
        ListNode<T> prev = pHead;
        ListNode<T> curr = pHead;
        // if the current list is empty
        if (curr == null) { return this.insertFirst(value); }
        while (curr != null) {
            if (curr.data.compareTo(value) > 0) {
                if (prev == curr) {
                	// If this will be the first node
                    return this.insertFirst(value);
                } else {
                    // If this is not the first node
                    ListNode<T> newNode = new ListNode<T>(value);
                    prev.next = newNode;
                    newNode.next = curr;
                    return newNode;
                }
            } else {
            prev = curr;
            curr = curr.next;
            }
        }
        // we reach the end of the linked list, this
        // value is larger than all other elements in the list
        ListNode<T> newNode = new ListNode<T>(value);
        prev.next = newNode;
        return newNode;
    }

    public void displayList() {
        System.out.print("Linked List: ");
        ListNode<T> current = pHead; // start of list

        // loop through until end of list

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next; // move to next link
        }
        System.out.println();
    }

    // This method returns true if list if empty, false
    // otherwise
    public boolean isEmpty() {
        return (pHead == null);
    }

    // This method removes the first node from the linked
    // list and returns the reference to the deleted node.
    public ListNode<T> deleteFirst() {
        ListNode<T> p = null;
        // check if list is not empty
        if (!isEmpty()) {
            p = pHead;
            pHead = pHead.next;
            p.next = null;
        }
        return p;
    }

    // This method searches the linked list for a node
    // with a specified key value and returns a reference
    // to that node
    public ListNode<T> find(T key) {
        ListNode<T> p = pHead;
        // if list is empty
        if (p == null)
            return null;

        while (p.data != key) {
            if (p.next == null) // if end of list
                return null; // not found
            else
                p = p.next;
        }
        return p; // find it
    }

    // This method will first search the linked list
    // for the node with a specified key value, using
    // the find method, and insert a new node with
    // the given value.
    public ListNode<T> insertAfter(T key, T value) {
        ListNode<T> p = find(key);
        // if list is empty or key not found,
        // insert fail
        if (p == null)
            return null;
        ListNode<T> newNode = new ListNode<T>(value);
        newNode.next = p.next;
        p.next = newNode;
        return newNode;
    }

    // This method deletes the node from the linked
    // link with the specified key value.
    public ListNode<T> delete(T key) {
        ListNode<T> curr = pHead;
        ListNode<T> prev = pHead;

        if (curr == null) // if list is empty
            return null;

        while (curr.data != key) {
            if (curr.next == null) // if end of list
                return null; // not found
            else {
                prev = curr;
                curr = curr.next;
            }
        }
        // find it
        if (curr == pHead) // if the first node
            pHead = pHead.next;
        else
            prev.next = curr.next;
        // set the next ref to null
        curr.next = null;
        return curr;
    }
    
    
}
