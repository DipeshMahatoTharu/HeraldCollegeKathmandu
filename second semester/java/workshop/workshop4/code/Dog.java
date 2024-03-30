class Dog extends Animal {
	String breed;
	public void display(String breed) {
		this.breed = breed;
		System.out.println("The breed is "+ breed);
	}
	public static void main(String[]args) {
		Dog g = new Dog();
		g.show("Dog",2);
		g.display("german shepard");
	}
}
