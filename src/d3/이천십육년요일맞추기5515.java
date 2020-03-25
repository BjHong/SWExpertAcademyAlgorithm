package d3;

import java.util.Scanner;

public class 이천십육년요일맞추기5515 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int tc=1;tc<=testcase;tc++) {
			int month = sc.nextInt();
			int day = sc.nextInt();
			// 1/1일 금요일 6012345
			int count=0;
			for(int i=1;i<month;i++) {
				if(i==1||i==3||i==5||i==7||i==8||i==10||i==12){
					count+=31;
				}
				else if(i==4||i==6||i==9|i==11) {
					count+=30;
				}else if(i==2) count+=29;
			}
			count+=day;
			int good = count%7;
			good+=3;
			if(good>6) good-=7;
			System.out.println("#"+tc+" "+good);
		}

	}

}
