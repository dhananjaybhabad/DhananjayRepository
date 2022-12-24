package addition;

import java.util.Scanner;

public class TwoNoAddition {
	
	public static void main(String[] args) {
		
	   System.out.println("Enter first number");
//for import java.util.scanner cursor on scanner
	   Scanner sc=new Scanner(System.in);
	   int a = sc.nextInt();
	   
	   System.out.println("Enter second number");
	   int b = sc.nextInt();
	   
	   int c =a+b;
	   System.out.println("Addition of a and b:"+c);
       
	   sc.close();
	}
}
