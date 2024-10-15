package shapes;

public class Prism extends Shape 
{
	private double side;

	/**
	 * Creates a prism with specified height and side
	 * @param height
	 * @param side
	 */
	public Prism(double height, double side) {
		super(height);
		this.side = side;
	}

	/**
	 * returns the side of the prism
	 * @return the side
	 */
	public double getSide() {
		return side;
	}

	/**
	 * sets the side of the Prism
	 * @param side the side to set
	 */
	public void setSide(double side) {
		this.side = side;
	}
}
