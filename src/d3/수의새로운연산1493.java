package d3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Good {
	int x;
	int y;
	int z;

	Good(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
}
public class 수의새로운연산1493 {
	static int dr[] = {0,1};
	static int dc[] = {1,0};
	static int array[][] = new int[301][301];
	static Queue<Good> queue = new LinkedList<>();
	static ArrayList<Good> list = new ArrayList<>();
	static boolean check[][] = new boolean[301][301];
	static int start = 1;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		bfs(1,1);
		for(int tc=1;tc<=testcase;tc++) {
			int p=sc.nextInt();
			int q=sc.nextInt();
			int alpha = 0;
			int a=0,b=0,c=0,d=0;
			for(int i=0;i<list.size();i++) {
				if(list.get(i).z == p) {
					a = list.get(i).x;
					b = list.get(i).y;
					alpha++;
				}
				if(list.get(i).z == q) {
					c = list.get(i).x;
					d = list.get(i).y;
					alpha++;
				}
				if(alpha == 2) break;
			}
			int e = a+c;
			int f = b+d;
			System.out.println("#"+tc+" "+array[e][f]);
			
		}
	}
	static void bfs(int a,int b) {
		check[a][b] = true;
		array[a][b] = 1;
		queue.add(new Good(a,b,start));
		list.add(new Good(a,b,start));
		start++;
		while(!queue.isEmpty()) {
			int x = queue.peek().x;
			int y = queue.peek().y;
			int num = queue.peek().z;
			queue.poll();
			for(int i=0;i<2;i++) {
				if(x+dr[i]>300 || y+dc[i]>300) {
					start++;
					continue;
				}
				if(!check[x+dr[i]][y+dc[i]]) {
					array[x+dr[i]][y+dc[i]] = start;
					check[x+dr[i]][y+dc[i]] = true;
					queue.add(new Good(x+dr[i],y+dc[i],start));
					list.add(new Good(x+dr[i],y+dc[i],start));
					start++;
				}
			}
		}
	}

}
