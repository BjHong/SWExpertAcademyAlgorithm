package d2;

import java.util.Scanner;

public class 숫자배열회전1961 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int tc=1;tc<=testcase;tc++) {
			int N=sc.nextInt();
			int array[][]=new int[N][N];
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					array[i][j]=sc.nextInt();
				}
			}
			int array90[][]=new int[N][N];
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					array90[i][j] = array[N-j-1][i];
				}
			}
			
			int array180[][] = new int[N][N];
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					array180[i][j] = array90[N-j-1][i];
				}
			}
			
			int array270[][] = new int[N][N];
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					array270[i][j] = array180[N-j-1][i];
				}
			}
			System.out.println("#"+tc);
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					System.out.print(array90[i][j]);
				}
				System.out.print(" ");
				for(int j=0;j<N;j++) {
					System.out.print(array180[i][j]);
				}
				System.out.print(" ");
				for(int j=0;j<N;j++) {
					System.out.print(array270[i][j]);
				}
				System.out.println();
			}
		}
	}
}
