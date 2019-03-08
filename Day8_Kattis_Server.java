import java.util.*;
public class Day8_Kattis_Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter amount of tasks:");
		int size = input.nextInt();
		
		System.out.print("Enter Time for all tasks: ");
		int time = input.nextInt();
		
		int tasks [] = new int [size];
		System.out.println("Enter individual tasks:");
		for(int i=0; i<size; i++) {
			tasks[i] = input.nextInt();
		}
		
		int index =0;
		int tempTask = 0;
		int tempTime =0;
		int totalTime =0;
		
		for(int i=0; i<size; i++) {
			tempTask = tasks[i];
			tempTime += tasks[i];
			if(tempTime <= time) {
				totalTime += tempTask;
				index = i+1;
			}
		}
		System.out.println(index);
	}
}
