package homework4;

public class TestVehicul {

	public static void main(String[] args) {
		
		//instantiere obiecte de tip vehicul cu parametri si apelare metode
		Vehicul bicicleta = new Bicicleta("Mountainbike", 0, 50);		
		bicicleta.detaliiVehicul();
		verificaMotorizarea(bicicleta);
		
		
		Vehicul masina = new Masina("Dacia", 5, 200);
		masina.detaliiVehicul();
		verificaMotorizarea(masina);
		
		

	}
	
 		
	public static void verificaMotorizarea(Vehicul objVehicul) {
			
			System.out.println("Nume vehicul este: " + objVehicul.nume() + " si are motorizarea: " + objVehicul.motorizare());
		}

	
		
		
	}
	
	


