package Abstraction;

//Abstract class
abstract class Animal {  /*Difference between Abstraction and Interface */
	private String name;
	
	public Animal(String name) {
	   this.name = name;
	}
	
	public String getName() {
	   return name;
	}
	
	public abstract void speak();
	}
	
	//Concrete class that extends the abstract class
	class Dog extends Animal {
	public Dog(String name) {
	   super(name);
	}
	
	public void speak() {
	   System.out.println("Woof!");
	}
}

//Interface
interface Shape {
	double getArea();
	double getPerimeter();
	}
	
	//Concrete class that implements the interface
	class Circle implements Shape {
	private double radius;
	
	public Circle(double radius) {
	   this.radius = radius;
	}
	
	public double getArea() {
	   return Math.PI * radius * radius;
	}
	
	public double getPerimeter() {
	   return 2 * Math.PI * radius;
	}
}
