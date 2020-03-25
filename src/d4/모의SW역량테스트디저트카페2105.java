package d4;

import java.util.Scanner;

public class 모의SW역량테스트디저트카페2105 {
	static int dr[] = {1,2,1,};
	static int dc[] = {1,0,-1,0};
	static int N;
	static int array[][];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int tc=1;tc<=testcase;tc++) {
			N=sc.nextInt();
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					array[i][j] = sc.nextInt();
				}
			}
		}
	}

}
