package d3;

import java.util.Scanner;

public class 부먹왕국의차원관문7964 {
	static int dr[] = {1,-1};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int tc=1;tc<=testcase;tc++) {
			int N=sc.nextInt();
			int D=sc.nextInt();
			int array[] = new int[N];
			for(int i=0;i<N;i++) {
				array[i] = sc.nextInt();
			}
			int count=0;
			for(int i=0;i<N;i++) {
				if(array[i]==1) {
					int alpha=0;
					if(D!=1) {
						for(int j=1;j<D;j++) {
							if(i+j==N-1) {
								alpha=1;
								i+=j-1;
								break;
							}
							if(array[i+j]==1) {
								alpha=1;
								i+=j-1;
								break;
							}
						}						
					}
					if(alpha==0) {
						if(array[i+D]==0) {
							array[i+D]=1;
							count++;
							i+=D-1;
						}
						else i+=D-1;
					}
				}else if(array[i]==0) {
					int alpha=0;
					for(int j=0;j<=D-1;j++) {
						if(array[i+j]==1) {
							alpha=1;
							i+=j-1;
							break;
						}
					}
					if(alpha==0) {
						if(array[i+D]==0) {
							count++;
							i+=D-1;
						}
						else i+=D-1;
					}
				}
			}
			System.out.println("#"+tc+" "+count);
		}
	}

}
