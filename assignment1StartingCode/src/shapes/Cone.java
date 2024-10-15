package shapes;

public class Cone extends Shape
{
	private double radius;

	/**
	 * Creates a Cone with specified height and radius
	 * @param height
	 * @param radius
	 */
	public Cone(double height, double radius) {
		super(height);
		this.radius = radius;
	}

	/**
	 * returns the cone's radius.
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * sets the cone's radius
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double calcBaseArea() 
	{
		return Math.PI * radius * radius;
	}

	@Override
	public double calcVolume() 
	{
		return calcBaseArea() * getHeight() / 3;
	}
	
}
