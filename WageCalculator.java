package curs1;

public class WageCalculator {
	
	static int oreLucrate = 40;

	public static void main(String[] args) {

		Tester obiectTester = new Tester();
		
		obiectTester.setName("Vlad");
		obiectTester.setAge(31);
		obiectTester.setRatePerHour(60);
		obiectTester.setJob("Tester");
		
		//System.out.println("Numele testerului este " + obiectTester.getName() + " si are "+ obiectTester.getAge() + " de ani");
		//System.out.println(obiectTester.getName() + " are salariul saptamanal de: " + calculeazaSalariuSaptamanal(obiectTester.getRatePerHour()));
		//Sub acest text este statementul pentru a printa cerinta din TEMA
		System.out.println(obiectTester.getName() + " lucreaza ca: " + obiectTester.getJob());
	}
	
	public static int calculeazaSalariuSaptamanal(int plataPeOra) {
		
		int salariu = plataPeOra * oreLucrate;
		
		return salariu;
	}

}
