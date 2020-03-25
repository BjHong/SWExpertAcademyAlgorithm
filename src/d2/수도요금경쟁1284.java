package d2;

import java.util.Scanner;

public class 수도요금경쟁1284 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int tc = 1;tc<=testcase;tc++) {
			int P=sc.nextInt();
			int Q=sc.nextInt();
			int R=sc.nextInt();
			int S=sc.nextInt();
			int W=sc.nextInt();
			
			int acom=P*W;
			int bcom=0;
			if(R>=W) {
				bcom=Q;
			}else {
				bcom=Q+S*(W-R);
			}
			if(acom>bcom) {
				System.out.println("#"+tc+" "+bcom);
			}else {
				System.out.println("#"+tc+" "+acom);
			}
		}
	}

}
