package wl.p07.q0203;

public class TestBookList {

	public static void main(String[] args) {
		System.out.println("--------- Question 2 --------");
		LinkedList<Book> list = new LinkedList<Book>();
		ListNode<Book> p;
		Book john = new Book("1234", "John");
		Book eric = new Book("5678", "Eric");
		Book phoon = new Book("9999", "Phoon");

		list.insertFirst(john);
		list.insertFirst(eric);

		list.displayList(); // Print the contents

		p = list.find(phoon);
		if (p != null)
			System.out.println("Found");
		else
			System.out.println("Not Found");
		
		
		System.out.println("--------- Question 3 --------");
		LinkedList<Book> list3 = new LinkedList<Book>();
		Book john3 = new Book("1234", "John");
		Book eric3 = new Book("5678", "Eric");
		Book fred3 = new Book("1111", "Fred");
		Book ang3 = new Book("5555", "Ang");
		Book phoon3 = new Book("9999", "Phoon");
		
		list3.insertInOrder(john3);
		list3.displayList();
		list3.insertInOrder(eric3);
		list3.displayList();
		list3.insertInOrder(fred3);
		list3.displayList();
		list3.insertInOrder(ang3);
		list3.displayList();
		list3.insertInOrder(phoon3);
		list3.displayList();

		list3.displayList();
	}
}
