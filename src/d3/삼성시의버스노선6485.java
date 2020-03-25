package d3;

import java.util.Scanner;

public class 삼성시의버스노선6485 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int tc=1;tc<=testcase;tc++) {
			int busStop[] = new int[5001];
			int N=sc.nextInt();
			for(int i=0;i<N;i++) {
				int A=sc.nextInt();
				int B=sc.nextInt();
				for(int j=A;j<=B;j++) {
					busStop[j]++;
				}
			}
			int P = sc.nextInt();
			System.out.print("#"+tc+" ");
			for(int i=0;i<P;i++) {
				int a = sc.nextInt();
				System.out.print(busStop[a]);
				if(i==P-1) break;
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
