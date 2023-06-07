package MultipleInheritnce;

class Animal{
    public void run()
    {
    	
    	System.out.println("Animal is running ");
    }
}
class cat extends Animal {
    public void run()
    {
    	System.out.println("cat is running ");
    }
}

class dog extends Animal{
    public void run()
    {
    	System.out.println("dog is running ");
    }
}
class abc extends cat,dog{  // we can not call bcs which one i have to call hoe can we decide
    
}
public class demo{
    public static void main(String args[]){
    Animal obj = new abc();
    obj.run();
}
}