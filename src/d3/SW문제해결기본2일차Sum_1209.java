package d3;

import java.util.Scanner;

public class SW문제해결기본2일차Sum_1209 {
	static int dx[] = {1,-1};
	static int dy[] = {1,1};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for(int tc=1;tc<=10;tc++) {
			int N = sc.nextInt();
			int array[][] = new int[100][100];
			for(int i=0;i<100;i++) {
				for(int j=0;j<100;j++) {
					array[i][j] = sc.nextInt();
				}
			}
			int answer = 0;
			for(int i=0;i<100;i++) {
				int max=0;
				for(int j=0;j<100;j++) {
					max += array[i][j];
				}
				if(max>answer) {
					answer = max;
				}
			}
			System.out.println(answer);
			int back=0;
			for(int i=0;i<100;i++) {
				int max=0;
				for(int j=0;j<100;j++) {
					max += array[j][i];
				}
				if(max>answer) {
					answer = max;
				}
				if(max>back) {
					back = max;
				}
			}
			System.out.println(back);
			
			int max=0;
			for(int i=0;i<100;i++) {
					max+=array[0+dx[0]*i][0+dy[0]*i];
			}
			if(max>answer) {
				answer = max;
			}
			max=0;
			for(int i=0;i<100;i++) {
				max+=array[99+dx[1]*i][0+dy[1]*i];
			}
			if(max>answer) {
				answer = max;
			}
			System.out.println("#"+tc+" "+answer);
			
		}

	}

}
