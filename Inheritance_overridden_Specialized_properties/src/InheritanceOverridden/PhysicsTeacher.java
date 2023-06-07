package InheritanceOverridden;

public class PhysicsTeacher extends Teacher {
	
// Overridden 
void teach() {
	System.out.println("Physics Teacher is teaching Physics...");
}

//specialized property
 void doExp() {
	 System.out.println("Physics Teacher is doing Laws Experiment");
}
}