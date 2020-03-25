package d3;

import java.util.Scanner;

public class 석찬이의받아쓰기9317 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int tc=1;tc<=testcase;tc++) {
			int N=sc.nextInt();
			String a = sc.next();
			char array_a[] = new char[N];
			array_a = a.toCharArray();
			String b = sc.next();
			char array_b[] = new char[N];
			array_b = b.toCharArray();
			int count=0;
			for(int i=0;i<N;i++) {
				if(array_a[i] == array_b[i]) count++;
			}
			System.out.println("#"+tc+" "+count);
 		}
	}

}
