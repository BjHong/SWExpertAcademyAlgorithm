package d3;

import java.util.Scanner;

public class 원재의메모리복구하기1289 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testcase=sc.nextInt();
		for(int tc=1;tc<=testcase;tc++) {
			String a=sc.next();
			char c[]=new char[a.length()];
			c=a.toCharArray();
			int count=0;
			if(c[0]=='1') {
				count++;
			}
			int k=0;
			while(k<c.length-1) {
				if(c[k]!=c[k+1]) {
					count++;
				}
				k++;
			}
			System.out.println("#"+tc+" "+count);
		}
	}
}
