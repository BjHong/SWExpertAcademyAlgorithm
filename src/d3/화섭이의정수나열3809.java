package d3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class 화섭이의정수나열3809 {
	static int N;
	static int array[];
	static boolean check[];
	static Set<Integer> set;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int tc=1;tc<=testcase;tc++) {
			N=sc.nextInt();
			array = new int[N];
			check = new boolean[N];
			set = new HashSet<>();
			for(int i=0;i<N;i++) {
				array[i] = sc.nextInt();
			}
			int good=0;
			int k=1;
			int alpha=1;
			int beta=1;
			int result=0;
			boolean loop = true;
			while(loop) {
				for(int i=N-1;i>=0;i--) {
					int sum=0;
					int p=1;
					for(int j=i;j>i-k;j--) {
						sum+=array[j]*p;
						p*=10;
					}
					set.add(sum);
				}
				if(!set.contains(0)) {
					result = 0;
					loop = false;
				}
				else {
					for(int i=beta;i<=beta*10;i++) {
						if(!set.contains(i)) {
							result = i;
							loop=false;
							break;
						}
					}					
				}
				beta*=10;
				k++;
			}
			System.out.println("#"+tc+" "+result);
		}
	}
//	static void powerset(int idx) {
//		if(idx==N) {
//			int p=1;
//			int sum=0;
//			for(int i=N-1;i>=0;i--) {
//				if(check[i]) {
//					sum+=array[i] * p;
//					p*=10;
//				}
//				set.add(sum);
//			}
//			return;
//		}
//		if(!check[idx]) check[idx] = true;
//		powerset(idx+1);
//		check[idx] = false;
//		powerset(idx+1);
//	}

}
