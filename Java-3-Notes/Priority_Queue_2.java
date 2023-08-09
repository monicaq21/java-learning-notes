package java_3_notes;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Priority_Queue_2 {

	//create a rectangle class
	//create 4 rectangle objects and store into priority queue
	//output the area from least to greatest

	//class means it can be accessed anywhere
	public static class Rectangle implements Comparable<Rectangle>{
		double L;
		double W;
		public Rectangle (double l, double w){
			L=l;
			W=w;
		}
		public double area() {
			return L*W;
		}
		
		public int compareTo(Rectangle o){
			if (this.area()<o.area()){
				return -1;
			} else if (this.area()==o.area()){
				return 0;
			} else {
				return 1;
			}
		}
	}
	

	//constructor


	//method


	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		PriorityQueue<Rectangle> queue = new PriorityQueue <Rectangle>();
		queue.add(new Rectangle(9,4));
		queue.add(new Rectangle(6,9));
		queue.add(new Rectangle(6,6));
		queue.add(new Rectangle(8,5));
		while (!queue.isEmpty()){
			Rectangle r = queue.poll();
			System.out.println(r.L+" "+r.W+" "+r.area());
		}




	}

}