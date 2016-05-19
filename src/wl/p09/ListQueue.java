package wl.p09;

// ====================PUBLIC OPERATIONS========================
// void enqueue(x)		--> Insert x
// Object dequeue()		--> Return and remove least recent item
// boolean isEmpty()	--> Return true if empty; else false
// int size()			--> Return the size of the queue
// Object getFront()	--> Return least recently inserted item
//=======================ERRORS==================================
// getFront or dequeue on empty queue

import java.util.*;

public class ListQueue{
	private ListNode front;
	private ListNode rear;
	private int size;
    
	// Construct the queue.
	public ListQueue(){
		front = null;
		rear = null;
		size = 0;
	}
	//=========================================================
	//Insert a new item into the queue.
	//=========================================================
	public void enqueue(Object x){
		if(isEmpty()){    
		// Make queue of one element
		front = new ListNode(x);
			rear = front;
		}
		else{	// Regular case
			rear.next = new ListNode(x);
			rear = rear.next;
		}
		size++;
	}
	//=========================================================
	// Return and remove the least recently inserted item
	// throws NoSuchElementException if the queue is empty.
	//=========================================================
	public Object dequeue(){
		if(isEmpty())
			throw new NoSuchElementException("Queue Empty - " +
					"dequeue");
		Object returnValue = front.element;
		front = front.next;
		size--;
		return returnValue;
	}
	//===========================================================
	// Test if the queue is logically empty.
	//===========================================================
	public boolean isEmpty(){
		return front == null;
	}
	//===========================================================
	// Return the size of the queue.
	//===========================================================
	public int size(){
		return size;
	}
	//===========================================================
	// Get the least recently inserted item in the queue.
	// Does not alter the queue.
	// throws NoSuchElementException if the queue is empty.
	//===========================================================
	public Object getFront(){
		if( isEmpty( ) )
			throw new NoSuchElementException("Queue Empty -" +
						"getFront");
		return front.element;
	}
	//===========================================================
	// View the elements in the queue.
	// part e
	//===========================================================
	public void viewQueue(){
		int index=1;
		ListNode cursor = front;
		while (cursor != null){
			System.out.println("Queue Position " + index + 
						": " + cursor.element);
			cursor = cursor.next;
			index++;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		ListQueue lq = new ListQueue();
		int userinput = 0;
		boolean toBreak = false;
		System.out.print("Queue Operations Menu\n" + 
				"1.      Enqueue\n" +
				"2.      Dequeue\n" +
				"3.      Empty?\n" +
				"4.      Count\n"+
				"5.      View Queue\n" +
				"0.      Exit\n");
		do {
			System.out.print("Enter choice: ");
			try {
				userinput = sc1.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Error!");
			}
			switch(userinput) {
				// Enqueue
				case 1:
					System.out.print("Enter name of person to queue: ");
					String person = sc2.nextLine();
					lq.enqueue(person);
					System.out.println(person + " has been successfully queued");
					break;
				// Dequeue
				case 2:
					System.out.println(lq.dequeue() + " has been removed from the queue");
					break;
				// isEmpty
				case 3:
					System.out.println("Queue is " + (lq.isEmpty() ? "" : "not") + " empty");
					break;
				// Count
				case 4:
					System.out.println("Queue has " + lq.size() + " elements");
					break;
				// View Queue
				case 5:
					System.out.println("Printing queue...");
					lq.viewQueue();
					break;
				// When all else fails...
				default:
					System.out.println("Exiting!!!!!!!!!!!!!!!!!!!!!!");
					toBreak = true;
					break;
			}
			if (toBreak) break;
		} while (userinput > 0 && userinput < 6);
		sc1.close();
		sc2.close();
	}
}
