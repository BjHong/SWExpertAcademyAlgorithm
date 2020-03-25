package d3;

import java.util.Scanner;

public class 두가지빵의딜레마5162 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int tc=1;tc<=testcase;tc++) {
			int A=sc.nextInt();
			int B=sc.nextInt();
			int min = Math.min(A, B);
			int C=sc.nextInt();
			int D=C/min;
			System.out.println("#"+tc+" "+D);
		}

	}

}
