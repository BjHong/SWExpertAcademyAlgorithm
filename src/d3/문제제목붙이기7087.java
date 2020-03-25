package d3;

import java.util.Scanner;

public class 문제제목붙이기7087 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int tc=1;tc<=testcase;tc++) {
			int N=sc.nextInt();
			String array[] = new String[N];
			int alpha[] = new int[26];
			for(int i=0;i<N;i++) {
				array[i] = sc.next();
				alpha[array[i].charAt(0)-'A']++;
			}
			int count=0;
			for(int i=0;i<26;i++) {
				if(alpha[i]!=0) count++;
				else break;
			}
			System.out.println("#"+tc+" "+count);
		}
	}

}
