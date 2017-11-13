package arrayClassesPackage;

public class PatientArray {
	
	Patient[] myStudents = new Patient[10];

	public void buildArray() {
		
		myStudents[0] = new Patient();
		myStudents[0].setFname("Tyler");
		myStudents[0].setLname("Smith");
		myStudents[0].setYearInSchool(11);
		
		myStudents[1] = new Patient();
		myStudents[1].setFname("Connor");
		myStudents[1].setLname("Jones");
		myStudents[1].setYearInSchool(12);
		
		myStudents[2] = new Patient();
		myStudents[2].setFname("Claire");
		myStudents[2].setLname("Johnson");
		myStudents[2].setYearInSchool(10);
	}

	public void showArray() {
		
		for (int i = 0; i < myStudents.length; i ++) {
		System.out.println("First name: "+myStudents[i].getFname());
		System.out.println("Last name: "+myStudents[i].getLname());
		System.out.println("Year in school: "+myStudents[i].getYearInSchool());
		System.out.println("");
		}
		
	}

}
