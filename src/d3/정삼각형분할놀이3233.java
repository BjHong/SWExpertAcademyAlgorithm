package d3;

import java.util.Scanner;

public class 정삼각형분할놀이3233 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int tc=1;tc<=testcase;tc++) {
			long A=sc.nextInt();
			long B=sc.nextInt();
			double A_area = A*A*0.5;
			double B_area = B*B*0.5;
			long answer = (long)(A_area / B_area);
			System.out.println("#"+tc+" "+answer);
		}
	}

}
