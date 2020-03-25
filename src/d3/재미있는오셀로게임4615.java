package d3;

import java.util.Scanner;

public class 재미있는오셀로게임4615 {
	static int dr[] = { -1, -1, 0, 1, 1, 1, 0, -1 };
	static int dc[] = { 0, 1, 1, 1, 0, -1, -1, -1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for (int tc = 1; tc <= testcase; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int array[][] = new int[N + 1][N + 1];
			array[N / 2][N / 2] = 2;
			array[N / 2 + 1][N / 2 + 1] = 2;
			array[N / 2][N / 2 + 1] = 1;
			array[N / 2 + 1][N / 2] = 1;
			for (int i = 0; i < M; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				if (c == 1) {
					array[b][a] = 1;
					for (int j = 0; j < 8; j++) {
						int alpha = 0;
						if (b + dr[j] < 1 || a + dc[j] < 1 || b + dr[j] > N || a + dc[j] > N)
							continue;
						if (array[b + dr[j]][a + dc[j]] == 2) {
							for (int k = 1; k <= N; k++) {
								if (b + dr[j] * k < 1 || a + dc[j] * k < 1 || b + dr[j] * k > N || a + dc[j] * k > N)
									break;
								if(array[b + dr[j] * k][a + dc[j] * k] == 0) break;
								if (array[b + dr[j] * k][a + dc[j] * k] == 1) {
									alpha = 1;
								}
							}
							
							if (alpha == 1) {
								for (int k = 1; k <= N; k++) {
									if (b + dr[j] * k < 1 || a + dc[j] * k < 1 || b + dr[j] * k > N
											|| a + dc[j] * k > N)
										break;
									if (array[b + dr[j] * k][a + dc[j] * k] == 1)
										break;
									else if (array[b + dr[j] * k][a + dc[j] * k] == 2) {
										array[b + dr[j] * k][a + dc[j] * k] = 1;
									}
								}
							}
						}
					}
				} else if (c == 2) {
					array[b][a] = 2;
					for (int j = 0; j < 8; j++) {
						int alpha = 0;
						if (b + dr[j] < 1 || a + dc[j] < 1 || b + dr[j] > N || a + dc[j] > N)
							continue;
						if (array[b + dr[j]][a + dc[j]] == 1) {
							for (int k = 1; k <= N; k++) {
								if (b + dr[j] * k < 1 || a + dc[j] * k < 1 || b + dr[j] * k > N || a + dc[j] * k > N)
									break;
								if(array[b + dr[j] * k][a + dc[j] * k] == 0) break;
								if (array[b + dr[j] * k][a + dc[j] * k] == 2) {
									alpha = 1;
								}
							}
							if (alpha == 1) {
								for (int k = 1; k <= N; k++) {
									if (b + dr[j] * k < 1 || a + dc[j] * k < 1 || b + dr[j] * k > N
											|| a + dc[j] * k > N)
										break;
									if (array[b + dr[j] * k][a + dc[j] * k] == 2)
										break;
									else if (array[b + dr[j] * k][a + dc[j] * k] == 1) {
										array[b + dr[j] * k][a + dc[j] * k] = 2;
									}
								}
							}
						}
					}
				}
//				for (int p = 1; p <= N; p++) {
//					for (int o = 1; o <= N; o++) {
//						System.out.print(array[p][o] + " ");
//					}
//					System.out.println();
//				}
//				System.out.println();
			}
			int count_b = 0, count_w = 0;
			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= N; j++) {
					if (array[i][j] == 1)
						count_b++;
					else if (array[i][j] == 2)
						count_w++;
				}
			}
//			for(int i=1;i<=N;i++) {
//				for(int j=1;j<=N;j++) {
//					System.out.print(array[i][j]+" ");
//				}
//				System.out.println();
//			}
			System.out.println("#" + tc + " " + count_b + " " + count_w);
		}
		sc.close();

	}

}
