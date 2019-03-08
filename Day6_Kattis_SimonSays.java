/**
 * @author jamesmurphy
 * @date 4/02/19
 */
import java.util.*;
public class Day6_Kattis_SimonSays {

	public static void main(String[] args) {
		//TODO: change Arraylist - not working
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of lines");
		int size = input.nextInt();
		String array[] = new String [size];
		
		System.out.println("Enter Strings: ");
		for(int i=0; i<size; i++) {
			array[0] = input.nextLine();
		}
		
		String answer[] = new String[size];
		
		for(int j=0; j<array.length; j++) {
			answer[j] = checkSimon(array[j].split(" "));
		}
		
		for(int k=0; k<array.length; k++) {
			if(answer[k].length() > 0) {
				System.out.println(answer[k]);
			}
		}
		
	}
	
	public static String checkSimon(String str[]) {
		String answerStr = "";
		if(str[0].equals("Simon") && str[1].equals("says")) {
			for(int i=2; i<str.length;i++) {
				 answerStr += str[i]  + " ";
			}	
		}
	
		return answerStr;
	}

}
