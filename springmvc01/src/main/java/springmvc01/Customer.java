package springmvc01;

public class Customer {
	
	public Customer(String name, String city, int id) {
		super();
		this.name = name;
		this.city = city;
		this.id = id;
	}
	private String name;
	private String city;
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
