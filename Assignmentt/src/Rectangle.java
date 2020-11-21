public class Rectangle extends Shape
{
	double length;
	double width;
	Rectangle()
	{
		length=1.0;
		width=1.0;
	}
	Rectangle (double length,double width, String color,boolean filled)
	{
		super(color,filled);
		this.length=length;
		this.width=width;
	}
		
	double getlength()
	{
		return length;
		
	}
	void setlength(double length)
	{
		this.length=length;
	}
	double getwidth()
	{
		return width;
		
	}
	void setwidth(double width)
	{
		this.width=width;
	}
	double getarea()
	{
		return (length*width);
	}
	double getperimeter() 
	{
		return (2*length+2*width);
	}
	public String toString()
	{
		
		return "A shape with length :" +length+"  and width  :"   +width+"  which is the subclass of:  "+super.toString()+"\n";
	}
	void display()
	{
		System.out.println("area of a rectangle is:"+getarea()+"\n");
		System.out.println("perimeter of a rectangle is:"+getperimeter()+"\n");
	}
}

