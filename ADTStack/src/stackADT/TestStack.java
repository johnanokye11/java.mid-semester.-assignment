package stackADT;

public class TestStack {
	
 public static void main(String[] args){
		
	 StackADT<Integer> stack = new ArrayStack<>();
	     try {
	    	 
	  System.out.println("Pushing elements...");
	     stack.push(10);
	     stack.push(20);
	     stack.push(30);
	     
	  System.out.println("Current size of the stack:" + stack.size());
	  
	  System.out.println("Top element:" + stack.peek());
	  
	  System.out.println("Popping all elements...");
	     stack.pop();
	     stack.pop();
	     
      System.out.println("Is stack empty?" + stack.isEmpty());
      
      System.out.println("Trying to pop from an empty stack...");
          stack.pop();
  }
	     
	    catch (Exception e) {
	    	
	  System.out.println("Error:" + e.getMessage());
	  
}      
}
}