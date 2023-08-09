import java.io.*;
import java.util.*;

public class Linesweep {

	public static class point implements Comparable<point>{
		int d;
		double r;
		public point(int D, double R){
			d=D;
			r=R;
		}
		@Override
		public int compareTo(point o) {
			// TODO Auto-generated method stub
			if (this.r-o.r>0) return 1;
			else if (this.r==o.r) return 0;
			else return -1;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Eyes of Void:
		//https://dmoj.ca/problem/tc18summere
		FastReader sc = new FastReader();
		int n = sc.nextInt(), c = sc.nextInt();
		
		point[] list = new point[n];

		for (int i=0; i<n; i++){
			int d=sc.nextInt(),x=sc.nextInt(),y=sc.nextInt();
			double r = Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
			list[i] = new point(d,r);
		}

		Arrays.sort(list);

		double max = 0;
		int dam = 0;
		for (int i=0; i<n; i++){
			//from 0 to i are all within the circle
			dam += list[i].d;
			if (i<n-1&&list[i+1].r==list[i].r) continue;
			max = Math.max(max, dam-c*Math.pow(list[i].r, 2));
		}
		System.out.println((int)(max+0.5));


	}

	static class FastReader
	{
		BufferedReader br;
		StringTokenizer st;
		public FastReader() {
			br = new BufferedReader(new
					InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				}
				catch (IOException  e)
				{
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt()
		{
			return Integer.parseInt(next());
		}

		long nextLong()
		{
			return Long.parseLong(next());
		}

		double nextDouble()
		{
			return Double.parseDouble(next());
		}

		String nextLine()
		{
			String str = "";
			try
			{
				str = br.readLine();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
			return str;
		}
	}

}
