package SuperDemo;

//Parent or Super class
class Food {
	String name = "food";

	Food() {
		System.out.println("This is a food");
	}

	void displayName() {
		System.out.println("This is a good food");
	}
}

//Child class
class Rice extends Food {
	
	String name = "Rice";

	Rice() {
		// super(); calls this keyword even not used.
		System.out.println("Rice contains Carbohydrates");
	}

	void displayName() {
		System.out.println("The name of the food is Rice");
	}

	void displayAttributes() {
		super.displayName();
		this.displayName();
	}

}

//Class with main method
class TestRice {
	public static void main(String[] args) {
		Rice r = new Rice();
		
		r.displayAttributes();
	}
}