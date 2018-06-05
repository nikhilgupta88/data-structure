package com.ng.learning.ds.stack;

import java.util.Stack;

public class MyCodeSchoolInfixToPostfix {

    static boolean IsOperand(char c) 
    {
    	if(c >= '0' && c <= '9') return true;
    	if(c >= 'a' && c <= 'z') return true;
    	if(c >= 'A' && c <= 'Z') return true;
    	return false;
    }

    
    // Function to verify whether a character is operator symbol or not. 
    static boolean IsOperator(char C)
    {
    	if(C == '+' || C == '-' || C == '*' || C == '/' || C== '^')
    		return true;

    	return false;
    }

    
    // Function to verify whether an operator is right associative or not. 
    static boolean IsRightAssociative(char op)
    {
    	if(op == '$') return true;
    	return false;
    }

    
    static int GetOperatorWeight(char op)
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
    
    static boolean HasHigherPrecedence(char op1, char op2)
    {
    	int op1Weight = GetOperatorWeight(op1);
    	int op2Weight = GetOperatorWeight(op2);

    	// If operators have equal precedence, return true if they are left associative. 
    	// return false, if right associative. 
    	// if operator is left-associative, left one should be given priority. 
    	if(op1Weight == op2Weight)
    	{
    		if(IsRightAssociative(op1)) return false;
    		else return true;
    	}
    	return op1Weight > op2Weight ?  true: false;
    }
    
    public static String infixToPostfix(String exp) {
	
    	String postfix = new String("");
    	
    	Stack<Character> stack = new Stack<Character>();
    	
    	for(int i = 0; i < exp.length(); i++) {
    		char c = exp.charAt(i);
    		
    		if(c == ' ' || c == ',') continue; 

    		// If character is operator, pop two elements from stack, perform operation and push the result back. 
    		else if(IsOperator(c)) 
    		{
    			while(!stack.empty() && stack.peek() != '(' && HasHigherPrecedence(stack.peek(),c))
    			{
    				postfix+= stack.peek();
    				stack.pop();
    			}
    			stack.push(c);
    		}
    		// Else if character is an operand
    		else if(Character.isLetterOrDigit(c))
    		{
    			postfix +=c;
    		}

    		else if (c == '(') 
    		{
    			stack.push(c);
    		}

    		else if(c == ')') 
    		{
    			while(!stack.empty() && stack.peek() !=  '(') {
    				postfix += stack.peek();
    				stack.pop();
    			}
    			stack.pop();
    		}
    	}

    	while(!stack.empty()) {
    		postfix += stack.peek();
    		stack.pop();
    	}

    	return postfix;
    }

    public static void main(String[] args) 
    {
        String exp = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(infixToPostfix(exp));
    }
}
  