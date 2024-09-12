class StackDynamic
{
	int capacity=4;
	int stack[]=new int[capacity];
	int top=0;
	
	public void push(int data) {
		// TODO Auto-generated method stub
		//System.out.println(top);
		
		if(sizeint()==capacity)
		{
			expand();
		}

			stack[top]=data;
			top++;System.out.println(top);
		
		
	}
	private void expand() {
		// TODO Auto-generated method stub
		int length=sizeint();
		int newStack[]=new int[capacity*2];
		System.arraycopy(stack,0 , newStack, 0, length);
		stack=newStack;
		capacity*=2;
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
		shrink();
		return data;
		}
	}
	private void shrink() {
		// TODO Auto-generated method stub
		int length=sizeint();
		if(length<=(capacity/4))
		{
			capacity=capacity/2;
		}
		int newStack[]=new int[capacity];
		System.arraycopy(stack,0 , newStack, 0, length);
		stack=newStack;

		
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
public class StackDynamicMain {
public static void main(String[] args) {
	StackDynamic stack=new StackDynamic();
	stack.push(2);
	stack.push(12);
	stack.push(22);
	stack.push(32);
	stack.push(42);
	stack.push(52);
	stack.push(62);
	stack.push(72);
	stack.push(82);
	stack.push(92);
	stack.push(102);
	stack.push(112);
	stack.push(122);
	stack.push(132);
	stack.push(142);
	stack.push(152);
	stack.push(162);
	stack.push(172);
	stack.push(182);
	stack.push(192);
	stack.push(202);
	stack.show();
	for(int i=0;i<=5;i++)
		stack.pop();
	stack.show();
	
}
}
