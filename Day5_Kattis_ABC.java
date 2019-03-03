

import java.util.*;
import java.util.Arrays;
public class Day5_Kattis_ABC {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int array[] = new int[3];
		
		System.out.println("Enter list of numbers");
		for(int i=0; i<3; i++) {
			array[i] = input.nextInt();
		}
		
		System.out.println("Enter order of letters:");
		String str = input.next();
		
		Arrays.sort(array);
		
		int numA = array[0];
		int numB = array[1];
		int numC = array[2];
		
		for(int j=0; j<3; j++) {
			if (str.charAt(j) == 'A') {
				System.out.print(numA);
			}
			if (str.charAt(j) == 'B') {
				System.out.print(numB);
			}
			if (str.charAt(j) == 'C') {
				System.out.print(numC);
			}
			System.out.print(" ");
		}
		
		
		
		
	}

}
