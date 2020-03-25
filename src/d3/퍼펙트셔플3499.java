package d3;

import java.util.ArrayList;
import java.util.Scanner;

public class 퍼펙트셔플3499 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int tc=1;tc<=testcase;tc++) {
			int N=sc.nextInt();
			String array[] = new String[N];
			ArrayList<String> list1 = new ArrayList<>();
			ArrayList<String> list2 = new ArrayList<>();
			ArrayList<String> list3 = new ArrayList<>();
			for(int i=0;i<N;i++) {
				array[i] = sc.next();
			}
			
			if(N%2==0) {
				for(int i=0;i<N/2;i++) {
					list1.add(array[i]);
				}
				for(int i=N/2;i<N;i++) {
					list2.add(array[i]);
				}
				for(int i=0;i<N/2;i++) {
					list3.add(list1.get(i));
					list3.add(list2.get(i));
				}
			}
			else {
				for(int i=0;i<=N/2;i++) {
					list1.add(array[i]);
				}
				for(int i=N/2+1;i<N;i++) {
					list2.add(array[i]);
				}
				for(int i=0;i<=N/2;i++) {
					list3.add(list1.get(i));
					if(i==N/2) continue;
					list3.add(list2.get(i));
				}
			}
			System.out.print("#"+tc+" ");
			for(int i=0;i<N;i++) {
				System.out.print(list3.get(i)+" ");
			}
			System.out.println();
			
		}
	}

}
