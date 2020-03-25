package d3;

import java.util.LinkedList;
import java.util.Scanner;

public class SW문제해결기본10일차비밀번호_1234 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for(int tc=1;tc<=10;tc++) {
			int N=sc.nextInt();
			LinkedList<Integer> list = new LinkedList<>();
			String a = sc.next();
			for(int i=0;i<N;i++) {
				int d = a.charAt(i)-'0';
				list.add(d);
			}
			for(int i=0;i<N-1;i++) {
				if(list.get(i) == list.get(i+1)) {
					list.remove(i);
					list.remove(i);
					N-=2;
					i=-1;
				}
			}
			System.out.print("#"+tc+" ");
			for(int i=0;i<N;i++) {
				System.out.print(list.get(i));
			}
			System.out.println();
		}

	}

}
