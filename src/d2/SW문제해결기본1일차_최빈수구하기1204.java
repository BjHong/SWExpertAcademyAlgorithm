package d2;

import java.util.Scanner;

public class SW문제해결기본1일차_최빈수구하기1204 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int tc=1;tc<=testcase;tc++) {
			int score[]=new int[101];
			int garbage = sc.nextInt();
			for(int i=0;i<1000;i++) {
				score[sc.nextInt()]++;
			}
			int big=0;
			int num=0;
			for(int i=0;i<101;i++) {
				if(big<=score[i]) {
					big=score[i];
					num=i;
				}
			}
			System.out.println("#"+tc+" "+num);
		}

	}

}
