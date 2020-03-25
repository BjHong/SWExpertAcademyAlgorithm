package d2;

import java.util.Scanner;

public class 날짜계산기1948 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int tc=1;tc<=testcase;tc++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			int d=sc.nextInt();
			
			int day = d-b+1;
			int sum=0;
			for(int i=a;i<c;i++) {
				if(i==1||i==3||i==5||i==7||i==8||i==10||i==12) {
					sum+=31;
				}else if(i==2) {
					sum+=28;
				}else {
					sum+=30;
				}
			}
			System.out.println("#"+tc+" "+(sum+day));
		}

	}

}
