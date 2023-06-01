// First In Last Out OR Last In First Out concept
// just like the stack of plates in a weadding.

import java.util.Stack;  
public class StacksInJava  
{  
public static void main(String[] args)   
{  
//creating an instance of Stack class  
Stack<Integer> stk= new Stack<>();  
// checking stack is empty or not  
boolean result = stk.empty();  
System.out.println("Is the stack empty? " + result);  
// pushing elements into stack  
stk.push(78);  
stk.push(113);  
stk.push(90);  
stk.push(120);  
//prints elements of the stack  
System.out.println("Elements in Stack: " + stk);  
result = stk.empty();  
System.out.println("Is the stack empty? " + result);  
  
// also we can pop the last element from the stack
stk.pop();
stk.pop();
}  
}  
