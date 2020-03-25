package d2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class 조교의성적매기기1983 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int tc=1;tc<=testcase;tc++) {
			int numOfPeople = sc.nextInt();
			int numOfStudent = sc.nextInt();
			int score[][] = new int[numOfPeople][3];
			String grade[] = {"A+","A0","A-","B+","B0","B-","C+","C0","C-","D0"};
			String grade_new[] = new String[numOfPeople];
			int count=0;
			for(int i=0;i<10;i++) {
				for(int j=0;j<numOfPeople/10;j++) {
					grade_new[count] = grade[i];
					count++;
				}
			}
			
			for(int i=0;i<numOfPeople;i++) {
				for(int j=0;j<3;j++) {
					score[i][j] = sc.nextInt();
				}
			}
			double sum_score[][] = new double[numOfPeople][3];
			for(int i=0;i<numOfPeople;i++) {
				for(int j=0;j<3;j++) {
					if(j==0) {
						sum_score[i][j] = (double)score[i][j] * 0.35;
					}else if(j==1) {
						sum_score[i][j] = (double)score[i][j] * 0.45;
					}else if(j==2) {
						sum_score[i][j] = (double)score[i][j] * 0.20;
					}
				}
			}
			
			Double sum[] = new Double[numOfPeople];
			int gum[] = new int[numOfPeople];
			double tmp=0;
			for(int i=0;i<numOfPeople;i++) {
				for(int j=0;j<3;j++) {
					tmp+=sum_score[i][j];
				}
				sum[i] = (double)tmp;
				tmp = 0;
			}
			double answer = sum[numOfStudent-1];
			
			Arrays.sort(sum,Collections.reverseOrder());
			for(int i=0;i<numOfPeople;i++) {
				if(answer == sum[i]) {
					answer = i;
				}
			}
			
			System.out.println("#"+tc+" "+grade_new[(int)answer]);
		}
	}

}
