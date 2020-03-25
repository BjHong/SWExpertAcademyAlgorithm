package d3;

import java.util.Scanner;

public class SW문제해결기본3일차회문1_1215 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for(int tc=1;tc<=10;tc++) {
			int N=sc.nextInt();
			char array[][] = new char[8][8];
			for(int i=0;i<8;i++) {
				String a = sc.next();
				for(int j=0;j<8;j++) {
					array[i][j] = a.charAt(j);
				}
			}
			char check[] = new char[N];
			int cnt=0;
			for(int i=0;i<8;i++) {
				for(int j=0;j<=8-N;j++) {
					int p=0;
					int alpha=0;
					for(int k=0;k<N;k++) {
						check[k] = array[i][j+p];
						p++;
					}
					for(int k=0;k<N;k++) {
						if(check[k] != check[N-k-1]) {
							alpha=1;
							break;
						}
					}
					if(alpha==0) cnt++;
				}
			}
			
			for(int i=0;i<=8-N;i++) {
				for(int j=0;j<8;j++) {
					int p=0;
					int alpha=0;
					for(int k=0;k<N;k++) {
						check[k] = array[i+p][j];
						p++;
					}
					for(int k=0;k<N;k++) {
						if(check[k] != check[N-k-1]) {
							alpha=1;
							break;
						}
					}
					if(alpha==0) cnt++;
				}
			}
			System.out.println("#"+tc+" "+cnt);
			
		}

	}

}
