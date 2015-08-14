

public class LinkedList
{
	Node head;
	Node tail;
public LinkedList()
{
	head = null;
	tail = null;
}
public void addElement(int data)
{
	 Node newNodeToAdd = new Node(data);
	 newNodeToAdd.setNextNode(null);
		if (isEmpty())
	            head = newNodeToAdd;
	        else
	            tail.setNextNode(newNodeToAdd);
	        tail = newNodeToAdd;
}
public void deleteElement(int key)
{
		
	int flag = 0;//element found or not
		while(head!=null&&head.getData()==key)
			{head = head.getNextNode();flag=1;}//If key elements are in starting then delete them
		if(head==null)
			tail=null;
		Node temp = head;
		Node temp2 = null;//take 2 pointer
		while(temp!=null&&temp.getNextNode()!=tail)
		{
			temp2 = temp.getNextNode();
			if(temp2!=null&&temp2.getData()==key)
				{
				temp.setNextNode(temp2.getNextNode());//if element found between then delete it
					flag=1;
				}
			else
			temp = temp.getNextNode();
			
		}
		if(temp!=null&&temp.getNextNode()==tail)
		{
			if(tail.getData()==key)
				{
				tail = temp;flag=1;//element at last delete and set tail to new position
				tail.setNextNode(null);
				}
		}
		if(flag==0)
			System.out.println("Element not Found");
	}
	

public int searchElement(int key)
{
	Node temp = head;
	int index=1;
	int flag=0;
		while(temp!=null)
		{

			if(temp.getData()==key)
			{
			temp.setNextNode(temp.getNextNode());
			System.out.println("index is "+ index);
			flag=1;
	
			}
			index++;
		temp = temp.getNextNode();
		}
		if(flag==0)System.out.println("Element not Found");
		return flag;
		}
	

public void printElements()
{
	Node temp = head;
	while(temp!=null&&temp!=tail)
	{
		System.out.print(temp.getData()+" ");
		temp = temp.getNextNode();
	}
	if(tail!=null)
	System.out.print(tail.getData());
	System.out.println();
}
public boolean isEmpty() {
    return head==null;
}
}
