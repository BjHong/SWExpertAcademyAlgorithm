package d2;

import java.util.Scanner;

public class 가랏RC카1940 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int tc=1;tc<=testcase;tc++) {
			int a=sc.nextInt();
			int b=0,c=0;
			int sum=0;
			int v=0;
			for(int i=0;i<a;i++) {
				b=sc.nextInt();
				if(b!=0) {
					c=sc.nextInt();
				}
				
				if(b==0) {
					sum+=v;
				}
				else if(b==1) {
					v=v+c;
					sum+=v;
				}else if(b==2) {
					if(c>v) {
						v=0;
					}else {
						v=v-c;
					}
					sum+=v;
				}
			}
			System.out.println("#"+tc+" "+sum);
		}
	}
}
