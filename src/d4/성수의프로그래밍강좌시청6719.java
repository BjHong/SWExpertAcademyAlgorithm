package d4;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 성수의프로그래밍강좌시청6719 {
	static int N,K;
	static Integer array[];
	static float skill;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int tc=1;tc<=testcase;tc++) {
			N=sc.nextInt();
			K=sc.nextInt();
			array = new Integer[N];
			skill = 0;
			for(int i=0;i<N;i++) {
				array[i] = sc.nextInt();
			}
			Arrays.sort(array,Collections.reverseOrder());
			for(int i=K-1;i>=0;i--) {
				float tmp = 0;
				tmp =((skill+array[i])/2);
				skill = tmp;
			}
			String str = String.format("%.6f", skill);
			System.out.println("#"+tc+" "+str);
		}
	}

}
