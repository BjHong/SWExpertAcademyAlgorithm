package d2;

import java.util.Scanner;

public class 간단한369게임1926 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int array[]=new int[N];
		for(int i=0;i<N;i++) {
			array[i]=i+1;
		}
		for(int i=0;i<N;i++) {
			int amp=0;
			int bmp=0;
			int cmp=0;
			int cnt=0;
			if(array[i]>=100) {
				amp = array[i] / 100;
				bmp = (array[i] - amp*100)/10;
				cmp = array[i] - amp*100 - bmp*10;
				if(amp%3==0 && amp!=0) {
					cnt++;
				}
				if(bmp%3==0 && bmp!=0) {
					cnt++;
				}
				if(cmp%3==0 && cmp!=0) {
					cnt++;
				}
				if(cnt==0) {
					System.out.print(array[i]+" ");
				}else {
					for(int j=0;j<cnt;j++) {
						System.out.print("-");
					}
					System.out.print(" ");
				}
			}
			else if(10<=array[i]&&array[i]<100) {
				amp = array[i]/10;
				bmp = (array[i] - amp*10);
				if(amp%3==0 && amp!=0) {
					cnt++;
				}
				if(bmp%3==0 && bmp!=0) {
					cnt++;
				}
				if(cnt==0) {
					System.out.print(array[i]+" ");
				}else {
					for(int j=0;j<cnt;j++) {
						System.out.print("-");
					}
					System.out.print(" ");
				}
			}
			else {
				if(array[i]%3==0) {
					System.out.print("-"+" ");
				}else {
					System.out.print(array[i]+" ");
				}
			}
		}
	}
}
