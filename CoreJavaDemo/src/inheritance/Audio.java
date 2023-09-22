package inheritance;

public abstract class Audio extends Item{

	private String track;
	
	public Audio() {
		// TODO Auto-generated constructor stub
	}
	// constructor, getters and setters

//	@Override
//	public double calculateMrp() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
}

class Rap extends Audio{

	@Override
	public double calculateMrp() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}