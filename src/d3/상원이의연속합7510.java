package d3;

import java.util.Scanner;

public class 상원이의연속합7510 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int tc=1;tc<=testcase;tc++) {
			int N=sc.nextInt();
			int count=0;
			for(int i=1;i<=N;i++) {
				int sum=0;
				for(int j=i;j<=N;j++) {
					sum+=j;
					if(sum==N) {
						count++;
						break;
					}
					if(sum>N) break;
				}
			}
			System.out.println("#"+tc+" "+count);
		}

	}

}
