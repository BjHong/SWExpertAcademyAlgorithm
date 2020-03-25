package d3;

import java.util.Scanner;

public class SW문제해결기본5일차Magnetic_1220 {
	static int dr[] = {1};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for(int tc=1;tc<=10;tc++) {
			int n = sc.nextInt();
			int count=0;
			int array[][] = new int[n][n];
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					array[i][j] = sc.nextInt();
				}
			}
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if(array[i][j]==1) {
						for(int k=1;k<n;k++) {
							if(i+dr[0]*k>n-1) break;
							if(array[i+dr[0]*k][j]==1) break;
							else if(array[i+dr[0]*k][j]==2) {
								count++;
								break;
							}
						}
					}
				}
			}
			System.out.println("#"+tc+" "+count);
		}

	}

}
