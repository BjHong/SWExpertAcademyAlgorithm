package d2;

import java.util.Scanner;

public class 쉬운거스름돈1970 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int tc=1;tc<=testcase;tc++) {
			int N=sc.nextInt();
			int array[]=new int[8];
			int question[] = {50000,10000,5000,1000,500,100,50,10};
			int a,b,c,d,e,f,g,h;
			for(int i=0;i<8;i++){
				array[i] = N / question[i];
				N%=question[i];
			}
			System.out.println("#"+tc);
			for(int i=0;i<8;i++) {
				System.out.print(array[i]+" ");
			}
			System.out.println();
		}
	}

}
