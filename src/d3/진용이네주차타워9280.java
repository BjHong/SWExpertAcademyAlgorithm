package d3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Pair {
	int x;
	int y;

	Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class 진용이네주차타워9280 {
	static int n, m;
	static int spacefee[];
	static int weightOfCar[];
	static int orderOfCar[];
	static int answer;
	static boolean check[];
	static ArrayList<Pair> list;
	static Queue<Integer> queue;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for (int tc = 1; tc <= testcase; tc++) {
			n = sc.nextInt();
			m = sc.nextInt();
			spacefee = new int[n];
			weightOfCar = new int[m + 1];
			orderOfCar = new int[2 * m];
			for (int i = 0; i < n; i++) {
				spacefee[i] = sc.nextInt();
			}
			for (int i = 1; i <= m; i++) {
				weightOfCar[i] = sc.nextInt();
			}
			for (int i = 0; i < 2 * m; i++) {
				orderOfCar[i] = sc.nextInt();
			}
			answer = 0;
			check = new boolean[n];
			list = new ArrayList<>();
			queue = new LinkedList<>();
			for (int i = 0; i < 2 * m; i++) {
				if (orderOfCar[i] > 0) {
					for (int j = 0; j < n; j++) {
						if (!check[j]) {
							answer += weightOfCar[orderOfCar[i]] * spacefee[j];
							check[j] = true;
							list.add(new Pair(j, orderOfCar[i]));
//							System.out.println(answer);
							break;
						}
						if (j == n - 1) {
							queue.add(orderOfCar[i]);
						}
					}
				} else {
					orderOfCar[i] = Math.abs(orderOfCar[i]);
					for (int j = 0;; j++) {
						if (list.get(j).y == orderOfCar[i]) {
							if (!queue.isEmpty()) {
								answer += weightOfCar[queue.peek()] * spacefee[list.get(j).x];
								list.add(new Pair(list.get(j).x, queue.poll()));
//								System.out.println(answer);
								break;
							} else {
								check[list.get(j).x] = false;
								list.remove(j);
								break;
							}
						}
					}

				}
			}
			System.out.println("#" + tc + " " + answer);
		}
	}

}
