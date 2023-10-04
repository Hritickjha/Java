package inheritance0;

public class Hospital {
	public static void main(String[] args) {
		
		Doctor d1 = new Doctor("Sanju", 123, "cardio");
		d1.toprint_doctor();
		
		Nurse n1 = new Nurse("Aashudeep", 456, 14);
		n1.toprint_Nurse();
		
		cleaner c1 = new cleaner("Nirod", 789, "Safai wala");
		c1.toprint_Cleaner();
	}
}
