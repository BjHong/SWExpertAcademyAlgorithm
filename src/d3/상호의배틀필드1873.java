package d3;

import java.util.Scanner;

public class 상호의배틀필드1873 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int tc = 1;tc<=testcase;tc++) {
			int H=sc.nextInt();
			int W=sc.nextInt();
			char array[][] = new char[H][W];
			String a = "";
			int first_H=0;
			int first_W=0;
			
			for(int i=0;i<H;i++) {
				a=sc.next();
				for(int j=0;j<W;j++) {
					array[i][j] = a.charAt(j);
					if(array[i][j] == '^'||array[i][j] == '<'||array[i][j] == '>'||array[i][j] == 'v') {
						first_H=i; //전차의 y축 위치를기억
						first_W=j; //전차의 x축을 기억
					}
				}
			}
			int N=sc.nextInt();
			String b = sc.next();
			char array_user[] = new char[N];
			for(int i=0;i<N;i++) {
				array_user[i] = b.charAt(i);
			}
			
			for(int i=0;i<b.length();i++) {
				switch(array_user[i]) {
					case 'U':
						array[first_H][first_W] ='^';
						if(first_H-1>=0) {
							if(array[first_H-1][first_W]=='.') {
								array[first_H-1][first_W]='^';
								array[first_H][first_W] ='.';
								first_H=first_H-1;
							}						
						}
						break;
					case 'D':
						array[first_H][first_W] ='v';
						if(first_H+1<H) {
							if(array[first_H+1][first_W]=='.') {
								array[first_H+1][first_W]='v';
								array[first_H][first_W] ='.';
								first_H=first_H+1;
							}
						}
						break;
					case 'L':
						array[first_H][first_W] ='<';
						if(first_W-1>=0) {
							if(array[first_H][first_W-1]=='.') {
								array[first_H][first_W-1]='<';
								array[first_H][first_W] ='.';
								first_W = first_W-1;
							}
						}
						break;
					case 'R':
						array[first_H][first_W] ='>';
						if(first_W+1<W) {
							if(array[first_H][first_W+1]=='.') {
								array[first_H][first_W+1]='>';
								array[first_H][first_W] ='.';
								first_W = first_W+1;
							}
						}
						break;
					case 'S':
						if(array[first_H][first_W]=='^') {
							if(first_H-1>=0) {
								for(int j=first_H-1;j>=0;j--) {
									if(array[j][first_W]=='*') {
										array[j][first_W]= '.';
										break;
									}else if(array[j][first_W]=='#'){
										break;
									}
									else{
										continue;
									}
								}
							}
						}else if(array[first_H][first_W]=='v') {
							if(first_H+1<H) {
								for(int j=first_H+1;j<H;j++) {
									if(array[j][first_W]=='*') {
										array[j][first_W]= '.';
										break;
									}else if(array[j][first_W]=='#'){
										break;
									}
									else{
										continue;
									}
								}
							}
						}else if(array[first_H][first_W]=='<') {
							if(first_W-1>=0) {
								for(int j=first_W-1;j>=0;j--) {
									if(array[first_H][j]=='*') {
										array[first_H][j]= '.';
										break;
									}else if(array[first_H][j]=='#'){
										break;
									}
									else{
										continue;
									}
								}
							}
						}else if(array[first_H][first_W]=='>') {
							if(first_W+1<W) {
								for(int j=first_W+1;j<W;j++) {
									if(array[first_H][j]=='*') {
										array[first_H][j]= '.';
										break;
									}else if(array[first_H][j]=='#'){
										break;
									}
									else{
										continue;
									}
								}							
							}
						}
						break;
					}
				
			}
			
			System.out.print("#"+tc+" ");
			for(int i=0;i<H;i++) {
				for(int j=0;j<W;j++) {
					System.out.print(array[i][j]);
				}
				System.out.println();
			}
		}

	}

}
