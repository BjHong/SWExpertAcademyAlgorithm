package d3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class 다솔이의월급상자6691 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int tc=1;tc<=testcase;tc++) {
			DecimalFormat form = new DecimalFormat("#.######");
			int N=sc.nextInt();
			double sum=0;
			for(int i=0;i<N;i++) {
				double a = sc.nextDouble();
				int b = sc.nextInt();
				sum+=a*(double)b;
			}
			String p = String.format("%.6f",sum);
			System.out.println("#"+tc+" "+p);
		}

	}

}
