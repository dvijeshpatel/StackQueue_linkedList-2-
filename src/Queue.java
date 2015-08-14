
public class Queue extends LinkedList
{

	Queue()
	{}
	
	public void dequeue()
	{
		deleteElement();
	}
	public void deleteElement()
	{	
		if(head==null)
			System.out.println("Element not found");
		if(head!=null)
		head = head.getNextNode();
		if(head==null)
			tail=null;
	}
	public void enque(int key)
	{
		addElement(key);
	}
}
