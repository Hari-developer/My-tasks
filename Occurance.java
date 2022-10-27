import java.util.HashMap;

public class Occurance {

	public static void main(String[] args) {
		
		String name="Teleapps";
		
		char[] arr=name.toCharArray();
		
		int count=0;
		HashMap<Character,Integer> hm=new HashMap<>();
		
		for(int i=0;i<arr.length-1;i++)
		{
			char c=name.charAt(i);
			{
				if(hm.containsKey(c))
				{
				hm.get(c);
				count++;
				hm.replace(c, count);
				}
				else
				{
					hm.put(c,1);
				}
		}
		
		}
		System.out.println(hm);
		
	}
}
