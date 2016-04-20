/**
 * Creates circle objects 
 * 
 * @author Gregory Abellanosa <gregoryabellanosa@gmail.com>
 *
 */
public class Circle {
	
	/**the x value of the circle*/
	private int x;
	/**the y value of the circle*/
	private int y; 
	/**the radius of the circle*/
	private int radius;
	
	/**
	 * Constructs a Circle object
	 * 
	 * @param xVal x value of the circle
	 * @param yVal y value of the circle
	 * @param r radius
	 */
	public Circle(int xVal, int yVal, int r)
	{
		x = xVal;
		y = yVal;
		radius = r;
	}
	
	/**
	 * Gets the x value of the circle
	 * 
	 * @return x value
	 */
	public int getX()
	{
		return x;
	}
	
	/**
	 * Gets the y value of the circle
	 * 
	 * @return y
	 */
	public int getY()
	{
		return y;
	}
	
	/**
	 * Gets the radius of the circle
	 * 
	 * @return radius
	 */
	public int getRadius()
	{
		return radius;
	}
	
	/**
	 * Prints the x, y, and radius values of the circle
	 * 
	 * @return the values of the circle printed as a string
	 */
	@Override
	public String toString()
	{
		return "x:\t" + getX() + "\ny:\t" + getY() + "\nradius:\t" + getRadius() + "\n";
	}
}
