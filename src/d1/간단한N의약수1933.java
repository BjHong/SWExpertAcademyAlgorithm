package d1;

import java.util.Scanner;

public class 간단한N의약수1933 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	int a=sc.nextInt();
	for(int i=1;i<=a;i++) {
		if(a%i==0) {
			System.out.print(i+" ");
		}
	}

	}

}
