/**
 * Creates LinkedLists for storing groups of objects using nodes
 * 
 * @author Gregory Abellanosa <gregoryabellanosa@gmail.com>
 *
 */
public class LinkedList {

	/** the first node in the list*/
	private Node first; 
	/**the last node in the list*/
	private Node last;
	
	/**
	 * Creates a linked list object
	 */
	public LinkedList()
	{
		first = null;
		last = null;
	}
	
	/**
	 * Tests if a linked list is empty
	 * 
	 * @return true or false 
	 */
	public boolean isEmpty()
	{
		return first == null;
	}
	
	/**
	 * Returns the size of the linked list determined by how many objects are stored in it
	 * 
	 * @return the size of the linked list
	 */
	public int size()
	{
		int count = 0;
		Node p = first;
		while (p != null)
		{
			count++;
			p = p.getNext();
		}
		return count;
	}
	
	/**
	 * Returns the node at a specified index
	 * 
	 * @param i the index containing the object that will be accessed
	 * @return the node that was accessed
	 */
	public Node get(int i)
	{
		Node prev = first; //iterator
		for (int j = 1; j <= i; j++)
		{
			prev = prev.getNext();
		}
		return prev;
	}
	
	/**
	 * Prints the node s a string
	 * 
	 * @return the string representation of the list
	 */
	@Override
	public String toString()
	{
		String str = "";
		Node n = first;
		while (n != null)
		{
			str = str + n.getCircle();
			n = n.getNext();
		}
		return str;
	}
	
	/**
	 * For adding objects to the linked list
	 * 
	 * @param c the circle object that will be added to the list
	 */
	public void add(Circle c)
	{
		if (isEmpty())
		{
			first = new Node(c);
			last = first;
		}
		else
		{
			Node n = new Node(c);
			last.setNext(n);
			last = n;
		}
	}
}
