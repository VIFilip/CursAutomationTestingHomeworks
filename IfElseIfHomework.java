import java.util.Scanner;

public class IfElseIfHomework {

	public static void main(String[] args) {
		
		System.out.println("Te rog sa introduci varsta:");
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		
			
		if (age < 18) {
		      System.out.println("Esti minor!");
		    } else if ((age >= 18) && (age <= 65)){
		      System.out.println("Esti adult!");
		    }else if (age > 65) {
		      System.out.println("Esti batran!");
		
		
		}
}
}
