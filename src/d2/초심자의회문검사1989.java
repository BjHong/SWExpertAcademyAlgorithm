package d2;

import java.util.Arrays;
import java.util.Scanner;

public class 초심자의회문검사1989 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int tc=1;tc<=testcase;tc++) {
			String word = sc.next();
			char firstword[]=new char[word.length()];
			firstword=word.toCharArray();
			
			char secondword[]=new char[word.length()];
			int k=word.length()-1;
			int count=0;
			
			for(int i=0;i<(firstword.length);i++) {
				secondword[i]=firstword[k];
				k--;
			}
			for(int i=0;i<firstword.length;i++) {
				if(firstword[i]==secondword[i]) {
					count++;
				}
			}
			if(count==firstword.length) {
				System.out.println("#"+tc+" "+1);
			}else{
				System.out.println("#"+tc+" "+0);
			}
		}

	}

}
