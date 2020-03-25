package d3;

import java.util.Scanner;

public class SW문제해결기본3일차회문2_1216 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int tc=1;tc<=10;tc++) {
			int trash = sc.nextInt();
			char array[][] = new char[100][100];
			for(int i=0;i<100;i++) {
				String str = sc.next();
				for(int j=0;j<100;j++) {
					array[i][j] = str.charAt(j);
				}
			}
			int max = 1;
			
			//garo
			for(int i=0;i<100;i++) {
				for(int j=0;j<100;j++) {
					for(int k=99;k>j;k--) {
						if(array[i][k]==array[i][j]) {
							int alpha=0;
							int count=0;
							int lamda = 0;
							for(int p=j;p<=k;p++) {
								if(array[i][p] == array[i][k-lamda]) {
									if(p>k-lamda) break;
									if(p!=k-lamda) count+=2;
									else if(p==k-lamda){
										count+=1;
										break;
									}
								}else {
									alpha=1;
									break;
								}
								lamda++;
							}
							if(alpha==0) {
								max = Math.max(max, count);
							}
						}
					}
				}
			}
			//sero
			for(int i=0;i<100;i++) {
				for(int j=0;j<100;j++) {
					for(int k=99;k>=j;k--) {
						if(array[k][i]==array[j][i]) {
							int alpha=0;
							int count=0;
							int lamda = 0;
							for(int p=j;p<=k;p++) {
								if(array[p][i] == array[k-lamda][i]) {
									if(p>k-lamda) break;
									if(p!=k-lamda) count+=2;
									else if(p==k-lamda){
										count+=1;
										break;
									}
								}else {
									alpha=1;
									break;
								}
								lamda++;
							}
							if(alpha==0) {
								max = Math.max(max, count);
							}
						}
					}
				}
			}
			System.out.println("#"+tc+" "+max);
		}
	}

}
