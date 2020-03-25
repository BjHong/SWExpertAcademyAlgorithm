package d3;


public class 백만이하의모든소수3131 {
	public static void main(String[] args) {

		boolean check[] = new boolean[(int) Math.pow(10, 6)+1];
		check[0] = true;
		check[1] = true;

		for (int i = 2; i <= (int) Math.pow(10, 6); i++) {
			if (check[i] == true) {
				continue;
			}
			for (int j = i * 2; j <= (int) Math.pow(10, 6); j += i) {
				check[j] = true;
			}
		}
		for (int i = 2; i <= (int) Math.pow(10, 6); i++) {
			if (check[i] == false) {
				System.out.print(i+" ");
			}
		}

	}

}
