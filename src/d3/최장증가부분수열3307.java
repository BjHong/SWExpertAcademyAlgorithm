package d3;


import java.util.Scanner;

public class 최장증가부분수열3307 {
	static int max = Integer.MIN_VALUE;
	static int min = Integer.MAX_VALUE;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int tc=1;tc<=testcase;tc++) {
			int N = sc.nextInt();
			int array[] = new int[N];
			int[] count = new int[N];
			for (int i = 0; i < N; i++) {
				array[i] = sc.nextInt();
			}
			int k=1;
			int beta = 0;
			for(int i=0;i<N-1;i++) {
				int alpha=0;
				for(int j=k;j<N;j++) {
					if(j==k) {
						alpha=array[i];
						count[i]++;
					}
					if(alpha<array[j]) {
						alpha = array[j];
						count[i]++;
					}
				}
				beta++;
				if(beta<N-1) {
					k++;
					max = Math.max(max, count[i]);
					count[i] = 0;
					i--;
				}else {
					beta = i+1;
					k=i+2;
				}
			}
			System.out.println("#"+tc+" "+max);
		}
			
			
		}

}


//	static void powerset(int idx) {
//		if (idx == sel.length) {
//			int sum = 0;
//			int alpha = 0;
//			int beta = 0;
//			for (int i = 0; i < sel.length; i++) {
//				if (sel[i]&&beta<array[i]) {
//					beta = array[i];
//					sum += array[i];
//					alpha++;
//				}
//			}
//			if (max < sum) {
//				max = Math.max(max, sum);
//				count = alpha;
//			}
//			return;
//		}
//		sel[idx] = true;
//		powerset(idx + 1);
//		sel[idx] = false;
//		powerset(idx + 1);
//	}

