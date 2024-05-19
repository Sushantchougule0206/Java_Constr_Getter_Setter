package Constr_Getter_Setter.pkg2;

public class TestBox2 {
	
	public static void changeLength(int len)
	{
		len=len+50;
	}
	
	public static void changeLength(Box b)
	{
		int l = b.getLength();
		l=l+50;
		b.setLength(l);
	}

	public static void main(String[] args) {
		
		Box b1 =new Box(10,20,30);
		b1.display();
		
		changeLength(b1);
		
		b1.display();
		
		Box b2 =new Box(10,20,30);
		
		

	}

}
