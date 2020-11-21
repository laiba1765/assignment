public class Square extends Rectangle
{
	public String toString()
	{
			String str;
				str="A square with side:"+super.getlength()+" which is the subclass of :" +super.toString() +"\n";
				return str;
	}
	double getside()
	{
		double l;
		l=super.getlength();
		return l;
	}
	void setside(double side)
	{
		super.setlength(side);
	}
	double getarea()
	{
		return getside()*getside();
	}
	double getperimeter()
	{
		return 4*getside();
	}
	void setlength(double l) 
	{
		super.setlength(l);
	}
	void setwidth(double w)
	{
		super.setwidth(w);
	}
	void display()
	{
		System.out.println("area of a square is:"+getarea()+"\n");
		System.out.println("perimeter of a square is:"+getperimeter()+"\n");
	}
}


