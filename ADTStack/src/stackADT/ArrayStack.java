package stackADT;

  import java.util.EmptyStackException;
	
 public class ArrayStack<T> implements StackADT<T> {
	 
   private T[] stack;
   private int top;
   private static final int DEFAULT_CAPACITY =10;
   
   @SuppressWarnings("unchecked") public ArrayStack() {
	   stack = (T[]) new Object[DEFAULT_CAPACITY];
	      top = -1;
  }
   
   @Override
   public void push(T element) {
	   if (top == stack.length - 1) {
		   
		   expandCapacity();
  }
	stack[++top] = element;
   }
   
   @Override
   public T pop() {
	   if (isEmpty()) {
		  throw new EmptyStackException();
 }
	 T result = stack[top];
	 stack[top] = null;
	 top--;
	 return result;
 }
   @Override
   public T peek() {
	   if (isEmpty()) {
		 throw new EmptyStackException();
 }
	 return stack[top];
	 
  }
   
   @Override
   public boolean isEmpty() {
	   return top == -1;
	    
  }
   
   @Override
   public int size() {
	   return top + 1;
	   
  }
   
   @SuppressWarnings("unchecked") private void expandCapacity() {
	   T[] largerStack = (T[]) new Object[stack.length * 2];
	   
	     System.arraycopy(stack, 0, largerStack, 0, stack.length);
	       stack = largerStack;
   }
    
}
 
