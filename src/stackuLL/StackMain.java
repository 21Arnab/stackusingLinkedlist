package stackuLL;

public class StackMain {

	public static void main(String[] args)  
	{

		StackLinked list = new StackLinked();
		list.push(1);
		list.push(2);
		list.push(3);
		list.push(4);
		list.push(5);
		list.push(6);
		try {
		//System.out.println("The pop eliment is:" +list.pop());
		//System.out.println("The pop eliment is:" +list.pop());
		//System.out.println("The pop eliment is:" +list.pop());
		//System.out.println("The pop eliment is:" +list.pop());
		//System.out.println("The pop eliment is:" +list.pop());
		//System.out.println("The pop eliment is:" +list.pop());
		//System.out.println("The pop eliment is:" +list.pop());
		}
		catch(NullPointerException e)
		{
			System.out.println("you can't delete");
		}
		list.show();
	}

}
