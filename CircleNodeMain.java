/**
 * Test bench that uses Linked lists to store circle objects and prints them
 * 
 * @author Gregory Abellanosa <gregoryabellanosa@gmail.com>
 *
 */
public class CircleNodeMain {

	public static void main(String[] args) {
		//create LinkedList object to store circle objects
		LinkedList list = new LinkedList();
		
		//create first circle and add to the linked list
		Circle c1 = new Circle(3, 4, 2);
		list.add(c1);
		
		//create first circle and add to the linked list
		Circle c2 = new Circle(6, 3, 4);
		list.add(c2);
		
		//create first circle and add to the linked list
		Circle c3 = new Circle(0, 0, 3);
		list.add(c3);
		
		System.out.println(list);
		
		System.out.println(list.get(1).getCircle());
		
		System.out.println(list.size());
	}

}
