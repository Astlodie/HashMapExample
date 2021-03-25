import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Iterator;
import java.util.Set;

public class HashMapExample {
	
	public static void main(String args[]) {

	      /* This is how to declare HashMap */
	      HashMap<Integer, String> hmap = new HashMap<Integer, String>();

	      /*Adding elements to HashMap*/
	      hmap.put(1, "One");
	      hmap.put(2, "Two");
	      hmap.put(3, "Three");
	      hmap.put(4, "Four");
	      hmap.put(5, "Five");
	      hmap.put(6, "Six");
	      hmap.put(7, "Seven");
	      hmap.put(8, "Eight");
	      hmap.put(9, "Nine");
	      hmap.put(10, "Ten");

	      /* Display content using Iterator*/
	      Set<Entry<Integer, String>> set = hmap.entrySet();
	      Iterator<Entry<Integer, String>> iterator = set.iterator();
	      while(iterator.hasNext()) {
	         @SuppressWarnings("rawtypes")
			Map.Entry mentry = (Map.Entry)iterator.next();
	         System.out.print("The input is: "+ mentry.getKey() + " & The value is: ");
	         System.out.println(mentry.getValue());
	      }

	      /* Get values based on key*/
	      String var= hmap.get(2);
	      System.out.println("The value at index 2 is: "+var);
}
}