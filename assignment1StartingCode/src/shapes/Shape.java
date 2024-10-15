package shapes;

public abstract class Shape implements Comparable<Shape>
{
	private double height;
	
	/**
	 * creates a shape object with specified height
	 * @param height height of shape
	 */
	public Shape(double height) 
	{
		super();
		this.height = height;
	}
	
	/**
	 * returns the height of the shape
	 * @return the height
	 */
	public double getHeight() 
	{
		return height;
	}
	
	/**
	 * sets the shape's height
	 * @param height the height to set
	 */
	public void setHeight(double height) 
	{
		this.height = height;
	}
	
	@Override
	public int compareTo(Shape other)
	{
		if(this.height > other.height) return 1;
		if(this.height < other.height) return -1;
		return 0;
	}
	
	/**
	 * returns the calculated base area of the shape
	 * @return the base area
	 */
	public abstract double calcBaseArea();
	
	/**
	 * returns the calculated volume of the shape
	 * @return the volume
	 */
	public abstract double calcVolume();
	
	@Override
	public String toString() 
	{
		return "Shape [getHeight()=" + getHeight() + ", calcBaseArea()=" + calcBaseArea() + ", calcVolume()="
				+ calcVolume() + "]";
	}
}
