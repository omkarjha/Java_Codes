public class Coffee extends Beverage {
	public String type;

	public Coffee(String name, double price, String type) {
		super(name, price);
		this.type = type;
	}

	public Coffee(String name, double price, String type, String size) {
		super(name, price);
		this.type = type;
		System.out.println("Size: " + size);
	}

	public void taste() {
		System.out.println(name + "has great taste");
	}
}
