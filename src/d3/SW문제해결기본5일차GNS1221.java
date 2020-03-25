package d3;

import java.util.Scanner;

public class SW문제해결기본5일차GNS1221 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int tc=1;tc<=testcase;tc++) {
			String trash = sc.next();
			int N=sc.nextInt();
			int array[] = new int[10];
			for(int i=0;i<N;i++) {
				String a = sc.next();
				switch(a) {
				case "ZRO":
					array[0]++;
					break;
				case "ONE":
					array[1]++;
					break;
				case "TWO":
					array[2]++;
					break;
				case "THR":
					array[3]++;
					break;
				case "FOR":
					array[4]++;
					break;
				case "FIV":
					array[5]++;
					break;
				case "SIX":
					array[6]++;
					break;
				case "SVN":
					array[7]++;
					break;
				case "EGT":
					array[8]++;
					break;
				case "NIN":
					array[9]++;
					break;
					
				}
			}
			System.out.println("#"+tc);
			for(int i=0;i<10;i++) {
				for(int j=0;j<array[i];j++) {
					switch(i) {
					case 0:
						System.out.print("ZRO"+" ");
						break;
					case 1:
						System.out.print("ONE"+" ");
						break;
					case 2:
						System.out.print("TWO"+" ");
						break;
					case 3:
						System.out.print("THR"+" ");
						break;
					case 4:
						System.out.print("FOR"+" ");
						break;
					case 5:
						System.out.print("FIV"+" ");
						break;
					case 6:
						System.out.print("SIX"+" ");
						break;
					case 7:
						System.out.print("SVN"+" ");
						break;
					case 8:
						System.out.print("EGT"+" ");
						break;
					case 9:
						System.out.print("NIN"+" ");
						break;
					}
				}
			}
			System.out.println();
		}

	}

}
