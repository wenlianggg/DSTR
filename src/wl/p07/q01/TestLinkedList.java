package wl.p07.q01;

import wl.p07.q01.LinkedList;

// Sample code for creating and printing the linked list.
public class TestLinkedList{
	public static void main (String[] args){
		LinkedList ll = new LinkedList();
		ll.insertFirst(1);
		ll.insertFirst(2);
		ll.insertFirst(3);
		ll.insertFirst(4);
		ll.insertFirst(5);
		ll.insertFirst(6);
		ll.insertFirst(7);
		ll.insertFirst(8);
		ll.insertFirst(9);
		ll.insertFirst(10);
		ll.displayList();
		ll.delete(10);
		System.out.println("Deleted Node: 10");

		finder(ll, 5);
		finder(ll, 20);
		System.out.println("Before inserting...");
		ll.displayList();
		
		ll.insertAfter(5, 20);
		System.out.println("Inserted Node: 20");
		System.out.println("After inserting...");

		ll.displayList();
		
		System.out.println("Before deleting...");
		ll.displayList();
		ll.delete(5);
		System.out.println("Deleted Node: 5");
		System.out.println("After deleting...");
		ll.displayList();
	}
	
	
	public static void finder(LinkedList ll, int toFind) {
		if (ll.find(toFind) != null)
			System.out.println("Found Node: " + ll.find(toFind).data);
		else
			System.out.println("No such node: " + toFind);
	}
}
