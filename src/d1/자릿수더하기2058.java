package d1;

import java.util.Scanner;

public class 자릿수더하기2058 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=0;i<4;i++) {
			sum+=n%10;
			n/=10;
		}
		System.out.println(sum);

	}

}
