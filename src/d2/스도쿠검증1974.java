package d2;

import java.util.Scanner;

public class 스도쿠검증1974 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testcase=sc.nextInt();
		for(int tc=1;tc<=testcase;tc++) {
			int array[][]=new int[9][9];
			for(int i=0;i<9;i++) {
				for(int j=0;j<9;j++) {
					array[i][j] = sc.nextInt();
				}
			}
			boolean check_col[][]=new boolean[9][9];
			boolean check_row[][]=new boolean[9][9];
			boolean check_box[][]=new boolean[9][9];
			int count = 0;
			int count_row=0;
			int count_box=0;
			for(int i=0;i<9;i++) {
				for(int j=0;j<9;j++) {
					if(check_col[i][array[i][j]-1] == false) {
						check_col[i][array[i][j]-1]=true;
						count++;
//						System.out.println(count);
					}
					if(check_row[array[j][i]-1][i]==false) {
						check_row[array[j][i]-1][i]=true;
						count_row++;
//						System.out.println(count_row);
					}
				}
			}
			int k=3,p=3,result=0;
			while(k<12) {
				int sum=0;
				for(int i=k-3;i<k;i++) {
					for(int j=p-3;j<p;j++) {
						sum+=array[i][j];
					}
				}
				if(sum==45) {
					result++;
					p+=3;
					if(p==12) {
						p=3;
						k+=3;
					}
				}else {
					result=0;
					break;
				}
			}
			
			
			
			
			if(count==81&&count_row==81&&result==9) {
				System.out.println("#"+tc+" "+1);
				
			}else {
				System.out.println("#"+tc+" "+0);
			}
		}

	}

}
