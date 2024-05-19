package Constr_Getter_Setter.pkg2;

public class Box {

	private int heigth,length,width;
	
	public Box(int height,int length,int width)
	{
		System.out.println("----parameter constr----");
		
		this.length=length;
		this.heigth=height;
		this.width=width;	
	}
	
	public void display()
	{
		System.out.println("Box:"+length+" "+width+" "+heigth);
	}
	
	public void setLength(int l)
	{
		length=l;
	}
	
	public int getLength()
	{
		return length;
	}
	public boolean isSameBox(Box b2)
	{
		if(heigth==b2.heigth && length==b2.length && width==b2.width)
			return true;
		else
			return false;
		
	}
	
}
