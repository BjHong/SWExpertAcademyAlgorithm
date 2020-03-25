package d3;

import java.util.Scanner;

public class 주혁이의복권당첨6900 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int tc=1;tc<=testcase;tc++) {
			int N=sc.nextInt();
			int M=sc.nextInt();
			String first[] = new String[N];
			int money[] = new int[N];
			int count=0;
			for(int i=0;i<N;i++) {
				first[i] = sc.next();
				money[i] = sc.nextInt(); 
			}
			String last[] = new String[M];
			for(int i=0;i<M;i++) {
				last[i] = sc.next();
				char lastchar[] = new char[8];
				lastchar = last[i].toCharArray();
				for(int j=0;j<N;j++) {
					int alpha=0;
					char firstchar[] = new char[8];
					firstchar = first[j].toCharArray();
					for(int k=0;k<8;k++) {
						if(firstchar[k]!='*'&&lastchar[k] != firstchar[k]) {
							alpha=1;
							break;
						}
					}
					if(alpha==0) count+=money[j];
				}
			}
			System.out.println("#"+tc+" "+count);
		}
	}

}
