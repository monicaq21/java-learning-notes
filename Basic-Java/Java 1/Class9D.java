package java_1_notes;

public class Class9D {
	
	//Circles
	//Area = pi*r*r
	//Circumference = 2*pi*r
	//Create radius
	public double radius;
	
	//Constructor
	public Class9D(double r){
		radius = r;
	}
	
	//Method
	public double calculateArea() {
		return radius*radius*Math.PI;
	}
	public double calculateCircumference() {
		return radius*2*Math.PI;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class9D circle = new Class9D(6);
		System.out.println(circle.calculateArea());
		System.out.println(circle.calculateCircumference());
		
		
	}

}
