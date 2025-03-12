package javaintermediate; 
//function for sum of first n number;
import java.util.Scanner;

public class prob5 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n to find its factorial");
		int n=sc.nextInt();
	System.out.println(factorial(n));
	}

	static int factorial(int n) {
	 int fact=1;
		for(int i=1;i<=n;i++) {
	   fact=fact*i;
		}
		return fact;
	}
}

