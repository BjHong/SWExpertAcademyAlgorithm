package d3;

import java.util.Scanner;

public class 모음이보이지않는사람4406 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int tc=1;tc<=testcase;tc++) {
			String a = sc.next()
					.replace("a","")
					.replace("e","")
					.replace("i","")
					.replace("o","")
					.replace("u","");
			
			int count=0;
			System.out.println("#"+tc+" "+a);

		}
	}

}
