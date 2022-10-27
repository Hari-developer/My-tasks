
import java.util.Stack;
 
public class adjus {
	public static void main(String args[])
	{
		
	String str="czccbd";
      Stack<Character> stk=new Stack();
	
	      stk.push(str.charAt(0));
	      
	    	  for(int i=1;i<str.length();i++)
	    	  {
	    		  if(stk.peek()==str.charAt(i))
	    		  {
	    			  stk.pop();
	    			  continue;
	    		  }
	    		  stk.push(str.charAt(i));
	    	  }
	      StringBuffer obj=new StringBuffer();
	      
	      while(!stk.empty())
	      {
	    	  obj.append(stk.pop());
	      }
	      System.out.println(obj.reverse().toString());
	}
	
}

