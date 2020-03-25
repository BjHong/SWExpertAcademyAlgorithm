package d3;

import java.util.Scanner;

public class 영준이와신비한뿔의숲3142 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int tc=1;tc<=testcase;tc++) {
			int N=sc.nextInt();
			int M=sc.nextInt();
			int twin = 2;
			int one = 1;
			int answer_one = 0;
			int answer_twin = 0;
			for(int i=0;i<=M;i++) {
				if(one*i + twin*(M-i) ==N) {
					answer_one = i;
					answer_twin = M-i;
				}
			}
			System.out.println("#"+tc+" "+answer_one+" "+answer_twin);
		}

	}

}
