// Main.java
public class Main {
	public static void main(String[] args) {
		// Using Beverage class
		Beverage beverage = new Beverage(" Mango Juice", 20.0);
		beverage.display();
		beverage.customize("Ice");
		beverage.taste();
		System.out.println();

		// Using Coffee class
		Coffee coffee = new Coffee("Espresso ", 400.0, "Dark Roast");
		coffee.display();
		coffee.customize("Cream");
		coffee.taste();
		System.out.println();

		// Constructor Overloading in Coffee class
		Coffee largeCoffee = new Coffee("Latte", 3.5, "Medium Roast", "Large");
		largeCoffee.display();
		largeCoffee.taste();
	}
}
