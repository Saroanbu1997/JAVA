package javacode;

import java.util.Scanner;

public class multipleprimeno {

	public static void main(String[] args) {
		
		int i,j;
		Scanner num= new Scanner(System.in);
		int  n=num.nextInt();
		
		System.out.println("enter the no  " +n);
		
		boolean flag;
		for( i=1;i<=n;i++) {
			flag = true;
			int count=0;
			for(j=1;j<=i;j++) {
				if(i%j==0) {
					flag=false;
					count ++;
					//break;
				}
			}
			
			if(count==2) {
				System.out.println(i);
			}
		}
		
		
	      }
	

}
