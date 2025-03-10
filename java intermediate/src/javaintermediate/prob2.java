package javaintermediate;
import java.util.Scanner;
//Armstrong number
public class prob2 {
	public static boolean isArmstrong(int num) {
		int originalNumber=num;
		int sum=0;
		
		while(num>0) {
			int rem=num%10;
			num=num/10;
			sum=sum+rem*rem*rem;
			
		}
		return originalNumber==sum;
	}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
int num=sc.nextInt();
if(isArmstrong(num)) {
	System.out.println("it is a armstrong number");
}else {
	System.out.println("its not a armstrong number");
}
}
}
