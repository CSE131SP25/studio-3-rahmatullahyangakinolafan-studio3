package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in); 
		System.out.println("What's the value for n");
		int N = in.nextInt();
		
		int[] array = new int[N];
		
		for(int i = 0; i < N-1; i++) {
			array[i]= i + 2;
		
			
		
		
		}
		for (int row = 0; row < array.length; row++) {
		for (int j = 1; j < array[row]; j++) {
			if (j != 1 && array[row] % j == 0) {
			 array[row] = 0;
			 
			}
			
	
		}
		}
			
	    for (int value : array) {
	    	System.out.println(value);
	    }
	   
	
	
	
	
	
	
	
	}

}
