package d3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class 안경이없어7272 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		ArrayList<Character> arraylist = new ArrayList<>();
		arraylist.add('A');
		arraylist.add('D');
		arraylist.add('O');
		arraylist.add('P');
		arraylist.add('Q');
		arraylist.add('R');
		for(int tc=1;tc<=testcase;tc++) {
			String a = sc.next();
			String b = sc.next();
			if(a.length()!=b.length()) System.out.println("#"+tc+" "+"DIFF");
			else {
				int flag = 0;
				for(int i=0;i<a.length();i++) {
					char c = a.charAt(i);
					char d = b.charAt(i);
					if(arraylist.contains(c) && arraylist.contains(d)) continue;
					else if(c=='B' && d=='B') continue;
					else if(!arraylist.contains(c) && !arraylist.contains(d) && c!='B' && d!='B') continue;
					else {
						flag =1;
						System.out.println("#"+tc+" "+"DIFF");
						break;
					}
				}
				if(flag == 0) {
					System.out.println("#"+tc+" "+"SAME");
				}
			}
		}
	}

}
