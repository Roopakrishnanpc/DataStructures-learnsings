class Node{
	int data;
	Node next; //see here node next will have data as well
	
	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
		
	}
	
}

class LinkedList
{
	Node head;
	public void add(int data) {
		// TODO Auto-generated method stub
		Node node=new Node();
		node.data=data;
		node.next=null;
		if(head==null)
		{
			System.out.println("assigning head to node");
			head=node;
		}
		else
		{
			Node n=head;
			while(n.next!=null)//this loop goes until n.next==null if it finds then exit
			{
				System.out.println("this loop goes until n.next==null if it finds then exit");
				n=n.next;
			}
			System.out.println("n.next which is null is added to a new node our data "+n);
			n.next=node;
		}
		
	}


	public void delete(int index) {
		// TODO Auto-generated method stub
		if(index==0)
		{
			head=head.next;
			
		}
		else
		{
			Node n=head;
			//System.out.println(head.next);
			Node n1=null;
			for(int i=0; i<index-1;i++)
			{
				//System.out.println("n.next="+n.next);
				n=n.next;
				//System.out.println("n.next="+n.next);
				//System.out.println("n "+n);
				
			}
			//see here loop will continue only will index -1 which is 1 in our case loop
			//now n=n.next will be in 5
			//now when it comes for below step it goes to 12 to remaining nodes whwre n1 will have 12 as well which the index 2 we are deleting
			//when n1.next is stored in n.next
			n1=n.next;//see it holds next node data here from 12 to last because we are saying n.next but in n it willl hold current to next not previous based on our condition
			System.out.println(n1+"here you will have index to last because next also holds a node");
			System.out.println(n+"see here will have from index -1 to last now n.next will be the index -1 pointing node which is next node to be deleted");//here also 12 will be there with 5
			System.out.println("We are chaning from that to n1.next which is deletion pointing node which is next node");
			n.next=n1.next;//when we say n.next which is 5 data is pointed to n1.next which is 19 data so link of 12 is removed 
			//n.next is 12 currently before the above step now we are removing that and pointing to n1.next which 19
			System.out.println(n);
			System.out.println("n1 "+n1.data);
			n1=null;//for garbage collection
		}
	}

	public void show() {
		// TODO Auto-generated method stub
		Node node=head;
		while(node.next!=null)
		{
			System.out.println(node.data);
			node=node.next;
		}
		System.out.println(node.data);
	}
	public void addAtStart(int data) {
		// TODO Auto-generated method stub
		Node node=new Node();
		node.data=data;
		node.next=null;
		System.out.println("seee here node will be the data we want to add"+node);
		node.next=head;
		System.out.println("inside addAtStart method we are adding the node.next currently it will be null with head node link "+node);
		head=node;
		System.out.println("pointing our head to node");
	}
	public void addAAtAnyLocation(int index, int data) {
		// TODO Auto-generated method stub
		Node node=new Node();
		node.data=data;
		node.next=null;
		if(index==0)
		{
			addAtStart(data);
		}
		else
		{
			Node n=head;
			for(int i=0; i<index-1;i++)
			{
				n=n.next;
			}
			System.out.println("when you print node now only the data you wannt to add will be there so node.next=null currently " +node);
			System.out.println(n+" prints from your index-1 because of the for loop");
			System.out.println(n.next +" will be your index to all node");
			node.next=n.next;
			System.out.println("first our new node which is null is added to index -1 next node");
			System.out.println(node);
			System.out.println(node.next);
			System.out.println("second index -1 next node is pointed to our new node so previous step link is set to from our new node to all other nodes");
			n.next=node;
			System.out.println(n);
			System.out.println(n.next);
		}
	}
	
}

public class LinkedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list=new LinkedList();
		list.add(5);
		list.add(19);
		list.add(23);
		list.addAAtAnyLocation(1,12);
		list.addAtStart(19);
		list.delete(2);
		list.show();
	}

}
