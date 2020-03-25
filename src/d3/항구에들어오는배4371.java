package d3;

import java.util.Scanner;

public class 항구에들어오는배4371 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int tc=1;tc<=testcase;tc++) {
			int N=sc.nextInt();
			int array[] = new int[N];
			for(int i=0;i<N;i++) {
				array[i] = sc.nextInt();
			}
			char check[] = new char[1000000000];
			int count = 0;
			for(int i=0;i<N;i++) {
				int a = array[i];
				if(check[a]!='\u0000') continue;
				if(a!=1) count++;
				for(int j=a;j<=array[N-1];j+=a-1) {
					check[j] = 'a';
					if(a == 1) break;
				}
			}
			System.out.println("#"+tc+" "+count);
		}
	}

}
