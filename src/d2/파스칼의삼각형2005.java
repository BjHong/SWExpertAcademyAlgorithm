package d2;

import java.util.Scanner;

public class 파스칼의삼각형2005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int tc=1;tc<=testcase;tc++) {
			int N = sc.nextInt();
			int array[][] = new int[N][N];
			array[0][0] = 1;
			int brray[][] = new int[N][N];
			brray[0][0] = 1;
			System.out.println("#"+tc);
			System.out.println(brray[0][0]+" ");
			for(int i=1;i<N;i++) {
				for(int j=0;j<=i;j++) {
					if(j==0) {
						brray[i][j] = 1;
					}else if(j>0){
						brray[i][j] = brray[i-1][j] + brray[i-1][j-1];
					}
					System.out.print(brray[i][j]+" ");
				}
				System.out.println();
			}
		}

	}

}
