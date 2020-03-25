package d2;

import java.util.Arrays;
import java.util.Scanner;

public class 숫자를정렬하자1966 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int tc=1;tc<=testcase;tc++) {
			int num=sc.nextInt();
			int num_array[] = new int[num];
			for(int i=0;i<num;i++) {
				num_array[i]=sc.nextInt();
			}
			Arrays.sort(num_array);
			System.out.print("#"+tc+" ");
			for(int i=0;i<num;i++) {
				System.out.print(num_array[i]+" ");
			}
			System.out.println();
		}

	}

}
