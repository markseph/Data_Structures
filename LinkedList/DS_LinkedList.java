import java.util.LinkedList;

public class DS_LinkedList {
	public static void main(String[] args) {
		// empty LinkedList
		LinkedList<String> ll = new LinkedList<String>();
		
		// add elements to LinkedList
		ll.add("C");
		ll.addFirst("B");
		ll.addFirst("A");
		ll.addLast("E");
		ll.add(3, "D");
		System.out.println(ll);
		
		// remove elements from LinkedList
		ll.remove("E");
		ll.remove(3);
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
	}
}