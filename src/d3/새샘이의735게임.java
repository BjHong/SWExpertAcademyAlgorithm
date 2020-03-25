package d3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 새샘이의735게임 {
	static int array[];
	static int result[];
	static Integer answer[];
	static int k;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int tc=1;tc<=testcase;tc++) {
			array = new int[7];
			result = new int[3];
			answer = new Integer[35];
			Arrays.fill(answer, 0);
			k=0;
			for(int i=0;i<array.length;i++) {
				array[i] = sc.nextInt();
			}
			comb(0,0);
			Arrays.sort(answer,Collections.reverseOrder());
//			System.out.println(Arrays.toString(answer));
			int p=0;
			int tmp=0;
			int count=0;
			while(count!=5) {
				if(p==0) {
					tmp = answer[p];
					p++;
					count++;
				}
				else {
					if(answer[p]!=tmp) {
						tmp = answer[p];
						p++;
						count++;
					}
					else {
						p++;
					}
				}
			}
			System.out.println("#"+tc+" "+answer[p-1]);
			
		}
	}
	static void comb(int idx,int good) {
		if(good==result.length) {
			int sum=0;
			for(int i=0;i<result.length;i++) {
				sum+=result[i];
			}
			answer[k] = sum;
			k++;
			return;
		}
		if(idx==array.length) return;
		result[good] = array[idx];
		comb(idx+1,good+1);
		comb(idx+1,good);
	}

}
