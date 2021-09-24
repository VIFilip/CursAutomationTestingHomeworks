package teacherChecker;

public class Qualification extends Teacher{
	/*
	 * constructor care acceseaza setteri din clasa Teacher 
	 */
	Qualification(String course, int experienceYears, String schedule){
	    setCourse(course);
	    setExperienceYears(experienceYears);
	    setSchedule(schedule);
	  
	}
	
	
	
	//metoda verify	

public void verify() {
    if (course.equals("Java") && experienceYears > 3 && schedule.equals("Afternoon")) {
        System.out.println("You qualify to teach at this school!");
    }else {
        System.out.println("You do not qualify");
        
    }
}
}

