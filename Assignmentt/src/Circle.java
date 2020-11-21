public class Circle extends Shape
{
	double radius;
	double pi=3.14;
	Circle()
	{
		radius=1.0;
	}
	Circle (double radius)
	{
		this.radius=radius;
	}
		Circle(double radius, String color,boolean filled)
	{
			super(color,filled);
		this.radius=radius;
	}
	double getradius()
	{
		return radius;
		
	}
	void setradius(double radius)
	{
		this.radius=radius;
	}
	double getarea()
	{
		return (pi*radius*radius);
	}
	double getperimeter() 
	{
		return (2*pi*radius);
	}
	public String toString()
	{
	
		return "A shape with radius :" +radius+   "which is the subclass of:"   +super.toString()+"\n";
	}
	void display()
	{
		System.out.println("area of a circle is:"+getarea()+"\n");
		System.out.println("perimeter of a circle is:"+getperimeter()+"\n");
	}
}

