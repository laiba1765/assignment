public class TestDemo 
{
	public static void main(String args[])
	{
		
		
		String s="Filled";
		Circle c=new Circle(7.8,"Pink",true);
		System.out.print("**************Circle********************\n");
		System.out.print("Color of a circle is:"+c.getcolor()+"\n");
		if(c.isFilled()==true)
		{
			System.out.print("Circle is:"+s+"\n");
		}
		else
		{
			s="UnFilled";
			System.out.print("Circle is:"+s+"\n");
		}
		c.display();
		System.out.print(c.toString());
		Rectangle r=new Rectangle(6.9,4.7,"Yellow",true);
		System.out.print("*****************Rectangle********************\n");
		System.out.print("Color of a Rectangle is:"+r.getcolor()+"\n");
		if(r.isFilled()==true)
		{
			System.out.print("Rectangle is:"+s+"\n");
		}
		else
		{
			s="UnFilled";
			System.out.print("Rectangle is:"+s+"\n");
		}
		r.display();
		System.out.print(r.toString());
		Square S=new Square();
		System.out.print("*************Square****************\n");
		S.setcolor("red");
		S.setfilled(false);
		System.out.print("Color of a Square is:" +S.getcolor()+ "\n");
		if(S.isFilled()==true)
		{
			System.out.print("Square is:"+s+"\n");
		}
		else
		{
			s="UnFilled";
			System.out.print("Square is:"+s+"\n");
		}
		S.setlength(56);
		S.setwidth(40);
		S.display();
		System.out.print(S.toString());
	}
	}


