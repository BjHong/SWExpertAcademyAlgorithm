package d3;

import java.util.Scanner;

public class 햄버거다이어트5215 {
	static int N,L;
	static int T[];
	static int K[];
	static boolean check[];
	static int max;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int tc=1;tc<=testcase;tc++) {
			N=sc.nextInt();
			L=sc.nextInt();
			T = new int[N];
			K = new int[N];
			for(int i=0;i<N;i++) {
				T[i] = sc.nextInt();
				K[i] = sc.nextInt();
			}
			check = new boolean[N];
			max = Integer.MIN_VALUE;
			powerset(0);
			System.out.println("#"+tc+" "+max);
		}
	}
	static void powerset(int idx) {
		int Tsum = 0;
		int Ksum = 0;
		if(idx == check.length) {
			for(int i=0;i<N;i++) {
				if(check[i]) {
					Tsum+=T[i];
					Ksum+=K[i];
				}
			}
			if(Ksum<=L && max < Tsum) {
				max = Math.max(max, Tsum);
			}
			return;
		}
		if(!check[idx])check[idx] = true;
		powerset(idx+1);
		check[idx] = false;
		powerset(idx+1);
	}

}
