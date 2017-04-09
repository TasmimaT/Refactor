
public class Refactoring {

	private MyCollection orders = new MyCollection();
	private String name = "Customer name";
	
	void printOwing()
	{
		Enumeration<E> e = orders.elements();
		double outstanding = 0.0;
		
		//print banner
		printBanner();
		
		// calculate outstanding
		outstanding = calculation(e, outstanding);
		
		// print details 
		
		printdetail(outstanding);

	}

	private void printdetail(double outstanding) {
		System.out.println("name: " + name);
		System.out.println("amount: " + outstanding);
	}

	private double calculation(Enumeration<E> e, double outstanding) {
		while(e.hasMoreElements())
		{
			Order each = (Order) e.nextElement();
			outstanding += each.getAmount();
			
		}
		return outstanding;
	}

	private void printBanner() {
		System.out.println("*****************************");
		System.out.println("****** Customer Owes ********");
		System.out.println("*****************************");
	}

}
