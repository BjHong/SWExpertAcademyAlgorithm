package d2;

import java.util.Scanner;

public class 파리퇴치2001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int tc=1;tc<=testcase;tc++) {
			int N=sc.nextInt();
			int M=sc.nextInt();
			int Narray[][]=new int[N][N];
			int Marray[][]=new int[M][M];
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					Narray[i][j]=sc.nextInt();
				}
			}

			int p=0,k=0,answer=0,q=0;
			while(true) {
				int sum=0;
				for(int i=0;i<M;i++) {
					for(int j=0;j<M;j++) {
						Marray[i][j] = Narray[i+q][j+k];
						sum+=Marray[i][j];
					}
				}
				if(answer<sum) {
					answer=sum;
				}
				k++;
				if(k>N-M) {
					k=0;
					q++;
				}
				if(q>N-M) {
					break;
				}
				
			}
			System.out.println("#"+tc+" "+answer);
		}
	}

}
