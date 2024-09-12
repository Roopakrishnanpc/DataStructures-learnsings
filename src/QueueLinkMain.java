class NodeQ {
	   	int data;
	   	NodeQ next;

	    @Override
		public String toString() {
			return "NodeQ [data=" + data + ", next=" + next + "]";
		}

		// Constructor
	    NodeQ(int data) {
	        this.data = data;
	        this.next = null;
	    }
}
class QueueLink{
	private NodeQ front;  // Points to the front of the queue
    private NodeQ rear;   // Points to the rear of the queue
    private int size;    // Number of elements in the queue
    public QueueLink() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }
    void enqueue(int data) {
    	NodeQ node=new NodeQ(data);

    	if (rear == null) {
            // Queue is empty
            front = rear = node;
        } else {
            // Queue is not empty
        	System.out.println("front "+front);
        	rear.next = node ;  // Link the current rear (10) to the new node (20)
        	rear = node;       // Update rear to point to the new node (20)
            System.out.println(rear);
        }
    	size++;
    }
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int data = front.data;  // Get the data from the front node
        front = front.next;    // Move the front to the next node
        if (front == null) {
            // Queue is empty now
            rear = null;
        }
        size--;
        return data;
    }
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return front.data;  // Return the data of the front node
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return front == null;  // Queue is empty if front is null
    }

    // Display the queue elements
    public void show() {
        NodeQ current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
public class QueueLinkMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueLink queue=new QueueLink();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);

        System.out.println("Front element is: " + queue.peek());  // Output: 10

        queue.dequeue();
        System.out.println("Queue after dequeuing:");
        queue.show();  // Output: 20 30

        queue.enqueue(40);
        System.out.println("Queue after enqueuing 40:");
        queue.show();  // Output: 20 30 40
	}

}
