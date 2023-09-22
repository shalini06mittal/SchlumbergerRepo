package interfaces;

public class Emp implements ConvertJSON, ConvertXML{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String convertToJSON() {
		// TODO Auto-generated method stub
		return id+ " "+name+" convert to binary";
	}
	@Override
	public String convertToXML() {
		// TODO Auto-generated method stub
		return null;
	}

}
