package arrayClassesPackage;

public class PatientArray {
	
	Patient[] myPatients = new Patient[10];

	public void buildArray() {
		
		myPatients[0] = new Patient();
		myPatients[0].setBreed("Beagle");
		myPatients[0].setGender("F");
		myPatients[0].setAge(8);
		myPatients[0].setSymptoms("Ear infection");
		
		myPatients[1] = new Patient();
		myPatients[1].setBreed("Parrot");
		myPatients[1].setGender("M");
		myPatients[1].setAge(1);
		myPatients[1].setSymptoms("Broken wing");
		
		myPatients[2] = new Patient();
		myPatients[3] = new Patient();
		myPatients[4] = new Patient();
		myPatients[5] = new Patient();
		myPatients[6] = new Patient();
		myPatients[7] = new Patient();
		myPatients[8] = new Patient();
		myPatients[9] = new Patient();
		
		
	}

	public void showArray() {
		
		for (int i = 0; i < myPatients.length; i ++) {
		System.out.println("Breed: "+myPatients[i].getBreed());
		System.out.println("Gender: "+myPatients[i].getGender());
		System.out.println("Age: "+myPatients[i].getAge());
		System.out.println("Symptoms: "+myPatients[i].getSymptoms());
		System.out.println("");
		}
		
	}

}
