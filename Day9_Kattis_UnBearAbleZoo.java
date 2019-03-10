import java.util.*;
public class Day9_Kattis_UnBearAbleZoo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList <String> answers = new ArrayList <String>();
		int indexList =1;
		int index =0;
		System.out.println("Enter size");
		int size = input.nextInt();

		
		while(size > 0) {
			ArrayList <String> results = new ArrayList <String>();
			index++;
			results.add(" ");
			for(int i=0; i<=size;i++) {
				results.add(getAnimalOut(input.nextLine().toLowerCase()));
			}
			size = input.nextInt();
		
		
		for (String num : results) {
			if(num.equals(" ") || answers.isEmpty()) {
				answers.add("List " + indexList +":");
				indexList++;
			}else {
				if(!answers.contains(num) || !answers.isEmpty()) {
					int count = Collections.frequency(results,num);
					int count2 = Collections.frequency(answers,num + " | " + count);
					if(!num.equals("") && count2 < 1)
						answers.add(num + " | " + count);
				}
			
			}
		}
		}
			
		

			for(String ans : answers) {
				System. out. println(ans);
			}
			
}
		
	
	
	public static String getAnimalOut(String title) {
		String word []= title.split(" ");
		String re =word[word.length-1]; 
		return re;
	}

}
