package leetcodesolutions.basics;
import java.util.Stack;
public class StackInJava {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		
		System.out.println(st.isEmpty()); //initially stack is empty so it returns true
		
		st.push(10);
		st.push(7);
		st.push(18);
		st.push(12);
		
		System.out.println("Stack: " +st);
		
		st.pop();
		
		System.out.println("Stack: " +st);
		
		System.out.println(st.peek()); //return top element without disturbing stack

	}

}
