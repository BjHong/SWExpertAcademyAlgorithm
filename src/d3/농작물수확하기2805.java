package d3;

import java.util.Scanner;

public class 농작물수확하기2805 {
	static int dx[] = {1,-1};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int tc=1;tc<=testcase;tc++) {
			int N=sc.nextInt();
			int array[][] = new int[N][N];
			char array_char[][] = new char[N][N];
			String array_string[] = new String[N];
			for(int i=0;i<N;i++) {
				array_string[i] = sc.next();
			}
			int p=0;
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					array_char[i][j] = array_string[i].charAt(p);
					p++;
				}
				p=0;
			}
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					array[i][j] = (int)(array_char[i][j] - '0');
				}
			}
			int sum=0;
			for(int i=0;i<N/2;i++) {
				for(int j=0;j<=(i*2+1)/2;j++) {
					for(int k=0;k<2;k++) {
						if(j==0) {
							sum+=array[i][N/2];
							break;
						}
						sum+=array[i][N/2+dx[k]*(j)];
					}
				}
			}
			for(int i=0;i<N;i++) {
				sum+=array[N/2][i];
			}
			int d=0;
			for(int i=N-1;i>=N/2+1;i--) {
				for(int j=0;j<=(d*2+1)/2;j++) {
					for(int k=0;k<2;k++) {
						if(j==0) {
							sum+=array[i][N/2];
							break;
						}
						sum+=array[i][N/2+dx[k]*(j)];
					}
				}
				d++;
			}
			System.out.println("#"+tc+" "+sum);
			
		}

	}

}
