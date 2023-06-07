package Abstraction;

interface AcceptMultipleInheritance{
    void run();
}
interface cat extends AcceptMultipleInheritance {
   
}

interface dog extends AcceptMultipleInheritance{
   
}
class abc implements cat,dog{
    public void run()
    {
        System.out.println("calling multiple inheritance");
    }
}
class demo{
    public static void main(String args[]){
    AcceptMultipleInheritance obj = new abc();
    obj.run();
}}