package h2;

public class H2_main {

	public static void main(String[] args) {
		SimpleList myList = new SimpleList();
		myList.append(0);
		myList.insertAfter(Integer.MIN_VALUE, Integer.MIN_VALUE);
		myList.delete(Integer.MIN_VALUE);
		
		Node hilf = myList.head.next;
		while (hilf != null) {
			System.out.print(hilf.value + "; ");
			hilf = hilf.next;
			
		}
	}
	
}
 
