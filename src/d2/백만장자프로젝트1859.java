package d2;

import java.util.Scanner;

public class 백만장자프로젝트1859 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int tc=1;tc<=testcase;tc++) {
			int N=sc.nextInt();
			int mama[]=new int[N];
			for(int i=0;i<N;i++) {
				mama[i] = sc.nextInt();
			}
			int sum[]=new int[N];
			int pin=0,k=0;
			while(k<N) {
				int big = 0,num=0;
				for(int i=k;i<N;i++) {
					if(big<mama[i]) {
						big=mama[i];
						num=i;
					}
				}
				for(int i=k;i<=num;i++) {
					mama[i] = mama[num]-mama[i];
				}
				k=num+1;
			}
			
			long answer=0;
			for(int i=0;i<k-1;i++) {
				answer+=mama[i];
			}
			System.out.println("#"+tc+" "+answer);
		}
	}
}
