package wl.p04.q02;

public class MammalNoise {
	public static void main(String[] args) {
		Dog roy = new Dog();
		Cat james = new Cat();
		System.out.println("Dog noise is: " + roy.makeNoise() + " " + roy.makeNoise());
		System.out.println("Cat noise is: " + james.makeNoise() + " " + james.makeNoise());
	}
}
