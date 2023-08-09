package java_1_notes;

public class Class9C {

	//Part 1
	//Data Member:
	//public type name;
	//Create length & width for a rectangle
	public double length;
	public double width;

	//Constructor
	//it gives the format to execute a method
	public Class9C(double l, double w){
		length = l;
		width = w;
	}

	//Method:
	//public returnType name;
	//calculateArea & calculatePerimeter
	public double calculateArea(){
		return length*width;
	}
	public double calculatePerimeter(){
		return 2*(length+width);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Part 2
		Class9C rect = new Class9C(2,3);
		System.out.println(rect.calculateArea());
		System.out.println(rect.calculatePerimeter());



	}

}
