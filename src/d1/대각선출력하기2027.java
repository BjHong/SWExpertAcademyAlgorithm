package d1;

public class 대각선출력하기2027 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	char a[]= {'+','+','+','+','+'};
	for(int i=0;i<5;i++) {
		a[i]='#';
		for(int j=0;j<5;j++) {
			System.out.print(a[j]);
		}
		System.out.println();
		a[i]='+';
	}
	}

}
