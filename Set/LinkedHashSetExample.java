package Set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> linkedHashSet=new LinkedHashSet<>();
		linkedHashSet.add("B");
		linkedHashSet.add("A");
		linkedHashSet.add("D");
		linkedHashSet.add("E");
		linkedHashSet.add("C");
		linkedHashSet.add("F");
		linkedHashSet.add("F");
		System.out.println("linkedHashSet: " + linkedHashSet);
		System.out.println("contains: " + linkedHashSet.contains("C"));
		System.out.println("isEmpty: " + linkedHashSet.isEmpty());
		System.out.println("iterator: " + linkedHashSet.iterator());
		System.out.println("remove: " + linkedHashSet.remove("B"));
		System.out.println("linkedHashSet: " + linkedHashSet);
		System.out.println("size: " + linkedHashSet.size());
		linkedHashSet.clear();
		System.out.println("linkedHashSet: " + linkedHashSet);
	}
//			linkedHashSet: [B, A, D, E, C, F]
//			contains: true
//			isEmpty: false
//			iterator: java.util.LinkedHashMap$LinkedKeyIterator@15db9742
//			remove: true
//			linkedHashSet: [A, D, E, C, F]
//			size: 5
//			linkedHashSet: []

}
