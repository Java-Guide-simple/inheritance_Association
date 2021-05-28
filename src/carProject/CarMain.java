package carProject;

public class CarMain {

	public static void main(String[] args) {
		
		// creating the instances
		Model1 m1 = new Model1();
		Model2 m2 = new Model2();
		Model3 m3 = new Model3();
		
		// Displaying the All details
		m1.carDetails();
		m2.carDetails();
		m3.carDetails();
		
		
		//Displaying Engine Type of Particular Car Model
		m1.engineType();
		m2.engineType();
		m3.engineType();

	}
}
