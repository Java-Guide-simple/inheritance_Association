package carProject;

//IS-A relationship (every car is a particular model1 of Car or every model is a Car)
//Blood relationship or tightly coupled 
public class Model3 implements Car {
	// Has-A relationship (Association) $ not tightly Coupled
	// Strong Bond
	private Engine engine = new Engine("gas");

	// Displaying Engine Type
	@Override
	public void engineType() {

		System.out.println("Model3 Cars have " + engine.getFuel() + " type Engine ");
	}

	// Displaying Details
	@Override
	public void carDetails() {
		System.out.println("Company Name Of Model3 car is : " + Model3.company_Name);
		System.out.println("Model3 Cars have " + engine.getFuel() + " type Engine ");
		System.out.print("\n");
	}

}
