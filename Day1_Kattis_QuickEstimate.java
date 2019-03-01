import java.util.*;
//Days1 27/02/19
public class Day1_Kattis_QuickEstimate {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt()+1;
		String estimate;
		int results[] = new int[num];
		
		for(int i=0; i<num; i++) {
			 estimate = input.nextLine();
			 results[i] = estimate.length();
		}
		
		 //Arrays.stream(results).forEach(System.out::println);
		
		for(int i=1; i<num; i++) {
			System.out.println(results[i]);
		}
		 input.close();
	}

}
