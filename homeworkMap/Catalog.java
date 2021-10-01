package homeworkMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Catalog {

	public static void main(String[] args) {
		String nume;
		int nota;
		
		
		Map<String, Integer> catalog = new HashMap<String, Integer>();
		
		catalog.put("Andrei", 10);
		catalog.put("Calin", 4);
		catalog.put("Vasile", 6);
		catalog.put("Paul", 8);
		catalog.put("Ion", 7);
		
		
		System.out.println("Initial catalog entries: \n" + catalog );
		
		
		System.out.println("---------------------------------------");
		System.out.println("Te rog sa introduci numele si nota obtinuta: ");
		Scanner scan = new Scanner(System.in);
		
		nume = scan.nextLine();
		nota = scan.nextInt();
		
	
		//incepi prin a verifica doar numele.Daca nu exista il scrii in Map. Nota nu conteaza in pasul asta
		if (!catalog.containsKey(nume)) {
		    catalog.put(nume, nota);
		    System.out.println("NU aveai nota, ti-am adaugat acum");
		//Daca pica pe else -if este clar ca mai sus a evaluat False, deci Numele exista in catalog. Asa ca verificam nota daca trebuie sa fie updatata    
		}else if (nota<catalog.get(nume)) {
		    System.out.println("Nu ai nevoie de alta nota");
		//Daca pica pe else, inseama ca pe else if nota a evaluat false, deci nu e mai mica, deci este safe sa o scriem :)    
		} else {catalog.put(nume, nota);}
		
		System.out.println("");

				System.out.println("---------------------------------------");
				
				
			
		System.out.println("Updated HasMap: \n" + catalog); //printam catalogul indiferent de situatie
		
		
		}
	
		
	
			

}


