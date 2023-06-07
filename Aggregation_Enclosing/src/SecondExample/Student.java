package SecondExample;

public class Student {
Brain brain=new Brain("Pinkish", 1.5f);
public void accept(Book ref)
{
	System.out.println("Student has book written by "+ref.author);
	System.out.println("Which costs "+ref.price);
}
}