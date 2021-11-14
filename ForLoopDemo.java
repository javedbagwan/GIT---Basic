import java.util.Scanner;
public class ForLoopDemo{
	public static void main(String args[]){
		//We want to display square of numbers
		//Without for loop
		/*System.out.println("1*1");
		System.out.println("2*2");
		*/
		
		//With for loop
		
		Scanner obj = new Scanner(System.in);
		int input = obj.nextInt();
		
		for(int number=1; number<=input; number++){

			System.out.println(number*number);
			
		}
		
		
	}
}