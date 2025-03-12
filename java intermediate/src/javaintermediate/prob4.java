package javaintermediate; 
//function for sum of first n number;
import java.util.Scanner;

public class prob4 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
	System.out.println(findSum(n));
	}

	static int findSum(int n) {
	 int sum=0;
		for(int i=0;i<=n;i++) {
	   sum+=i;
		}
		return sum;
	}
}

