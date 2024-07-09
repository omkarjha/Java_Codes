public class Beverage {
	public String name;
	public double price;

	public Beverage(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Price: Rs. " + price);
	}

	public void customize(String topping) {
		System.out.println("Adding: " + topping);
	}

	public void taste() {
		System.out.println(name + " has great taste");
	}
}