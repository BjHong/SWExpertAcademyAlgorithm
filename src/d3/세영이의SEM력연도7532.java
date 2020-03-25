package d3;

import java.util.Scanner;

public class 세영이의SEM력연도7532 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int tc=1;tc<=testcase;tc++) {
			int S=sc.nextInt();
			int E=sc.nextInt();
			int M=sc.nextInt();
			int count=0;
			int a=0;
			int b=0;
			int c=0;
			while(true) {
				a++;
				if(a>365) a=1;
				b++;
				if(b>24) b=1;
				c++;
				if(c>29) c=1;
				count++;
				if(a==S&&b==E&&c==M) break;
			}
			System.out.println("#"+tc+" "+count);
		}

	}

}
