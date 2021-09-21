import java.util.Scanner;

public class SwitchHomework {

	public static void main(String[] args) {
		
	
		System.out.println("Te rog sa introduci un numar:");
		Scanner scan = new Scanner(System.in);
		int numar = scan.nextInt();
		
		String ziuaSaptamanii; 

		        switch (numar) {
		            case 1:
		            	ziuaSaptamanii = "Luni";
		                System.out.println("Ziua saptamanii este: " + ziuaSaptamanii);
		                break;
		            case 2:
		            	ziuaSaptamanii = "Marti";
		                System.out.println("Ziua saptamanii este: " + ziuaSaptamanii);
		                break;
		            case 3:
		            	ziuaSaptamanii = "Miercuri";
		                System.out.println("Ziua saptamanii este: " + ziuaSaptamanii);
		                break;
		            case 4:
		            	ziuaSaptamanii = "Joi";
		                System.out.println("Ziua saptamanii este: " + ziuaSaptamanii);
		                break;
		            case 5:
		            	ziuaSaptamanii = "Vineri";
		                System.out.println("Ziua saptamanii este: " + ziuaSaptamanii);
		                break;
		            case 6:
		            	ziuaSaptamanii = "Sambata";
		                System.out.println("Ziua saptamanii este: " + ziuaSaptamanii);
		                break;
		            case 7:
		            	ziuaSaptamanii = "Duminica";
		                System.out.println("Ziua saptamanii este: " + ziuaSaptamanii);
		                break;
		            default:
		    			System.out.println("Te rog sa introduci un numar de la 1 la 7!");
		        }
		       
		    }
		}
