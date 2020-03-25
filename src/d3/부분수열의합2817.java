package d3;

import java.util.Scanner;

public class 부분수열의합2817 {
	static int N,K;
	static int array[];
	static boolean check[];
	static int answer;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int tc=1;tc<=testcase;tc++) {
			N=sc.nextInt();
			K=sc.nextInt();
			array = new int[N];
			check = new boolean[N];
			answer = 0;
			for(int i=0;i<N;i++) {
				array[i] = sc.nextInt();
			}
			powerset(0);
			System.out.println("#"+tc+" "+answer);
			
		}
	}
	static void powerset(int idx) {
		if(idx == array.length) {
			int sum = 0;
			for(int i=0;i<N;i++) {
				if(check[i]) {
					sum+=array[i];
				}
			}
			if(sum == K) answer++;
			return;
		}
		if(!check[idx]) check[idx] =true;
		powerset(idx+1);
		check[idx] = false;
		powerset(idx+1);
	}

}
