package carProject;

// IS-A relationship (every car is a particular model1 of Car or every model is a Car)
//Blood relationship or tightly coupled 
public class Model1 implements Car {
	// Has-A relationship (Association) $ not tightly Coupled
	// Strong Bond
	private Engine engine = new Engine("Diesel");

	// Displaying Engine Type
	@Override
	public void engineType() {

		System.out.println("Model1 Cars have " + engine.getFuel() + " type Engine ");
	}

	// Displaying Details
	@Override
	public void carDetails() {
		System.out.println("Company Name Of Model1 car is : " + Model1.company_Name);
		System.out.println("Model1 Cars have " + engine.getFuel() + " type Engine ");
		System.out.print("\n");
	}

}