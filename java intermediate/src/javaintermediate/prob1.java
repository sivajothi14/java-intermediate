package javaintermediate;
import java.util.Scanner;
//prime number using prime function
public class prob1 {
public static boolean isPrime(int num) {
	if(num<=1) {
		return false;
	}
	for(int i=2;i<=Math.sqrt(num);i++) {
		if(num%i==0)
		{
			return false;
		}
	}
	return true;
	
}
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int num=sc.nextInt();
	if(isPrime(num)) {
		System.out.println(num + "is a prime number");
		
	}else {
		System.out.println(num + "is not  a prime number");
	}
	
}
	
}