package com.example.data_structure.stack;


import java.util.Stack;

public class StackOperation {

	  
	    //function to reverse the string
	    public void reverse(StringBuffer str) {
	        // Create a stack of capacity 
	        // equal to length of string
	        int n = str.length();
	        Stack<Character> obj = new Stack<Character>();
	         
	        // Push all characters of string 
	        // to stack
	        int i;
	        for (i = 0; i < n; i++) {
	           obj.push(str.charAt(i));
	        }
	        // Pop all characters of string 
	        // and put them back to str
	        for (i = 0; i < n; i++){ 
	             char ch = obj.pop();
	             str.setCharAt(i,ch);
	           }
	    }
	    
	    static boolean arePair(char opening,char closing)
		{
			if(opening == '(' && closing == ')') return true;
			else if(opening == '{' && closing == '}') return true;
			else if(opening == '[' && closing == ']') return true;
			return false;
		}
		
	    public static boolean isBalanced(String s) {
	    	int len=s.length();
	    	if(len==0 || s==null) return true;
	    	
	    	Stack<Character> stack = new Stack<Character>();
	    	
	    for(int i=0;i<s.length();i++)
	    {
	        if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{')  
	        	stack.push(s.charAt(i));
	        
	        else if(s.charAt(i)==')' || s.charAt(i)==']' || s.charAt(i)=='}') {
	        	if(stack.empty() || !arePair(stack.peek(),s.charAt(i))) 
	        		return false;
	        	else
	        		stack.pop();
	        }
	        
	    }
	    return stack.empty() ? true : false;
	    }
	    
	    
	    
	    // Function to verify whether a character is operator symbol or not. 
	    static boolean IsOperator(char C)
	    {
	    	if(C == '+' || C == '-' || C == '*' || C == '/' || C== '^')
	    		return true;

	    	return false;
	    }

	    
	    
	    static int Precedence(char op)
	    {
	    	int weight = -1; 
	    	switch(op)
	    	{
	    	case '+':
	    	case '-':
	    		return weight = 1;
	    	case '*':
	    	case '/':
	    		return weight = 2;
	    	case '^':
	    		return weight = 3;
	    	}
	    	return weight;
	    }
	    
	    	    
	    public static String infixToPostfix(String exp) {
		
	    	String postfix = new String("");
	    	
	    	Stack<Character> stack = new Stack<Character>();
	    	
	    	for(int i = 0; i < exp.length(); i++) {
	    		char c = exp.charAt(i);
	    		
	    		if(Character.isLetterOrDigit(c))
	    			postfix +=c;
	    		
	    		else if (c == '(') 
	    		{
	    			stack.push(c);
	    		}
	    		else if(c == ')') 
	    		{
	    			while (!stack.empty() && stack.peek() != '(')
	                    postfix += stack.pop();
	                 
	                if (!stack.empty() && stack.peek() != '(')
	                    return "Invalid Expression"; // invalid expression                
	                else
	                    stack.pop();
	    		}

	    		else if(IsOperator(c)) 
	    		{
	    			while (!stack.empty() && Precedence(c) <= Precedence(stack.peek()))
	                    postfix += stack.pop();
	                	stack.push(c);
	                }
	    		
	    		
	    	}

	    	while(!stack.empty()) {
	    		postfix += stack.pop();
	    	}

	    	
	    	return postfix;
	    }
	    
	    
	    
	    public static int getMaxArea(int hist[] ) 
	    {
	    	int n = hist.length;
	        // Create an empty stack. The stack holds indexes of hist[] array
	        // The bars stored in stack are always in increasing order of their
	        // heights.
	        Stack<Integer> s = new Stack<Integer>();
	         
	        int max_area = 0; // Initialize max area
	        int top;  // To store top of stack
	        int area_with_top; // To store area with top bar as the smallest bar
	      
	        // Run through all bars of given histogram
	        int i = 0;
	        while (i < n)
	        {
	            // If this bar is higher than the bar on top stack, push it to stack
	            if (s.empty() || hist[s.peek()] <= hist[i])
	                s.push(i++);
	      
	            // If this bar is lower than top of stack, then calculate area of rectangle 
	            // with stack top as the smallest (or minimum height) bar. 'i' is 
	            // 'right index' for the top and element before top in stack is 'left index'
	            else
	            {
	                top = s.peek();  // store the top index
	                s.pop();  // pop the top
	      
	                // Calculate the area with hist[tp] stack as smallest bar
	                area_with_top = hist[top] * (s.empty() ? i : i - s.peek() - 1);
	      
	                // update max area, if needed
	                if (max_area < area_with_top)
	                    max_area = area_with_top;
	            }
	        }
	      
	        // Now pop the remaining bars from stack and calculate area with every
	        // popped bar as the smallest bar
	        while (s.empty() == false)
	        {
	            top = s.peek();
	            s.pop();
	            area_with_top = hist[top] * (s.empty() ? i : i - s.peek() - 1);
	      
	            if (max_area < area_with_top)
	                max_area = area_with_top;
	        }
	      
	        return max_area;
	 
	    }
}
