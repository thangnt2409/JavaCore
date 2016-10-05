package Set;

import java.util.EnumSet;
import java.util.Set;
import java.util.TreeSet;

import Set.EnumSetExample.Numbers;

public class EnumSetExample {
	public enum Numbers {

		   ONE, TWO, THREE, FOUR, FIVE
		   };
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Numbers> enumSet = EnumSet.of(Numbers.ONE,Numbers.TWO,Numbers.THREE,Numbers.FOUR,Numbers.FIVE);
		 
			System.out.println("enumSet: " + enumSet);
			System.out.println("contains: " + enumSet.contains(Numbers.ONE));
			System.out.println("isEmpty: " + enumSet.isEmpty());
			System.out.println("iterator: " + enumSet.iterator());
			System.out.println("remove: " + enumSet.remove(Numbers.THREE));
			System.out.println("treeSet: " + enumSet);
			System.out.println("size: " + enumSet.size());
			enumSet.clear();
			System.out.println("treeSet: " + enumSet);
	}
//			enumSet: [ONE, TWO, THREE, FOUR, FIVE]
//			contains: true
//			isEmpty: false
//			iterator: java.util.RegularEnumSet$EnumSetIterator@6d06d69c
//			remove: true
//			treeSet: [ONE, TWO, FOUR, FIVE]
//			size: 4
//			treeSet: []

}
