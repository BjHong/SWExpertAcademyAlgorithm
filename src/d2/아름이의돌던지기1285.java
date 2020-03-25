package d2;

import java.util.Scanner;

public class 아름이의돌던지기1285 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testcase=sc.nextInt();
		for(int tc=1;tc<=testcase;tc++) {
			int people = sc.nextInt();
			int array[] = new int[people];
			for(int i=0;i<people;i++) {
				array[i] = sc.nextInt();
			}
			int min=100000;
			int count=0;
			for(int i=0;i<people;i++) {
				if(min>=Math.abs(array[i])) {
					min=Math.abs(array[i]);
				}
			}
			for(int i=0;i<people;i++) {
				if(Math.abs(array[i])==min) {
					count++;
				}
			}
			System.out.println("#"+tc+" "+min+" "+count);
			
		}

	}

}
