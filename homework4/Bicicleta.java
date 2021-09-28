package homework4;

public class Bicicleta extends Vehicul {
	/*
	 * constructor care acceseaza setteri din clasa Vehicul 
	 */
	Bicicleta(String brand, int nivelPoluare, int vitezaMedie){
	    setBrand(brand);
	    setNivelPoluare(nivelPoluare);
	    setVitezaMedie(vitezaMedie);
	    
	    
	  
	}
	//aici Clasa Bicicleta suprascrie metodele din clasa vehicul..cred
	@Override
	public String nume() {
		
		return "Logan";
	}
	@Override
	public String motorizare() {
		
		return "1.4 turbo";
	}
	@Override
	public void detaliiVehicul() {
		
		System.out.println("Nivelul de poluare pentru bicicleta: " + getBrand() + " este " + getNivelPoluare() + " si viteza medie atinsa este de: " + getVitezaMedie());
	}
	
	
}
