import java.util.Stack;

public class dupicate {
public static void main(String args[])
{
	Stack<Character> stk=new Stack();
   
   StringBuilder s=new  StringBuilder("harry");
   int i;
         
   for( i=0;i<s.length()-1;i++);
   {
	   if(!(stk.isEmpty()) && stk.peek()==s.charAt(i))
	   {
		   stk.pop();
		  
	   }
	   else
	   {
		   stk.push(s.charAt(i));
	   }
	   
   }
   while(!(stk.isEmpty()))
		   {
	          s.append(stk.pop());
	          
		   }
   System.out.println(s.reverse().toString());
   
}
}
