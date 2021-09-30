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
		
	
		//daca in catalog avem nume si nota printam mesajul
				if(catalog.containsKey(nume) && catalog.containsValue(nota)) {
					System.out.println("Ai deja nota!");//functioneaza cu cei din lista
					
				//daca nota si numele nu se regasesc in catalog, adaugam nota si numele si printam mesajul	
				}else if(catalog.containsKey(nume) != true && catalog.containsValue(nota) != true) {
					catalog.put(nume, nota);
				System.out.println("NU aveai nota, ti-am adaugat acum");//functioneaza daca adaugam pe cineva care nu este in lista
				
				//daca nota introdusa este mai mica decat cea din catalog, printam mesajul
				}else if(nota < catalog.get(nume) ){
					System.out.println("Nu ai nevoie de alta nota");//nu functioneaza
					
				//daca nota introdusa este mai mare decat nota din catalog, facem update
				}else if(catalog.containsKey(nume) && nota > catalog.get(nume)) {
					catalog.put(nume, nota);//nu functioneaza
				//printam catalogul
				}else {
					
					System.out.println("Aici suntem in else: " + catalog);
				}
				System.out.println("---------------------------------------");
				
				
			
		System.out.println("Updated HasMap: \n" + catalog); //printam catalogul indiferent de situatie
		
		
		}
	
		
	
			

}


