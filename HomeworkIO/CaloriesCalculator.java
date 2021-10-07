package HomeworkIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;

public class CaloriesCalculator {

	String leguma;
	int calorii;
	
		public static void main(String[] args) throws IOException {
			try {
			OutputStream output = new FileOutputStream("legume.properties");
			
			Properties prop = new Properties();
			prop.setProperty("brocoli", "10");
			prop.setProperty("morcov", "15");
			prop.setProperty("cartof", "30");
			
			//salvam fisierul
			prop.store(output, "Am salvat fisierul de tip properties");
			
			System.out.println(prop);
			
			

		}catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
			
			CaloriesCalculator.mapConversion(null);
			Scanner scan = new Scanner(System.in);
			System.out.println("Ce leguma doresti sa cumperi?");
			leguma = scan.nextLine();
			
			try {
				if(mapLegume.containsKey(leguma)) {
					System.out.println("Leguma aleasa de tine are: " + mapLegume.containsValue() + " calorii");
					
				}else {
					System.out.println("Nu vindem aceasta leguma, te rog sa alegi alta!");
				}
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		
		

	}
		
		public static void readFile() throws IOException	{
			
			try {
			InputStream input = new FileInputStream("legume.properties");//path-ul fisierului
			
			Properties prop = new Properties();
			
			//load file
			prop.load(input);
			//read file
			String passText = prop.getProperty("brocoli");
			System.out.println(passText);
			System.out.println(prop.getProperty("morcov"));
			System.out.println(prop.getProperty("cartof"));
			
			}catch(FileNotFoundException e) {
				
				e.printStackTrace();
			}
			

}
		public static HashMap<String, String> mapConversion(Properties prop) {
		    HashMap<String, String> mapLegume = new HashMap<>();
		    for (Map.Entry<Object, Object> entry : prop.entrySet()) {
		        mapLegume.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()));
		    }
		    return mapLegume;
		
		
		   
			
		
		
		
		
		
}
}
