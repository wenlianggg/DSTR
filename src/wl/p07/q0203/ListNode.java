package wl.p07.q0203;

// A node in the linked list consists of integer 
// data item and a reference to next node 
// in a singly-linked list

public class ListNode<T extends Comparable<T>> {
    // T extends Comparable<T> ensures
    // that all elements of type T in the listNodes are 
    // implementing the Comparable interface
    // therefore, we can use the .compareTo() method
    T data;             
    ListNode<T> next;           
    
    // Constructor  
    public ListNode (T value) {     
        data = value;       
        next = null;    
    }
}
