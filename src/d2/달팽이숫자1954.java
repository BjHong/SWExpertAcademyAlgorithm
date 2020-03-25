package d2;

import java.util.Scanner;

public class 달팽이숫자1954 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int tc=1;tc<=testcase;tc++) {
			int num=sc.nextInt();
			int array[][]=new int[num][num];
			int cnt=1;
			int k=0;
			int p=0,j=0;
			for(int i=num;i>0;i-=2) {
				for(j=0;j<i;j++) {
					array[k][k+j] = cnt;
					cnt++;
				}
				for(p=1;p<i;p++) {
					array[k+p][num-k-1] = cnt;
					cnt++;
				}
				for(j=1;j<i;j++) {
					array[k+p-1][num-k-j-1] = cnt;
					cnt++;
				}
				for(j=1;j<i-1;j++) {
					array[num-k-j-1][k] = cnt;
					cnt++;
				}
				k++;
			}
			System.out.println("#"+tc);
			for(p=0;p<num;p++) {
				for(j=0;j<num;j++) {
					System.out.print(array[p][j]+" ");
				}
				System.out.println();
			}
			
		}

	}

}
