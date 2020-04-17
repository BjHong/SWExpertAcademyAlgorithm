package d4;

import java.util.Scanner;
import d4.Triple;


public class 다항식계산9659 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int tc=1;tc<=testcase;tc++) {
			int N=sc.nextInt();
			Triple array[] = new Triple[N+1];
			for(int i=2;i<=N;i++) {
				int t=sc.nextInt();
				int a=sc.nextInt();
				int b=sc.nextInt();
				array[i] = new Triple(t,a,b);
			}
			int M=sc.nextInt();
			long answer[] = new long[M];
			for(int i=0;i<M;i++) {
				int beta = sc.nextInt();
				long ramda[] = new long[N+1];
				ramda[0]=1;
				ramda[1] = beta;
				for(int j=2;j<=N;j++) {
					if(array[j].x==1) {
						ramda[j] = ramda[array[j].y] + ramda[array[j].z];
					}
					else if(array[j].x==2) {
						ramda[j] = array[j].y*ramda[array[j].z];
					}
					else if(array[j].x==3) {
						ramda[j] = ramda[array[j].y] * ramda[array[j].z];
					}
					ramda[j] %= 998244353;
				}
				answer[i] = ramda[N];
			}
			System.out.print("#"+tc+" ");
			for(int i=0;i<M;i++) {
				System.out.print(answer[i]+" ");
			}
			System.out.println();
		}
	}

}
