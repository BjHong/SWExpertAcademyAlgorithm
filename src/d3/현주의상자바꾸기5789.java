package d3;

import java.util.Scanner;

public class 현주의상자바꾸기5789 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int tc=1;tc<=testcase;tc++) {
			int N=sc.nextInt();
			int Q=sc.nextInt();
			int array[] = new int[N];
			for(int i=1;i<=Q;i++) {
				int L=sc.nextInt();
				int R=sc.nextInt();
				for(int j=L-1;j<=R-1;j++) {
					array[j] = i;
				}
			}
			System.out.print("#"+tc+" ");
			for(int i=0;i<N;i++) {
				System.out.print(array[i]+" ");
			}
			System.out.println();
		}

	}

}
