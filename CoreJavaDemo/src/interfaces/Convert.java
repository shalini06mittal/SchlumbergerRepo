package interfaces;
/**
 * enums
 * 1. interface is a keyword to create an interface
 * 2. interface is by default abstract
 * 3. Interface objects cannot be created
 * 4. Interface can have only fields that should be public, static and final
 * 5. methods can only be public and abstract except default[ java 8 ] methods
 * 6. interfaces are always implemented by the classes and not extended
 * 7. The implementation class should provide the implementations of all the abstract methods 
 * 8. interface can extends other interface
 */
public interface Convert extends ConvertJSON, ConvertXML {

	int x = 10;
//	String convertToJSON();
//	String convertToXML();
	String converToBinary();
}

interface ConvertJSON{
	String convertToJSON();
}

interface ConvertXML{
	String convertToXML();
}

class A implements Convert{

	@Override
	public String convertToJSON() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String convertToXML() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String converToBinary() {
		// TODO Auto-generated method stub
		return null;
	}
	
}