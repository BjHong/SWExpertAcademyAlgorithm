package d2;

import java.util.Scanner;

public class 두개의숫자열1959 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int tc=1;tc<=testcase;tc++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
		 	int a_num[]=new int[a];
			int b_num[]=new int[b];
			for(int i=0;i<a;i++) {
				a_num[i]=sc.nextInt();
			}
			for(int i=0;i<b;i++) {
				b_num[i]=sc.nextInt();
			}
			int count=0;
			int answer = 0;
				
			if(a<b) {
				while(count<=b-a) {
					int c_num[]=new int[a];
					int tmp = 0;
					for(int i=0;i<a;i++) {
						c_num[i] = a_num[i]*b_num[i+count];
						tmp+=c_num[i];
					}
					if(answer<tmp) {
						answer = tmp;
					}
					count++;
				}
				System.out.println("#"+tc+" "+answer);
			}else if(a>b){
				while(count<a-b+1) {
					int c_num[]=new int[b];
					int tmp = 0;
					for(int i=0;i<b;i++) {
						c_num[i] = a_num[i+count]*b_num[i];
						tmp+=c_num[i];
					}
					if(answer<tmp) {
						answer = tmp;
					}
					count++;
				}
				System.out.println("#"+tc+" "+answer);
			}
			
				
		}
	}

}
