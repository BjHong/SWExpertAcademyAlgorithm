package d2;

import java.util.Scanner;

public class 시각덧셈1976 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int tc = 1;tc<=testcase;tc++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			int d=sc.nextInt();
			
			int minute = b+d;
			if(minute>60) {
				c++;
				minute-=60;
			}
			int hour = a+c;
			if(hour>=12) {
				hour-=12;
			}
			System.out.println("#"+tc+" "+hour+" "+minute);
		}

	}

}
