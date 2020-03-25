package d3;

import java.util.ArrayList;
import java.util.Scanner;

public class 북북서8556 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int tc=1;tc<=testcase;tc++) {
			String a = sc.next();
			ArrayList<Integer> list = new ArrayList<>();
			for(int i=0;i<a.length();i++) {
				if(a.charAt(i) == 'n') {
					list.add(0);
					i = i+4;
				}
				else if(a.charAt(i) == 'w') {
					list.add(1);
					i = i+3;
				}
			}
//			System.out.println(list.size());
//			for(int i=0;i<list.size();i++) {
//				System.out.print(list.get(i)+" ");
//			}
//			System.out.println();
			double dir = 0;
			int k=1;
			for(int i=list.size()-1;i>=0;i--) {
				if(i == list.size()-1) {
					if(list.get(i) == 0) {
						dir = 0;
					}
					else {
						dir = 90;
					}
				}
				else {
					if(list.get(i) == 0) {
						double num = (double) Math.pow(2, k);
						dir = dir - (double)(90/num);
						k++;
					}
					else {
						double num = (double) Math.pow(2, k);
						dir = dir + (double)(90/num);
						k++;
					}
				}
			}
			int mother = 0;
			int son = 1;
			if(dir%1 == 0) {
				mother = (int)dir;
				System.out.println("#"+tc+" "+mother);
			}
			else {
				while(true) {
					dir *=2;
					son *= 2;
					if(dir%1 == 0) {
						mother = (int)dir;
						System.out.println("#"+tc+" "+mother+"/"+son);
						break;
					}
				}
			}
			
		}
	}

}
