package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList arrayList = new ArrayList();
	      // them cac phan tu toi array list
		arrayList.add("C");
	      arrayList.add("E");
	      arrayList.add("B");
	      Iterator itr = arrayList.iterator();
	      while(itr.hasNext()) {
	         Object element = itr.next();
	         if(element.equals("E"))
	        	 itr.remove();
	         System.out.println(element + " ");
	      }
	      System.out.println(arrayList + " ");
	}
//	C 
//	E 
//	B 
//	[C, B] 
}
