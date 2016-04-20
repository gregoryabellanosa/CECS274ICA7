/**
 * Creates Nodes that will be used in linked lists
 * 
 * @author Gregory Abellanosa <gregoryabellanosa@gmail.com>
 *
 */
public class Node {

	/** the circle object value*/
	private Circle c;
	/**the node determining if next is null or given another node value */
	private Node next;
	
	/**
	 * Constructor for Node
	 * 
	 * @param round the circle in the node
	 */
	public Node(Circle round)
	{
		c = round;
		next = null;
	}
	
	/**
	 * Constructor for a node taking in another node that will be placed in the middle of a linked list
	 * 
	 * @param round the circle object
	 * @param n the next node
	 */
	public Node(Circle round, Node n)
	{
		c = round;
		next = n;
	}
	
	/**
	 * Returns the next node
	 * 
	 * @return the next node
	 */
	public Node getNext()
	{
		return next;
	}
	
	/**
	 * Sets the next node as the node passed in the parameters
	 * 
	 * @param n node being set as next
	 */
	public void setNext(Node n)
	{
		next = n;
	}
	
	/**
	 * Returns the circle object in the node 
	 * 
	 * @return the circle object
	 */
	public Circle getCircle()
	{
		return c;
	}
	
	/**
	 * Sets the circle object in a node
	 * 
	 * @param round the circle object that will be set in the node
	 */
	public void setCircle(Circle round)
	{
		c = round;
	}
	
}
