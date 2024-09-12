class NodeLink {
    int data;
    NodeLink next;

    @Override
	public String toString() {
		return "NodeLink [data=" + data + ", next=" + next + "]";
	}

	// Constructor
    NodeLink(int data) {
        this.data = data;
        this.next = null;
    }
}
class StackLink {
    private NodeLink head;  // Points to the head NodeLink in the stack

    // Constructor
    public StackLink() {
        this.head = null;
    }

    // Push an element onto the stack
    public void push(int data) {
        NodeLink newNodeLink = new NodeLink(data);  // Create a new NodeLink
        newNodeLink.next = head;  // Point the new NodeLink to the current head
        head = newNodeLink;  // Update head to the new NodeLink
    }

    // Pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        int data = head.data;  // Get the data from the head NodeLink
        System.out.println("data "+data);
        head = head.next;  // Update head to the next NodeLink
        return data;  // Return the data
    }

    // Peek at the head element of the stack without removing it
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return head.data;  // Return the data of the head NodeLink
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return head == null;  // Stack is empty if head is null
    }

    // Display the stack elements
    public void show() {
        NodeLink current = head;
        System.out.println(current);
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
public class StackLinkedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackLink stack = new StackLink();


        stack.push(10);  // Stack: 10
        stack.push(20);  // Stack: 20 -> 10
        stack.push(30);  // Stack: 30 -> 20 -> 10
        stack.push(10);  // Stack: 10 -> 30 -> 20 -> 10
        stack.push(20);  // Stack: 20 -> 10 -> 30 -> 20 -> 10
        stack.push(30);  // Stack: 30 -> 20 -> 10 -> 30 -> 20 -> 10
        System.out.println("Stack after pushing ");
        stack.show();  // Output: 30 20 10 

        System.out.println("head element is: " + stack.peek());  // Output: 30

        System.out.println("Popped element: " + stack.pop());  // Output: 30

        System.out.println("Stack after popping:");
        stack.show();  
	}

}
