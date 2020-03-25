package d3;

import java.util.LinkedList;
import java.util.Scanner;

public class SW문제해결기본8일차암호문2_1229 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for (int tc = 1; tc <= 10; tc++) {
			int N = sc.nextInt();
			LinkedList<Integer> list = new LinkedList<>();
			for (int i = 0; i < N; i++) {
				list.add(sc.nextInt());
			}

			int M = sc.nextInt();
			for (int i = 0; i < M; i++) {
				char a = sc.next().charAt(0);
				if (a == 'I') {
					int x = sc.nextInt();
					int y = sc.nextInt();
					for (int j = 0; j < y; j++) {
						Integer d =sc.nextInt();
						list.add(x+j,d);
					}
				} else if (a == 'D') {
					int x = sc.nextInt();
					int y = sc.nextInt();
					for (int j = 0; j < y; j++) {
						list.remove(x);
					}
				} 
//				else if (a == 'A') {
//					int y = sc.nextInt();
//					for (int j = 0; j < y; j++) {
//						list.addLast(sc.nextInt());
//					}
//				}
			}
			System.out.print("#" + tc + " ");
			for (int i = 0; i < 10; i++) {
				System.out.print(list.getFirst() + " ");
				list.removeFirst();
			}
			System.out.println();
		}

	}

}
