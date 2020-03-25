package d3;

import java.util.Scanner;

public class 민정이와광직이의알파벳공부9480 {
	static int N;
	static String array[];
	static boolean check[];
	static int result;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int tc=1;tc<=testcase;tc++) {
			N=sc.nextInt();
			array = new String[N];
			check = new boolean[N];
			result=0;
			for(int i=0;i<N;i++) {
				array[i] = sc.next();
			}
			powerset(0);
			System.out.println("#"+tc+" "+result);
		}
	}
	static void powerset(int idx) {
		if(idx == array.length) {
			int alphabet[] = new int[26];
			for(int i=0;i<N;i++) {
				if(check[i]) {
					for(int j=0;j<array[i].length();j++) {
						alphabet[array[i].charAt(j) - 'a'] = 1;
					}
				}
			}
			int alpha = 0;
			for(int i=0;i<26;i++) {
				if(alphabet[i] == 0) {
					alpha=1;
				}
			}
			if(alpha == 0) result++;
			return;
		}
		if(!check[idx]) check[idx] = true;
		powerset(idx+1);
		check[idx] = false;
		powerset(idx+1);
	}

}
