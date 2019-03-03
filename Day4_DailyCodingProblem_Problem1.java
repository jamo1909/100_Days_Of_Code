import java.util.*;
public class Day4_DailyCodingProblem_Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter size: ");
		int size = input.nextInt();
		
		System.out.println("Enter Number to test");
		int test = input.nextInt();
	
		int array [] = new int[size];
		System.out.println("Enter List of numbers: ");
		for (int i=0; i<size;i++)  {
			array [i] = input.nextInt();
		}
		
		int x=0;
		int y=0;
		for(int j=0; j<size; j++){
			for(int k=0; k<size;k++){
				int temp=array[j];
				int add = array[k];
				
				if(j != k) {
					if((temp+add)==test) {
						 x = j;
						 y = k;
					}	
				}
			}
		}
		
		print(x,y,array,test);

	}
	
	public static void print(int x,int y, int array[],int test) {
		System.out.println("Ansewr: ");
		System.out.println(array[x] +" + "+array[y] + " = " + test);
	}
	
	

}
