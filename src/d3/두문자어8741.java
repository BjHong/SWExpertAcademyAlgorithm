package d3;

import java.util.Scanner;

public class 두문자어8741 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int tc = 1;tc<=testcase;tc++) {
			char asplit[] =new char[3];
			for(int i=0;i<3;i++) {
				String a = sc.next();
				asplit[i] = a.toUpperCase().charAt(0);
			}
			System.out.print("#"+tc+" ");
			for(int i=0;i<3;i++) {
				System.out.print(asplit[i]);
			}
			System.out.println();
				
		}

	}

}
