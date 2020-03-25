package d3;

import java.util.Scanner;

public class 두수의덧셈3260 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int tc=1;tc<=testcase;tc++) {
			String a = sc.next();
			String b = sc.next();
			if(a.length() >= b.length()) {
				long arraya[] = new long[a.length()];
				for(int i=0;i<a.length();i++) {
					arraya[i] = a.charAt(i)-'0';
				}
				long arrayb[] = new long[a.length()];
				int p=b.length();
				for(int i=a.length()-1;i>=a.length()-b.length();i--) {
					arrayb[i] = b.charAt(p-1)-'0';
					p--;
				}
				long arrayc[] = new long[a.length()];
				int alpha=0;
				for(int i=a.length()-1;i>=0;i--) {
					arrayc[i] = arraya[i] + arrayb[i] + alpha;
					if(alpha==1) alpha=0;
					if(arrayc[i]>=10) {
						arrayc[i] -= 10;
						alpha=1;
					}
				}
			}
			else {
				long arraya[] = new long[b.length()];
				for(int i=0;i<a.length();i++) {
					arraya[i] = a.charAt(i)-'0';
				}
				long arrayb[] = new long[b.length()];
				for(int i=0;i<b.length();i++) {
					arrayb[i] = b.charAt(i)-'0';
				}
				long arrayc[] = new long[b.length()];
			}
			
			if(a.length() > b.length()) {
				
			}
			System.out.println("#"+tc+" "+(a.);
		}
	}

}
