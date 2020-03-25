package d3;

import java.util.Scanner;

public class 태혁이의사랑은타이밍4299 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for (int tc = 1; tc <= testcase; tc++) {
			int D = sc.nextInt();
			int H = sc.nextInt();
			int M = sc.nextInt();
			// 11/11/11
			int count = 0;
			int alpha = 0;
			if (M >= 11) {
				count += M - 11;
			} else if (M < 11) {
				H--;
				count += 60 + M - 11;
			}
			if (H >= 11) {
				count += (H - 11) * 60;
			} else if (H < 11) {
				D--;
				count += (24 + H - 11)*60;
			}
			if (D >= 11) {
				count += (D - 11) * 24 * 60;
			} else if (D < 11)
				alpha = 1;

			if (alpha == 0)
				System.out.println("#" + tc + " " + count);
			else
				System.out.println("#" + tc + " " + (-1));
		}
	}

}
