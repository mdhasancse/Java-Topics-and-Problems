package Inheritance;


class Parent{  
	void eat(){
		System.out.println("eating...");
		}  
}  
class Child extends Parent{  
	void bark(){
		System.out.println("barking...");
		}  
}  
class Cat extends Parent{  
	void meow(){
		System.out.println("meowing...");
		}  
}  
class Herarchical{  
	public static void main(String args[]){  
	Cat c=new Cat();  
	c.meow();  
	c.eat();  
	//c.bark();//C.T.Error  
}}  
