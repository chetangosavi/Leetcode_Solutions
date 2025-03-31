package leetcodesolutions.basics;

public class ArrayStack {
	private int[] stack;
	private int top;
	
	//constructor for ArrayStack:ss
	public ArrayStack(int size){
		stack = new int[size];
		top = -1;
	}
	
	//Function to push element onto Stack:
	public void push(int value) {
		if(top==stack.length-1) {
			System.out.println("Stack is Full");
			return;
		}
		else {
			stack[++top] = value;
		}
	}
	
	//function to pop element from stack
	public int pop() {
	    if (top == -1) {
	        System.out.println("Stack is empty");
	        return -1;
	    } else {
	        int poppedValue = stack[top]; 
	        stack[top] = 0;  
	        top--; 
	        System.out.println("Popped Value: " + poppedValue);
	        return poppedValue;
	    }
	}
	
	//peeking top element from stack
	public int peek() {
	    if (top == -1) {
	        System.out.println("Stack is empty! No elements to peek.");
	        return -1; 
	    } else {
	        System.out.println("Top element: " + stack[top]);
	        return stack[top];  
	    }
	}
	
	public void displayStack() {
		if(top == -1) {
			System.out.println("Stack is empty");
		}
		else {
			int i = stack.length-1;
			while(i>=0) {
				System.out.println("Stack: " + stack[i]);
				i--;
			}
		}
	}
	
	//Main method:
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayStack st = new ArrayStack(5);
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		st.peek();
		st.displayStack();
		
		st.pop();
		
		st.displayStack();
		
	}

}
