package curs1;

public class Tester {

	//variabile
	String name;
	int age;
	int ratePerHour;
	String job;
		
	//constructor -- va fi chemat dupa cuv new: Adica: Tester vlad = new Tester();
	public Tester() {}

	
	//metode care seteaza valorile variabilelor de mai sus
		//Getteri si Setteri
	public String getName() {
		return name;
	}

	public void setName(String name) { //setName("Vlad")
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRatePerHour() {
		return ratePerHour;
	}

	public void setRatePerHour(int ratePerHour) {
		this.ratePerHour = ratePerHour;
	}
	
	public String getJob() {
		return job;
	}

	public void setJob(String job) { //setJob("tester")
		this.job = job;
	}
	
	
	
	
}
