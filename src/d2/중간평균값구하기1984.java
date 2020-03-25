package d2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 중간평균값구하기1984 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testcase=sc.nextInt();
		for(int tc=1;tc<=testcase;tc++) {
			Integer num[]=new Integer[10];
			for(int i=0;i<10;i++) {
				num[i] = sc.nextInt();
			}
			Arrays.sort(num);
			for(int i=0;i<9;i++) {
				num[i] = num[i+1];
			}
			num[9]=0;
			Arrays.sort(num,Collections.reverseOrder());
			for(int i=0;i<8;i++) {
				num[i]=num[i+1];
			}
			num[8]=0;
			int sum=0;
			for(int i=0;i<8;i++) {
				sum+=num[i];
			}
			
			double avg = (double)sum / 8;
			System.out.println("#"+tc+" "+Math.round(avg));
		}

	}

}
