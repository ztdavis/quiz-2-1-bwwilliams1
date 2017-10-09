package shapes;

public class Circle extends Shape {
	private double radius;
	
	/*
	 * Complete the implementation of this class by finishing the constructor
	 * below.  Circles cannot have a negative radius.
	 */
	public Circle(double radius) throws IllegalArgumentException {
		this.radius = radius;// constructs circle with a radius length
		
		//checks if radius is not negative
		if(radius <= 0){
			throw new IllegalArgumentException("Impossible Bounds");
		}
	}
	
	public double calculateArea(){
		double area = 3.14 * radius * radius;
		return area;
	}
	
	public double getRadius() {
		return radius;
	}
}
