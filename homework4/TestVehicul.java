package homework4;

public class TestVehicul {

	public static void main(String[] args) {
		
		//instantiere obiecte de tip vehicul cu parametri si apelare metode
		Vehicul bicicleta = new Bicicleta("Mountainbike", 0, 50);
		//bicicleta.verificaMotorizarea();//nu reusesc sa apelez de aici
		bicicleta.detaliiVehicul();
		
		Vehicul masina = new Masina("Dacia", 5, 200);
		//masina.verificaMotorizarea();//nu reusesc sa apelez de aici
		masina.detaliiVehicul();
		
		
		

	}
	
	//obiect de tip vehicul primit ca parametru de metoda verificaMotorizarea
			Bicicleta bicicleta = new Bicicleta("Electrica", 100, 2);
			
			

	public void verificaMotorizarea() {
		
		System.out.println(bicicleta.nume() + bicicleta.motorizare());
		

		
		
		
		
	}
	
	

}
