package wl.p08;

import java.util.Scanner;
import java.util.Stack;

public class ParenthesisAppQ3 {
		  public static void main(String[] args) {
		        // TODO Auto-generated method stub
		        /*
		         * create an empty stack
		            get first character of expression
		            while not end of expression do
		              if character is ‘(‘ then
		                StackPush ‘(‘
		              else 
		                if character is ‘)’ then
		               if IsStackEmpty = true then
		                 error
		               else 
		                   StackPop
		                       Get next character of expression
		            endwhile
		            if IsStackEmpty = false then
		              error
		         * 
		         */ 
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter an expression:");
		        String exp = sc.nextLine();
		        sc.close();
		        Stack<String> stack = new Stack<String>();
		        for (int i = 0; i < exp.length(); i++) 
		        {
		            String c = exp.substring(i, i+1);
		            if (c.equals("(") || c.equals("[") || c.equals("{")) 
		            {
		                stack.push(c);
		            } 
		            else if (c.equals(")") || c.equals("]") || c.equals("}")) 
		            {
		                if (stack.isEmpty()) 
		                {
		                    System.out.println("Can't find a match for the '"+ c +"'.");
		                    return;
		                }
		                else 
		                {
		                    String left = stack.pop();
		                    if (!matching(c,left))
		                    {
		                        System.out.println("Can't find a match for the '"+ c +"'.");
		                        return;
		                    } else {} // nothing to do
		                }
		            }
		            else { } // it's neither a ( nor a ), thus, nothing to do.
		        }
		        if (!stack.isEmpty())
		        {
		            String left = stack.peek();
		            System.out.println("Can't find a match for the '" + left +"'.");            
		        }
		        return;
		    }
		    
		    public static boolean matching(String right, String left) 
		    {
		        if ((left.equals("(")) && (right.equals(")")))
		        {
		            return true;
		        }
		        else if ((left.equals("[")) && (right.equals("]")))
		        {
		            return true;
		        }
		        else if ((left.equals("{")) && (right.equals("}")))
		        {
		            return true;
		        }
		        else { return false; }
		    }
		
	}
