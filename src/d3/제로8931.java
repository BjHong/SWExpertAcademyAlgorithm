package d3;

import java.util.Scanner;

public class 제로8931 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int tc=1;tc<=testcase;tc++) {
			int K=sc.nextInt();
			int array[] = new int[K];
			int alpha=0;
			for(int i=0;i<K;i++) {
				int a = sc.nextInt();
				if(a==0) {
					alpha--;
					array[alpha] = a;
				}
				else {
					array[alpha] = a;
					alpha++;					
				}
			}
			int sum=0;
			for(int i=0;i<K;i++) {
				sum+=array[i];
			}
			System.out.println("#"+tc+" "+sum);
			
		}

	}

}
