package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class rectangle {
	private double width;
	private double length;
	
	public rectangle(double width,double length)
	{
		this.length =length;
		this.width =width;
		
	}
	
	public double getLength() 
	{
		return this.length;
	}
	
	public double getWidth() 
	{
		return this.width;
	}
	public double computeArea()
	{
		 return this.length * this.width;
	}
	
	public boolean compare(double a, double b)
	{
		double max = Math.max(a, b);
		if(max==a)
		{
			return true;
		}
		else
			return false;
	}
	
	public void setWidth(double width) {
		 this.width = width;
	}

	public void setLength(double length) {
		 this.length = length;
	}
	public void draw(int x, int y)
	{
StdDraw.rectangle(0.5, 0.5, getLength()/2,getWidth()/2 );
		
		StdDraw.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectangle rect= new rectangle(3.0,5.0);
		rect.draw(0,0);
		
	}

}
