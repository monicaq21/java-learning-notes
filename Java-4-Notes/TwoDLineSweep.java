package java_4_notes;

import java.util.*;
import java.io.*;

public class TwoDLineSweep {
	
	//tinted glass
	
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
	
	public static class line implements Comparable<line>{
		int y, xstart, xend, tint;
		public line(int _y,int _xstart,int _xend,int _tint){
			y = _y; xstart = _xstart; xend = _xend; tint = _tint;
		}
		@Override
		public int compareTo(line o) {
			// TODO Auto-generated method stub
			return y-o.y;
		}
	}
	
	public static class point implements Comparable<point>{
		int index, state;
		public point(int _index, int _state){
			index = _index; state = _state;
		}
		@Override
		public int compareTo(point o) {
			// TODO Auto-generated method stub
			if (index==o.index) return o.state-state;
			return index-o.index;
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FastReader sc = new FastReader();
		
		int n = sc.nextInt(), t = sc.nextInt();
		
		line[] lines = new line[n*2];
		
		//first linesweep
		for (int i=0; i<n; i++){
			int x1=sc.nextInt(),y1=sc.nextInt(),x2=sc.nextInt(),y2=sc.nextInt(),tint=sc.nextInt();
			//this time try storing it horizontally
			lines[i*2] = new line(y1,x1,x2,tint);
			lines[i*2+1] = new line(y2,x1,x2,-tint);
		}
		
		Arrays.sort(lines);
		
		
		//second linesweep
		
		ArrayList<point> points = new ArrayList<point>();
		long sum = 0, area = 0;
		for (int i=0; i<lines.length-1; i++){
			//loop through important y's based on the lines 
			sum = 0;
			line l = lines[i];
			points.add(new point(l.xstart,l.tint));
			points.add(new point(l.xend,-l.tint));
			Collections.sort(points);
			//loop through the current "important y"
			for (int w=0; w<points.size()-1; w++){
				sum += points.get(w).state;
				if (sum>=t){
					area += 1L*(points.get(w+1).index-points.get(w).index) * (lines[i+1].y-lines[i].y);
				}
			}
		}
		
		System.out.println(area);
		
		
	}

}
