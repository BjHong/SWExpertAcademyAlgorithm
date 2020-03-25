package d3;

import java.util.Scanner;

public class 홀수일까짝수일까5549 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int tc=1;tc<=testcase;tc++) {
			String a = sc.next();
			int b = a.charAt(a.length()-1)-'0';
			if(b%2==0) System.out.println("#"+tc+" "+"Even");
			else if(b%2!=0) System.out.println("#"+tc+" "+"Odd");
		}
	}

}
