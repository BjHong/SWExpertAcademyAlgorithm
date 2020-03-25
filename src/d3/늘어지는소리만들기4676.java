package d3;

import java.util.LinkedList;
import java.util.Scanner;

public class 늘어지는소리만들기4676 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int tc=1;tc<=testcase;tc++) {
			String a = sc.next();
			int H=sc.nextInt();
			int term = a.length()+H;
//			char array[] = new char[term];
			LinkedList<Character> linklist = new LinkedList<>();
			for(int i=0;i<a.length();i++) {
				linklist.add(a.charAt(i));
			}
			for(int i=0;i<H;i++) {
				int n=sc.nextInt();
				int count=0;
				if(n==0) {
					linklist.addFirst('-');
					continue;
				}
				for(int j=0;j<a.length()+i;j++) {
					if(linklist.get(j)!='-') count++;
					if(count==n) {
						linklist.add(j+1,'-');
						break;
					}
				}
			}
			System.out.print("#"+tc+" ");
			for(int i=0;i<term;i++) {
				System.out.print(linklist.get(i));
			}
			System.out.println();
		}

	}

}
