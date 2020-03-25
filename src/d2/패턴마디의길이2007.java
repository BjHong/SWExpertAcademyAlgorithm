package d2;

import java.util.Scanner;

public class 패턴마디의길이2007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int tc=1;tc<=testcase;tc++) {
			String letter = sc.next();
			char word[]=new char[letter.length()];
			word=letter.toCharArray();
			int count=0;
			int k=0;
			for(int i=1;i<30;i++) {
				if(word[0]==word[i]) {
					if(word[1]==word[i+1]) {
						k=i;
						break;
					}
				}
			}
			
			System.out.println("#"+tc+" "+k);
		}

	}

}
