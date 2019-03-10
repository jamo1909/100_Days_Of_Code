import java.util.*;
public class Day10_Kattis_Soylent {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int size = input.nextInt();
		int array [] = new int [size];
		int answers [] = new int [size];
		int drink = 400;
		int result = 0;
		
		for(int i=0; i<size; i++) {
			array[i] = input.nextInt();
		}
		
		for(int i=0; i<size; i++) {
			if(array[i]%drink == 0) {
				answers[i] = array[i]/drink;
			} else {
				
			}
		}
		
		for(int num : answers) {
			System.out.println(num);
		}
	}

}
