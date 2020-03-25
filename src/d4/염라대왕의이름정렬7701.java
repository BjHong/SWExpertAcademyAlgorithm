package d4;

import java.util.Arrays;
import java.util.Scanner;
class Good implements Comparable<Good>{
	String a;
	int b;
	Good(String a,int b){
		this.a=a;
		this.b=b;
	}
	@Override
	public int compareTo(Good o) {
		if(this.b-o.b==0) {
			for(int i=0;i<this.b;i++) {
				if(this.a.charAt(i) ==o.a.charAt(i)) {
					continue;
				}
				else {
					return this.a.charAt(i)-o.a.charAt(i);		
				}
			}
		}
		return this.b-o.b;
	}
}

public class 염라대왕의이름정렬7701 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int tc=1;tc<=testcase;tc++) {
			int N=sc.nextInt();
			Good array[] = new Good[N];
			for(int i=0;i<N;i++) {
				String a = sc.next();
				int b = a.length();
				array[i] = new Good(a,b);
			}
			Arrays.sort(array);
			System.out.println("#"+tc);
			for(int i=0;i<N;i++) {
				if(i==0) {
					System.out.println(array[i].a);
					continue;
				}
				if(array[i].a.equals(array[i-1].a)) continue;
				System.out.println(array[i].a);
			}
		}
	}
}
