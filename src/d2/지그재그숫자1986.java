package d2;

import java.util.Scanner;

public class 지그재그숫자1986 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testcase=sc.nextInt();
		for(int tc=1;tc<=testcase;tc++) {
			int num=sc.nextInt();
			int sum=0;
			for(int i=1;i<=num;i++) {
				if(i%2!=0) {
					sum+=i;
				}else {
					sum-=i;
				}
			}
			System.out.println("#"+tc+" "+sum);
		}

	}

}
