package d3;

import java.util.Scanner;

public class 직사각형과점6853 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int tc=1;tc<=testcase;tc++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			
			int N=sc.nextInt();
			int count1 = 0;
			int count2 = 0;
			int count3 = 0;
			for(int i=0;i<N;i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				if((a<x && x<c) && (b<y && y<d)) {
					count1++;
				}
				else if(((a<=x && x<=c) && y == b) || ((a<=x && x<=c) && y == d)
						|| ((b<=y && y<=d) && x == a) || ((b<=y && y<=d) && x == c)) {
					count2++;
				}
				else {
					count3++;
				}
			}
			System.out.println("#"+tc+" "+count1+" "+count2+" "+count3);
		}
	}

}
