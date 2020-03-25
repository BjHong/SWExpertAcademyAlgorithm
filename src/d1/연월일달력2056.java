package d1;

import java.util.Scanner;

public class 연월일달력2056 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int tc=1;tc<=testcase;tc++) {
			String a = sc.next();
			String year = a.substring(0,4);
			String month = a.substring(4,6);
			String day = a.substring(6,8);
			
			int Month = Integer.parseInt(month);
			int Day = Integer.parseInt(day);
			if(Month>12||Month<=0) {
				System.out.println("#"+tc+" "+-1);
			}else {
				
				if(Month==1||Month==3||Month==5||Month==7||Month==8||Month==10||Month==12) {
					if(Day>31||Day<1) {
						System.out.println("#"+tc+" "+-1);
					}else {
						System.out.println("#"+tc+" "+year+"/"+month+"/"+day);
					}
				}else if(Month==2) {
					if(Day>28||Day<1) {
						System.out.println("#"+tc+" "+-1);
					}else {
						System.out.println("#"+tc+" "+year+"/"+month+"/"+day);
					}
				}else {
					if(Day>30||Day<1) {
						System.out.println("#"+tc+" "+-1);
					}else {
						System.out.println("#"+tc+" "+year+"/"+month+"/"+day);
					}
				}
			}		
		}
	}
}
