package d4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Poker implements Comparable<Poker> {
	char a;
	int b;

	Poker(char a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public int compareTo(Poker o) {
		return this.b - o.b;
	}
}

public class pokergame9760 {
	static int dia, spa, clo, hea;
	static Poker array[];
	static Integer shape[];
	static Integer rank[];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for (int tc = 1; tc <= testcase; tc++) {

			array = new Poker[5];

			dia = 0;clo = 0;hea = 0;spa = 0;
			shape = new Integer[4];
			Arrays.fill(shape, 0);
			rank = new Integer[14];
			Arrays.fill(rank, 0);
			for (int i = 0; i < 5; i++) {
				String str = sc.next();
				if (str.charAt(0) == 'D')
					shape[0]++;
				else if (str.charAt(0) == 'C')
					shape[1]++;
				else if (str.charAt(0) == 'H')
					shape[2]++;
				else if (str.charAt(0) == 'S')
					shape[3]++;
				if (str.charAt(1) == 'A') {
					array[i] = new Poker(str.charAt(0), 1);
					rank[1]++;
				} else if (str.charAt(1) == 'T') {
					array[i] = new Poker(str.charAt(0), 10);
					rank[10]++;
				} else if (str.charAt(1) == 'J') {
					array[i] = new Poker(str.charAt(0), 11);
					rank[11]++;
				} else if (str.charAt(1) == 'Q') {
					array[i] = new Poker(str.charAt(0), 12);
					rank[12]++;
				} else if (str.charAt(1) == 'K') {
					array[i] = new Poker(str.charAt(0), 13);
					rank[13]++;
				} else {
					array[i] = new Poker(str.charAt(0), str.charAt(1) - '0');
					rank[str.charAt(1) - '0']++;
				}
			}
			Arrays.sort(array);
			Arrays.sort(shape,Collections.reverseOrder());
			Arrays.sort(rank,Collections.reverseOrder());
			if (no1()) {
				System.out.println("#"+tc+" "+"Straight Flush");
			}
			else if(no2()) {
				System.out.println("#"+tc+" "+"Four of a Kind");
			}
			else if(no3()) {
				System.out.println("#"+tc+" "+"Full House");
			}
			else if(no4()) {
				System.out.println("#"+tc+" "+"Flush");
			}
			else if(no5()) {
				System.out.println("#"+tc+" "+"Straight");
			}
			else if(no6()) {
				System.out.println("#"+tc+" "+"Three of a kind");
			}
			else if(no7()) {
				System.out.println("#"+tc+" "+"Two pair");
			}
			else if(no8()) {
				System.out.println("#"+tc+" "+"One pair");
			}
			else{
				System.out.println("#"+tc+" "+"High card");
			}
			
//			for(int i=0;i<array.length;i++) {
//				System.out.print(array[i].b+" ");
//			}
		}
	}

	static boolean no1() {
		if (shape[0]==5) {
			int tmp = array[0].b;
			if(tmp==1) {
				if(array[1].b==10 && array[2].b==11 && array[3].b==12 && array[4].b==13) return true;
				else return false;
			}
			for (int i = 1; i < 5; i++) {
				if (array[i].b != tmp + 1) {
					return false;
				}
				tmp++;
			}
			return true;
		}
		return false;
	}
	static boolean no2() {
		if (rank[0]==4) return true;
		return false;
	}
	static boolean no3() {
		if(rank[0]==3 && rank[1]==2) return true;
		return false;
	}
	static boolean no4() {
		if(shape[0]==5) return true;
		return false;
	}
	static boolean no5() {
		int tmp = array[0].b;
		for (int i = 1; i < 5; i++) {
			if (array[i].b != tmp + 1) {
				return false;
			}
			tmp++;
		}
		return true;
	}
	static boolean no6() {
		if(rank[0]==3) return true;
		return false;
	}
	static boolean no7() {
		if(rank[0]==2 && rank[1]==2) return true;
		return false;
	}
	static boolean no8() {
		if(rank[0]==2) return true;
		return false;
	}

}
