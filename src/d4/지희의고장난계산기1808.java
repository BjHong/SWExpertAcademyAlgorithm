package d4;

import java.util.Scanner;

public class 지희의고장난계산기1808 {
	static int X,tc;
	static int number[];
	static int array[];
	static boolean check[];
	static boolean checkInside[];
	static int min;
	static int firstNum,firstClick;
	static int beta;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for( tc=1;tc<=testcase;tc++) {
			number = new int[10];
			int count=0;
			for(int i=0;i<10;i++) {
				number[i] = sc.nextInt();
				if(number[i] == 1) {
					count++;
				}
			}
			X=sc.nextInt();
			array = new int[count];
			int alpha=0;
			for(int i=0;i<10;i++) {
				if(number[i]==1) {
					array[alpha] = i;
					alpha++;
				}
			}
			
			check = new boolean[array.length];
			checkInside = new boolean[array.length];
			min = Integer.MAX_VALUE;
			beta = 0;
			repowerset(0);
		}
	}
	static void repowerset(int idx) {
		if(idx == array.length) {
			int ten = 1;
			firstNum = 0;
			firstClick = 0;
			for(int i=array.length-1;i>=0;i--) {
				if(check[i]) {
					firstNum += array[i] * ten;
					ten*=10;
					firstClick++;
				}
			}
			if(firstNum == X && min>firstClick+1) {
				beta = 1;
				min = Math.min(min, firstClick+1);
				return;
			}
		}
//		if(!check[idx]) check[idx] = true;
		repowerset(idx+1);
//		check[idx] = false;
		repowerset(idx);
	}

}
