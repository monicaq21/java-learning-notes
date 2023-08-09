package java_2_notes;

import java.util.LinkedList;
import java.util.Scanner;

public class ClassZ13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		//		input r as how many rows
		//		input c as how many columns
		//		input r amount of strings
		//		store all the string into 2D charArray a


		LinkedList<Integer> rowQ = new LinkedList<Integer>();
		LinkedList<Integer> colQ = new LinkedList<Integer>();

		//map stores all the input values
		//step stores the number of steps to the location

		//store the values
		int r = sc.nextInt();
		int c = sc.nextInt();
		char[][] map = new char[c][r];
		for (int i=0; i<c; i++){
			String k = sc.nextLine();
			map[i] = k.toCharArray();
		}

		//make all the steps max numbers
		int[][] step = new int [r][c];
		for (int i=0; i<r; i++){
			for (int l=0; l<c; l++){
				step[i][l] = 999;
			}
		}

		//add initial position to the queue
		//the initial position is E, so it is 0 step.
		for (int i=0; i<r; i++){
			for (int l=0; l<c; l++){
				if (map[i][l]=='E'){
					rowQ.add(i);
					colQ.add(l);
					step[i][l] = 0;
					break;
				}
			}
		}


		//record the number of steps to all the positions.
		while (!rowQ.isEmpty()){
			int row = rowQ.pop();
			int col = colQ.pop();


			if (map[row+1][col]!='T' && row+1<r && step[row+1][col]>step[row][col]+1){
				step[row+1][col]=step[row][col]+1;
				rowQ.add(row+1);
				colQ.add(col);

			}
			if (map[row-1][col]!='T' && row-1>=0 && step[row-1][col]>step[row][col]+1){
				step[row+1][col]=step[row][col]+1;
				rowQ.add(row-1);
				colQ.add(col);
			}
			if (map[row][col+1]!='T' && col+1<c && step[row][col+1]>step[row][col]+1){
				step[row+1][col]=step[row][col]+1;
				rowQ.add(row);
				colQ.add(col+1);
			}
			if (map[row][col-1]!='T' && col-1>=0 && step[row][col+1]>step[row][col]+1){
				step[row+1][col]=step[row][col]+1;
				rowQ.add(row);
				colQ.add(col-1);
			}


		}

		int b = 0;
		int er = 0;
		int ec = 0;
		for (int i=0; i<r; i++){
			for (int l=0; l<c; l++){
				if (map[i][l]=='S'){
					er = i;
					ec = l;
					break;
				}
			}
		}
		for (int i=0; i<r; i++){
			for (int l=0; l<c; l++){
				if (map[i][l]<10 && i<=er && l<=ec){
					b = b+map[i][l];
				}
			}
		}
		System.out.println(b);



	}

}
