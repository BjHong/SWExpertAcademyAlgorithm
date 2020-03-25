package d2;

import java.util.Scanner;

public class 어디에단어가들어갈수있을까1979 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int tc=1;tc<=testcase;tc++) {
			int N=sc.nextInt();
			int K=sc.nextInt();
			
			int array[][] = new int[N][N];
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					array[i][j] = sc.nextInt();
				}
			}
			int answer=0;
			
			for(int i=0;i<N;i++) {
				int count=0;
				boolean check = false;
				for(int j=0;j<N;j++) {
					if(check==false&&array[i][j]==1) {
						check = true;
						count++;
					}else if(check==true&&array[i][j]==1) {
						count++;
					}else if(check==true&&array[i][j]==0) {
						if(count==K) {
							answer++;
						}
						check=false;
						count=0;
					}
				}
				if(count==K) {
					answer++;
				}
			}
			
			for(int i=0;i<N;i++) {
				int count=0;
				boolean check = false;
				for(int j=0;j<N;j++) {
					if(check==false&&array[j][i]==1) {
						check = true;
						count++;
					}else if(check==true&&array[j][i]==1) {
						count++;
					}else if(check==true&&array[j][i]==0) {
						if(count==K) {
							answer++;
						}
						check=false;
						count=0;
					}
				}
				if(count==K) {
					answer++;
				}
			}
			System.out.println("#"+tc+" "+answer);
		}

	}

}
