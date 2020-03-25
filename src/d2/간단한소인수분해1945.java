package d2;

import java.util.Scanner;

public class 간단한소인수분해1945 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numoftc = sc.nextInt();
		
		for(int tc=1;tc<=numoftc;tc++) {
			int num=sc.nextInt();
			int remainnum=num;
			int a=0,b=0,c=0,d=0,e=0;
			while(remainnum!=1) {
				if(remainnum%2==0) {
					remainnum=(remainnum/2);
					a++;
				}else if(remainnum%3==0) {
					remainnum=remainnum/3;
					b++;
				}else if(remainnum%5==0) {
					remainnum=remainnum/5;
					c++;
				}else if(remainnum%7==0) {
					remainnum=remainnum/7;
					d++;
				}else if(remainnum%11==0) {
					remainnum=remainnum/11;
					e++;
				}
			}
			System.out.println("#"+tc+" "+a+" "+b+" "+c+" "+d+" "+e);
		}
	}

}
