package d5;

import java.util.Arrays;
import java.util.Scanner;

class Pair {
	int x;
	int y;

	Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class 오나의여신님7793 {
	static int dr[] = { -1, 0, 1, 0 };
	static int dc[] = { 0, 1, 0, -1 };
	static int N, M;
	static char array[][];
	static char new_array[][];
	static int sy_x, sy_y, tg_x, tg_y, dv_x, dv_y;
//	static boolean check[][];
//	static Queue<Pair> queue;
	static int count;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for (int tc = 1; tc <= testcase; tc++) {
			N = sc.nextInt();
			M = sc.nextInt();
			array = new char[N][M];
			new_array = new char[N][M];
			count = 1;
			for (int i = 0; i < N; i++) {
				String str = sc.next();
				for (int j = 0; j < M; j++) {
					array[i][j] = str.charAt(j);
					if (array[i][j] == 'S') {
						sy_x = i;
						sy_y = j;
					} else if (array[i][j] == 'D') {
						tg_x = i;
						tg_y = j;
					} else if (array[i][j] == '*') {
						dv_x = i;
						dv_y = j;
					}
				}
			}
			new_array[tg_x][tg_y] = 'D';
			int beta = 0;
			int answer = 0;
			int time = 0;
			boolean flag = true;
			while (flag) {
				// skill activated
				time++;
				for (int i = 0; i < N; i++) {
					for (int j = 0; j < M; j++) {
						if (array[i][j] == '*') {
							new_array[i][j] = '*';
							for (int k = 0; k < 4; k++) {
								if (i + dr[k] < 0 || j + dc[k] < 0 || i + dr[k] > N - 1 || j + dc[k] > M - 1)
									continue;
								if (array[i + dr[k]][j + dc[k]] == 'D' || array[i + dr[k]][j + dc[k]] == 'X')
									continue;
								if (array[i + dr[k]][j + dc[k]] == '.' || array[i + dr[k]][j + dc[k]] == 'S') {
									new_array[i + dr[k]][j + dc[k]] = '*';
								}
							}
						} else if (array[i][j] == 'X')
							new_array[i][j] = 'X';
					}
				}
				// sy have to run
				for (int i = 0; i < N; i++) {
					for (int j = 0; j < M; j++) {
						if (array[i][j] == 'S') {
							for (int k = 0; k < 4; k++) {
								if (i + dr[k] < 0 || j + dc[k] < 0 || i + dr[k] > N - 1 || j + dc[k] > M - 1)
									continue;
								if (array[i + dr[k]][j + dc[k]] == 'D') {
									new_array[i + dr[k]][j + dc[k]] = 'S';
									flag = false;
									answer = time;
								} 
								if (array[i + dr[k]][j + dc[k]] == '*' || array[i + dr[k]][j + dc[k]] == 'X'
										|| new_array[i + dr[k]][j + dc[k]] == '*')
									continue;
								else if (array[i + dr[k]][j + dc[k]] == '.') {
									new_array[i + dr[k]][j + dc[k]] = 'S';
								}
							}
						}
					}
				}

				// check sy still alive
				int alpha = 0;
				for (int i = 0; i < N; i++) {
					for (int j = 0; j < M; j++) {
						if (new_array[i][j] == 'S') alpha = 1;
						if(new_array[i][j] != 'D' && new_array[i][j] != 'S' && new_array[i][j] != '*' && new_array[i][j] != 'X')
							new_array[i][j] = '.';
					}
				}
				if (alpha == 0) {
					flag = false;
					beta = 1;
				}

				array = new_array;
				new_array = new char[N][M];
				new_array[tg_x][tg_y] = 'D';
			}
			if (beta == 0) {
				System.out.println("#" + tc + " " + answer);
			} else {
				System.out.println("#" + tc + " " + "GAME OVER");
			}

		}
	}

}
