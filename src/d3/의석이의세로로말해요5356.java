package d3;

import java.util.Scanner;

public class 의석이의세로로말해요5356 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int tc=1;tc<=testcase;tc++) {
			char array[][] = new char[5][15];
			for(int i=0;i<5;i++) {
				String a = sc.next();
				for(int j=0;j<a.length();j++) {
					array[i][j] = a.charAt(j);
				}
			}
			System.out.print("#"+tc+" ");
			for(int i=0;i<15;i++) {
				for(int j=0;j<5;j++) {
					if(array[j][i] == '\u0000') continue;
					System.out.print(array[j][i]);
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
