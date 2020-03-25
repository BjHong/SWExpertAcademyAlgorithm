package d3;

import java.util.Scanner;

public class 성공적인공연기획4789 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int tc=1;tc<=testcase;tc++) {
			String a = sc.next();
			int array[] = new int[a.length()];
			for(int i=0;i<a.length();i++) {
				array[i] = a.charAt(i)-'0';
			}
			int answer = 0;
			int people = array[0];
			
			for(int i=1;i<a.length();i++) {
				if(array[i]!=0) {
					if(people>=i) {
						people+=array[i];
					}
					else {
						answer+=i - people;
						people = i+array[i];
					}					
				}
			}
			System.out.println("#"+tc+" "+answer);
		}
	}

}
