package javaintermediate;
import java.util.Scanner;
public class prob3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		int first=sc.nextInt();
		System.out.println("enter the second number");
		int second=sc.nextInt();
		System.out.println("enter the third number");
		int third=sc.nextInt();
    int largest=largest(first,second,third);
     int smallest=smallest(first,second,third);
	System.out.println("the largest number is:"+ largest);
	System.out.println("the smalles is" +smallest);
	
	}
	public static int largest(int first,int second,int third) {
		int max=first;
		if(second>max) {
			return max=second;
		}
		if(third>max) {
			return max=third;
		}
	     return max;
	}
	public static int smallest(int first,int second,int third) {
		int min=first;
		if(second<min) {
			return min=second;
		}
	if(third<min) {
		return min=third;
	}
	return min;
	}
	

}
