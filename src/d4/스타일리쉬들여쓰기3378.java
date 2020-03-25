package d4;

import java.util.Scanner;

public class 스타일리쉬들여쓰기3378 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int tc=1;tc<=testcase;tc++) {
			int p=sc.nextInt();
			int q=sc.nextInt();
			int a = 0;
			int b = 0;
			int c = 0;
			int d = 0;
			int e = 0;
			int f = 0;
			
			int R=0;
			int C=0;
			int Y=0;
			
			int point=0;
			for(int i=0;i<p;i++) {
				String str = sc.next();
				for(int j=0;j<str.length();j++) {
					if(str.charAt(j)=='(') a++;
					else if(str.charAt(j)==')') b++;
					else if(str.charAt(j)=='{') c++;
					else if(str.charAt(j)=='}') d++;
					else if(str.charAt(j)=='[') e++;
					else if(str.charAt(j)==']') f++;
				}
				for(int j=0;j<str.length();j++) {
					if(str.charAt(j)=='.') point++;
					else break;
				}
			}
		}
	}
}
