package d2;

import java.util.Scanner;

public class 간단한압축풀기1946 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int tc=1;tc<=testcase;tc++) {
			int N = sc.nextInt();
//			String c[][] = new String[N][2];
//			for(int i=0;i<N;i++) {
//				for(int j=0;j<2;j++) {
//					c[i][j] = sc.next();
//				}
//			}
			String d[]=new String[N];
			int e[]=new int[N];
			int sum=0;
			for(int i=0;i<N;i++) {
				d[i] = sc.next();
				e[i] = sc.nextInt();
				sum+=e[i];
			}
			String array[][] = new String[sum/10+1][10];
			int a=0,k=0,p=0;
				while(true){
					array[k][p] = d[a];
					e[a]--;
					p++;
					if(e[a]==0) {
						if(e[N-1]==0) {
							break;
						}else {
							a++;							
						}
					}
					if(p==10) {
						k++;
						p=0;
					}
				}
				int get_count=0;
				System.out.println("#"+tc);
				for(int i=0;i<sum/10+1;i++) {
					for(int j=0;j<10;j++) {
						System.out.print(array[i][j]);
						get_count++;
						if(get_count==sum) {
							break;
						}
					}
					System.out.println();
				}
				
		}

	}

}
