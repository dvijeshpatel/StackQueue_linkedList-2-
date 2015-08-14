
public class Stack extends LinkedList
{
	Stack()
	{}
	 public boolean empty() {
	        if (head == null) return true;
	        return false;
	    }

	public int peek()
	{
		if(!this.empty())
			return tail.getData();
		return -100000;
	}
	
	public void pop()
	{
		deleteElement();
	}
	public void deleteElement()
	{
		Node temp = head;
		if(tail==null)
			System.out.println("No elements in stack");
		while(temp!=null&&temp.getNextNode()!=tail)
			temp = temp.getNextNode();
		tail = temp;
		if(tail!=null)tail.setNextNode(null);
		if(tail==null)head=null;
	}
	public void push(int key)
	{
		addElement(key);
	}

}
