class Queue
{
	int cap=5;
	int queue[] = new int[cap];
	int front;
	int rear;
	int size;
	void enqueue(int data) {
		// TODO Auto-generated method stub
		if(!isFull())
		{
			queue[rear]=data;
			rear=(rear+1)%cap;
			size++;
			System.out.println("rear"+rear+ " size="+size);
		}
		else
		{
			System.out.println("Is full");
		}
	}
	public void show() {
		// TODO Auto-generated method stub
		System.out.print("This can be used only for displaying actual array ");
		for(int i:queue)
		{
			
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i=0;i<size;i++)
		{
			System.out.print(queue[(front+i)%cap]+" ");
		}
		System.out.println();
	}
	public int dequeue() {
		// TODO Auto-generated method stub
		int data=0;
		if(!isEmpty())
		{
			data=queue[front];
			front=(front+1)%cap;
			System.out.println(front+" size="+size);
			size--;
			System.out.println("size="+size);
		}
		else
		{
			System.out.println("is empty");
		}
		return data;
	}
	public int getSize() {
		return size;
	}
	public boolean isEmpty()
	{
		return size==0;
	}
	public boolean isFull()
	{
		return getSize()==cap;
	}
	
}
public class QueueMain {
	public static void main(String[] args) {
		Queue queue=new Queue();
		queue.enqueue(10);
		queue.enqueue(100);
		queue.enqueue(1000);
		queue.enqueue(20);
		queue.enqueue(200);

		System.out.println("Element removed "+queue.dequeue());
		System.out.println("Element removed "+queue.dequeue());
		queue.enqueue(2000);
		queue.enqueue(30);
		queue.enqueue(300);
		queue.enqueue(3000);
		queue.show();
		System.out.println(queue.isEmpty());
		System.out.println(queue.isFull());
		System.out.println(queue.getSize());
		System.out.println("Element removed "+queue.dequeue());
		System.out.println("Element removed "+queue.dequeue());
		System.out.println("Element removed "+queue.dequeue());
		System.out.println("Element removed "+queue.dequeue());
		System.out.println("Element removed "+queue.dequeue());
		System.out.println("Element removed "+queue.dequeue());
		System.out.println("Element removed "+queue.dequeue());
		System.out.println("Element removed "+queue.dequeue());
		System.out.println("Element removed "+queue.dequeue());
		System.out.println("Element removed "+queue.dequeue());
		
		
	}


}
