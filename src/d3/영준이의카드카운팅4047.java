package d3;

import java.util.Scanner;

public class 영준이의카드카운팅4047 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int tc=1;tc<=testcase;tc++) {
			String a = sc.next();
			int S[] = new int[13];
			int s_count = 13;
			int H[] = new int[13];
			int h_count = 13;
			int D[] = new int[13];
			int d_count = 13;
			int C[] = new int[13];
			int c_count = 13;
			int error=0;
			for(int i=0;i<a.length();i+=3) {
				int first = a.charAt(i+1)-'0';
				int last = a.charAt(i+2)-'0';
				int num=0;
				if(first==0) num = last;
				else num = last+10;
				switch(a.charAt(i)) {
				case 'S':
					if(S[num-1]==1) {
						error=1;
					}
					S[num-1]++;
					s_count--;
					break;
				case 'H':
					if(H[num-1]==1) {
						error=1;
					}
					H[num-1]++;
					h_count--;
					break;
				case 'D':
					if(D[num-1]==1) {
						error=1;
					}
					D[num-1]++;
					d_count--;
					break;
				case 'C':
					if(C[num-1]==1) {
						error=1;
					}
					C[num-1]++;
					c_count--;
					break;
				}
			}
			if(error==1) System.out.println("#"+tc+" "+"ERROR");
			else System.out.println("#"+tc+" "+s_count+" "+d_count+" "+h_count+" "+c_count);
			
		}
	}

}
