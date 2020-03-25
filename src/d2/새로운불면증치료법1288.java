package d2;

import java.util.Scanner;

public class 새로운불면증치료법1288 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		
		for(int tc=1;tc<=testcase;tc++) {
			int num=sc.nextInt();
			
			int count=0;
			int check_count=0;
			
			boolean check[]=new boolean[10];
			while(count<10) {
				int nnum=num*(++check_count);
				while(nnum>0){
					if(check[nnum%10]==false) {
						check[nnum%10]=true;
						count++;
						nnum/=10;
					}else {
						nnum/=10;
					}
				}
			}
			System.out.println("#"+tc+" "+num*check_count);
		}

	}

}
