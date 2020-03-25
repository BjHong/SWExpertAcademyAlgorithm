package d3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class RootedBinaryTree재구성7985 {
	static Queue<Integer> queue;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int tc=1;tc<=testcase;tc++) {
			int K=sc.nextInt();
			int alpha = (int) Math.pow(2, K)-1;
			int array[] = new int[alpha];
			for(int i=0;i<alpha;i++) {
				array[i] = sc.nextInt();
			}
			queue = new LinkedList<>();
			queue.add(alpha/2);
			while(!queue.isEmpty()) {
				int x = queue.poll();
				System.out.println(x);
				for(int i=0;;i++) {
					
				}
			}
		}

	}

}
