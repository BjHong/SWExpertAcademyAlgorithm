package d4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class 수지의수지맞는여행7699_강사님코드 {
	static int result;
	static int R,C;
	static char map[][];
	static int dr[] = {-1,1,0,0};
	static int dc[] = {0,0,-1,1};
	static boolean check[][];
	static Set<Character> set = new HashSet<>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int tc=1;tc<=testcase;tc++) {
			result = 0;
			set.clear();
			R=sc.nextInt();
			C=sc.nextInt();
			map = new char[R][C];
			check = new boolean[R][C];
			for(int i=0;i<R;i++) {
				String a = sc.next();
				for(int j=0;j<C;j++) {
					map[i][j] = a.charAt(j);
				}
			}
			//처리
			dfs(0,0,1);
			System.out.println("#"+tc+" "+result);
		}
	}
	static void dfs(int x,int y,int cnt) {
		result = Math.max(cnt, result);
		check[x][y] = true;
		set.add(map[x][y]);
		int nx,ny;
		for(int i=0;i<4;i++) {
			nx = x+dr[i];
			ny = y+dc[i];
			if(nx<0||ny<0||nx>R-1||ny>C-1) continue;
			if(check[nx][ny] == true || set.contains(map[nx][ny])) continue;
			dfs(nx,ny,cnt+1);
			check[nx][ny] = false;
			set.remove(map[nx][ny]);
		}
	}

}
