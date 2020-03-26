package d3;

import java.util.Scanner;

public class USB꽂기의미스터리9700 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int tc=1;tc<=testcase;tc++) {
			double p=sc.nextDouble();
			double q=sc.nextDouble();
			
			double s1 = 0;
			s1 = (1-p)*q;
			double s2 = 0;
			s2 = p*(1-q)*q;
			
			if(s1<s2) System.out.println("#"+tc+" YES");
			else System.out.println("#"+tc+" NO");
		}
	}

}
