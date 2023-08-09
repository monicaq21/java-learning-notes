package java_1_notes;

public class Class9HW1 {
	
	//Square
	public double side;
	
	public Class9HW1(double s){
		side = s;
	}
	
	public double calculateArea(){
		return side*side;
	}
	public double calculatePerimeter(){
		return side*4;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Class9HW1 square = new Class9HW1(5);
		System.out.println(square.calculateArea());
		System.out.println(square.calculatePerimeter());
		
	}

}
