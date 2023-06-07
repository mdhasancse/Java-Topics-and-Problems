package encapsulation;

public class Area {
	int length;
	int breath;
	
	Area(int length,int breath)
	{
		this.length = length;
		this.breath = breath;
	}
	
	public int getArea()
	{
		int rectangle_area = length * breath;
		return rectangle_area;
	}
	
	public static void main(String[] atgs)
	{
		Area area = new Area(10,20);
		System.out.println(area.getArea());
		
				
	}
	

}
