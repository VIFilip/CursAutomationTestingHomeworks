package curs1;

public class WageCalculator {
	
	static int oreLucrate = 40;

	public static void main(String[] args) {

		Tester obiectTester = new Tester();
		
		obiectTester.setName("Vlad");
		obiectTester.setAge(31);
		obiectTester.setRatePerHour(60);
		obiectTester.setJob("Tester");
		
		Tester obiectTester1 = new Tester();
		
		obiectTester1.setName("Andrei");
		obiectTester1.setAge(26);
		obiectTester1.setRatePerHour(50);
		obiectTester1.setJob("Junior Tester");
		
		
		//System.out.println("Numele testerului este " + obiectTester.getName() + " si are "+ obiectTester.getAge() + " de ani");
		//System.out.println(obiectTester.getName() + " are salariul saptamanal de: " + calculeazaSalariuSaptamanal(obiectTester.getRatePerHour()));
		
		//Sub acest text este statementul pentru a printa cerinta din TEMA
		System.out.println(obiectTester.getName() + " lucreaza ca: " + obiectTester.getJob());
		System.out.println(obiectTester1.getName() + " lucreaza ca: " + obiectTester1.getJob());
	}
	
	public static int calculeazaSalariuSaptamanal(int plataPeOra) {
		
		int salariu = plataPeOra * oreLucrate;
		
		return salariu;
	}

}
