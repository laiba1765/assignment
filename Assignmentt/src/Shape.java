public class Shape 
{
		String color;
		boolean filled;
		
		Shape()
		{
			color="red";
			filled=true;
		}
		Shape(String color,boolean filled)
		{
			this.color=color;
			this.filled=filled;
		}
		String getcolor()
		{
			return color;
			
		}
		void setcolor(String color)
		{
			this.color=color;
		}
		boolean isFilled()
		{
			return filled;
		}
		void setfilled(boolean filled)
		{
			this.filled=filled;
		}
		public String toString()
		{
			return "A shape with color :" +color+"   and filled :"+filled +"\n";
		}
}


