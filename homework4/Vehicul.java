package homework4;

public class Vehicul {

	
	//3 variabile private + getteri si setteri
	private String brand;
	private int nivelPoluare;
	private int vitezaMedie;
	


public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getNivelPoluare() {
		return nivelPoluare;
	}

	public void setNivelPoluare(int nivelPoluare) {
		this.nivelPoluare = nivelPoluare;
	}

	public int getVitezaMedie() {
		return vitezaMedie;
	}

	public void setVitezaMedie(int vitezaMedie) {
		this.vitezaMedie = vitezaMedie;
	}

	//3 metode: nume, motorizare, detaliiVehicul
public String nume() {
	
	return nume ();
}

public String motorizare() {
	
	return motorizare();
}

public void detaliiVehicul() {
	
	System.out.println("Nivelul de poluare pentru vehiculul: " + brand + " este" + nivelPoluare + " si viteza medie atinsa este de: " + vitezaMedie);
}
}
