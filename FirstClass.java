package curs1;

public class FirstClass {
	
	//instance variable
	static String prenume = "Marius";

	//comentarii
	public static void main(String[] args) {
	// metoda 1 -- instanta a unei clase
	FirstClass obiect = new FirstClass();
	
	System.out.println(obiect.prenume);
	System.out.println(22);
	obiect.prenume = "Dragos";
	
	System.out.println(obiect.prenume);	
	//obiect.printeazaNume();
	//obiect.printeazaVarsta();
	//obiect.printeazaNume();	
	//System.out.println("Salut Vlad");	
	
	//metoda 2
		printeazaVarsta();
	}
	public static void printeazaVarsta() {
		System.out.println(25);
	}

	public void printeazaNume() {
		System.out.println("Hello");
	}
	
}
