
public class removeadjacent {

	public static void main(String[] args) {
	
		String string="abccbdabbc";
		if (string == null)
		{ 
			 System.out.println("Empty");
		}
		char[] chars = string.toCharArray(); 
		char previous = ' '; 
		int i = 0;
		for (char c: chars) 
		{ 
			if (c != previous) 
		{ 
				 chars[i++] = c;
	                previous = c;
				
}
}
		System.out.println();

}
}