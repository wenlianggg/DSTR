package wl.p04.q02;

import java.util.ArrayList;

public class AnyMammalNoise {
	public static void main(String[] args) {
		Dog roy = new Dog();
		Cat james = new Cat();
		ArrayList<Mammal> mamarr = new ArrayList<Mammal>();
		mamarr.add(roy);
		mamarr.add(james);
		for(Mammal mam : mamarr)
		System.out.println("Mammal noise is: " + mam.makeNoise() + " " + mam.makeNoise());
	}
}
