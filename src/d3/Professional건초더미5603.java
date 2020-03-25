package d3;

import java.util.Scanner;

public class Professional건초더미5603 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int tc = 1;tc<=testcase;tc++) {
			int N = sc.nextInt();
			int array [] = new int[N];
			int sum = 0;
			for(int i=0;i<N;i++) {
				array[i] = sc.nextInt();
				sum+=array[i];
			}
			int avg = sum/N;
			int count=0;
			for(int i=0;i<N;i++) {
				while(array[i]<avg) {
					array[i]++;
					count++;
				}
			}
			System.out.println("#"+tc+" "+count);
		}

	}

}
