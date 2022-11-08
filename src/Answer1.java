import java.util.Scanner; 

public class Answer1 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a number: ");
		
		int mark = input.nextInt();
		
		if (mark >= 50 ) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		
		System.out.println("DONE");
		
	}
}
