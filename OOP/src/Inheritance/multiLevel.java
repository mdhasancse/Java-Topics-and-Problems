package Inheritance;
class Baap{  
	void eat(){
		System.out.println("eating...");
	}  
}  
class child extends Baap{  
	void bark(){
		System.out.println("barking...");
		}  
}  
class Baby extends child{  
	void weep(){
		System.out.println("weeping...");
		}  
}  
class multiLevel{  
	public static void main(String args[]){  
	Baby d=new Baby();  
	d.weep();  
	d.bark();  
	d.eat();  
	}
}  
