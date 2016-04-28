package wl.p04.q01;

public class Circle implements Shape {
	
	double radius = 0;
	
	public Circle(double radius) {
		setRadius(radius);
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI*Math.pow(radius, 2);
	}

	@Override
	public String getName() {
		return "Circle";
	}

}
