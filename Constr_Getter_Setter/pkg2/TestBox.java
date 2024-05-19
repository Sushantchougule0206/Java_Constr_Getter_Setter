package Constr_Getter_Setter.pkg2;

public class TestBox {

	public static void main(String[] args) {
		Box box1 = new Box(10,20,30);
		
		box1.display();
		
		box1.setLength(100);
		
		box1.display();
		
		box1.getLength();
		
		
		
		Box box2 = new Box(23,45,67);
		
		box2.display();
		

	}

}
