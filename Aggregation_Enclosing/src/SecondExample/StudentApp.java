package SecondExample;

public class StudentApp {

	public static void main(String[] args) {
		Student stu=new Student();
		System.out.println(stu.brain.color);
		System.out.println(stu.brain.weight);
		Book book =new Book("Omkar", 1200);
		stu.accept(book);
		
		stu=null;
		System.out.println("Student object is garbage collected");
		//System.out.println(stu.brain.color);
		//System.out.println(stu.brain.weight);
		
		System.out.println(book.author);
		System.out.println(book.price);
	}

}