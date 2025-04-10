package javaintermediate;
import java.util.Scanner;
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

//You may assume that each input would have exactly one solution, and you may not use the same element twice.

public class leetcode1 {
	public static void main (String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter" + size + "elements");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
			System.out.println("enter the target element");
	        int target=sc.nextInt();
	        System.out.println();
	        int[] result = twoSum(arr, target);

	        if (result.length == 2) {
	            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
	        } else {
	            System.out.println("No solution found.");
	        }
		}
	    public static int[] twoSum(int[] arr, int target) {
	        int n = arr.length;

	        for (int i = 0; i < n - 1; i++) {          // Outer loop
	            for (int j = i + 1; j < n; j++) {      // Inner loop
	                if (arr[i] + arr[j] == target) { // Check if two numbers add up to target
	                    return new int[]{i, j};        // Return their indices
	                }
	            }
	        }

	        return new int[]{}; // No solution found (though the question says one always exists)
	    }
	}

