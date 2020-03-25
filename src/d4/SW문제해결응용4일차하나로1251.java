package d4;

import java.util.ArrayList;
import java.util.Scanner;
class Pair{
	int x;
	int y;
	Pair(int x,int y){
		this.x=x;
		this.y=y;
	}
}

public class SW문제해결응용4일차하나로1251 {
	static int N;
	static double E;
	static int array[];
	static int result[];
	static boolean check[];
	static int point_x[];
	static int point_y[];
	static long answer;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int tc=1;tc<=testcase;tc++) {
//			double good = sc.nextDouble();
			N=sc.nextInt();
//			array = new int[N];
//			result = new int[N];
			check = new boolean[N];
			answer = Integer.MAX_VALUE;
//			for(int i=0;i<N;i++) {
//				array[i] = i;
//			}
			point_x = new int[N];
			point_y = new int[N];
			for(int i=0;i<N;i++) {
				point_x[i] = sc.nextInt();
			}
			for(int i=0;i<N;i++) {
				point_y[i] = sc.nextInt();
			}
			E = sc.nextDouble();
//			perm(0);
			ArrayList<Pair> list = new ArrayList<>();
			list.add(new Pair(point_x[0] , point_y[0]));
			check[0] = true;
			for(int i=0;i<N;i++) {
				int min=Integer.MAX_VALUE;
				int remember = 0;
				for(int j=0;j<N;j++) {
					if(!check[j]) {
						long a = (long)Math.pow(Math.abs(point_x[i] - point_x[j]), 2);
						long b = (long)Math.pow(Math.abs(point_y[i] - point_y[j]), 2);
						if(min>a+b) {
							min = Math.min(min, (int)(a+b));
							remember = j;
						}						
					}
				}
				list.add(new Pair(point_x[remember] , point_y[remember]));
				check[remember] = true;
			}
			
			
			
			System.out.println("#"+tc+" "+answer);
		}
	}
//	static void perm(int idx) {
//		if(idx == result.length) {
//			double sum = 0;
//			for(int i=1;i<result.length;i++) {
//				double a = Math.pow(Math.abs(point_x[result[i]] - point_x[result[i-1]]), 2);
//				double b = Math.pow(Math.abs(point_y[result[i]] - point_y[result[i-1]]), 2);
//				sum +=E * (a+b);
//			}
//			sum = Math.round(sum);
//			answer =Math.round(Math.min(sum, answer));
//			return;
//		}
//		for(int i=0;i<array.length;i++) {
//			if(!check[i]) {
//				check[i] = true;
//				result[idx] = array[i];
//				perm(idx+1);
//				check[i] = false;
//			}
//		}
//	}

}
