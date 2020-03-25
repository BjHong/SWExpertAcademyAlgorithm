package d2;

import java.util.Arrays;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Scanner;

public class Base64Decoder1928 {
	//어려움.....외워야

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		
		for(int tc=1;tc<=testcase;tc++) {
			String gettext = sc.next();
			byte targetByte[]=gettext.getBytes();
			
			Decoder decoder = Base64.getDecoder();
			byte decodedByte[] = decoder.decode(targetByte);
			
			
			
			System.out.println("#"+tc+" "+new String(decodedByte));
		}
	}

}
