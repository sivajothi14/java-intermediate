package javaintermediate;
import java.util.Scanner;

public class linearsearch {
	

	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of th array:");
		int size=sc.nextInt();
		int[]arr=new int [size];
		 System.out.println("Enter " + size + " elements:");

	        // Loop through the array to take input
	        for (int i = 0; i < size; i++) {
	            arr[i] = sc.nextInt();
	}
	        System.out.println("enter the target element");
	        int target=sc.nextInt();
	        boolean found=false;
	        for(int i=0;i<size;i++) {
	        	
	        	if(arr[i]==target) {
	        		System.out.println("element is found at index" + i);
	        		found=true;
	        		break;
	        	}
	        }
			if(!found) {
	        	System.out.println("element not found");
	        }
			sc.close();

}
}