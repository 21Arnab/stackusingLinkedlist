package stackuLL;

public class StackLinked 
{
    Node top;
	Node p;
	
public void push(int data)
{
	Node node = new Node();
	node.data=data;
	node.next=top;
	top=node;

}
public int pop()
{
	
	p=top;
	if(top==null)
	{
		System.out.println("The stack is Empty");
	}
	else
	{
	top=p.next;
	
	}
	return p.data;
	
}
public void show()
{
	
   p=top;
   while(p!=null)
   {
	   System.out.println(p.data);
	   p=p.next;
   }
	
}

}
