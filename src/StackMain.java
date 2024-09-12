class Stack
{
	int stack[]=new int[7];
	int top=0;
	
	public void push(int data) {
		// TODO Auto-generated method stub
		//System.out.println(top);
		
		if(top==(stack.length))
		{
			System.out.println("Stack is full");
		}
		else
		{
		stack[top]=data;
		top++;System.out.println(top);
		}
		
	}
	public void show() {
		// TODO Auto-generated method stub
		for(int n:stack)
		{
			System.out.print(n +" ");
		}
		 System.out.println();
	    for (int i = 0; i < top; i++) {
	        System.out.print(stack[i] + " ");
	    }
	    System.out.println();
	}
	public int pop()
	{
		int data=0;
		//if(top<=0) {
		if(isEmpty()) {	
			return top;
		}
		else
		{
		
		
		top=top-1;
		data=stack[top];
		stack[top]=0;
		//below will also work
		//stack[top-1]=0;
		//top--;
		
		return data;
		}
	}
	
	public void peek() {
		// TODO Auto-generated method stub
		//top -1 because in push finally it will be top++ so you have to subreact
		System.out.println(stack[top-1]);
	}
	public void size() {
		// TODO Auto-generated method stub
		System.out.println(top);
		System.out.println("Overall size of stack "+stack.length);
	}
	public int sizeint() {
		// TODO Auto-generated method stub
		return top;
	}
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(top<=0)
		{
			return true;
			
		}
		else
		{
			return false;
			
		}
	}
	
	
}
public class StackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack=new Stack();
		System.out.println(stack.isEmpty());
		stack.push(2);
		stack.push(12);
		stack.push(22);
		stack.push(32);
		stack.push(42);
		stack.push(52);
		stack.push(62);
		stack.show();
		stack.push(72);
		int value=stack.pop();
		if(value==0)
		{
			System.out.println("Stack is empty ");
		}
		else
		{
		System.out.println("removed "+value);
		}
		//stack.show();
		//stack.peek();
		stack.size();
		boolean result=stack.isEmpty();
		
		if(result==true)
		{
			
			System.out.println("Stack is empty");
		}
		else
		{
			System.out.println("Size of stack " +stack.sizeint());
		}
		
	}

}
