package d3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 최대성적표만들기4466 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int tc=1;tc<=testcase;tc++) {
			int N=sc.nextInt();
			int K=sc.nextInt();
			Integer array[] = new Integer[N];
			for(int i=0;i<N;i++) {
				array[i] = sc.nextInt();
			}
			Arrays.sort(array,Collections.reverseOrder());
			int sum=0;
			for(int i=0;i<K;i++) {
				sum+=array[i];
			}
			System.out.println("#"+tc+" "+sum);
		}

	}

}
