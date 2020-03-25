package d1;

import java.util.Scanner;

public class 서랍의비밀번호2043 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int count=0;
	
	for(int i=b;i<=999;i++) {
		count++;
		if(i==a) {
			break;
		}
	}
	System.out.println(count);

	}

}
