package teacherChecker;

public class TeacherVerification {

	public static void main(String[] args) {
		
		
		
		Qualification qualif =  new Qualification("Java", 4, "Afternoon"); 
		qualif.verify();

		Qualification qualif2 =  new Qualification("Python", 5, "Afternnon");
		qualif2.verify();
		
	}

}
