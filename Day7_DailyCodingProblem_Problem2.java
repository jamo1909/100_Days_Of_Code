//Example: if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].
import java.util.*;
public class Day7_DailyCodingProblem_Problem2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter size of Array");
		int size = input.nextInt();
		int array[] = new int [size];
		int result[] = new int [size];
		
		System.out.println("Enter numbers for array");
		for(int i=0; i<array.length; i++) {
			array[i] = input.nextInt();
			result[i] = 1;
		}
		
		//System.out.println(Arrays.toString(array));
		
		for(int j=0; j<array.length; j++) {
			for(int k=0; k<array.length; k++) {
				if(!(k==j)) {
				result[j] *= array[k]; 
				}
			}
		}
		

		System.out.println(Arrays.toString(result));

	}

}
