
public class neww {
	
	public static String removeDuplicate(String s) {
		   if ( s == null ) return null;
		   if ( s.length() <= 1 ) return s;
		   if( s.substring(1,2).equals(s.substring(0,1))) 
		      return removeDuplicate(s.substring(1));
		   else return s.substring(0,1) + removeDuplicate(s.substring(1));
		}

	public static void main(String[] args) {
		String s="abbayz";
		
		System.out.println(removeDuplicate(s));

	}

}
