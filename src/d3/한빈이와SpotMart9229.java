package d3;

import java.util.Scanner;

public class 한빈이와SpotMart9229 {
	static int N,M;
	static int array[];
	static int result[];
	static boolean check[];
	static int max;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int tc=1;tc<=testcase;tc++) {
			N=sc.nextInt();
			M=sc.nextInt();
			array = new int[N];
			result = new int[2];
			check = new boolean[array.length];
			max = -1;
			for(int i=0;i<N;i++) {
				array[i] = sc.nextInt();
			}
			comb(0,0);
			System.out.println("#"+tc+" "+max);
		}
	}
	static void comb(int idx,int good) {
		if(good == result.length) {
			int sum = 0;
			sum+=result[0] + result[1];
			if(sum<=M && max<=sum) {
				max = Math.max(max, sum);
			}
			return;
		}
		if(idx == array.length) return;
		result[good] = array[idx];
		comb(idx+1,good+1);
		comb(idx+1,good);
	}

}
