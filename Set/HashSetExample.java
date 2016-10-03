package Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> hashSet=new HashSet<>();
		hashSet.add("B");
		hashSet.add("A");
		hashSet.add("D");
		hashSet.add("E");
		hashSet.add("C");
		hashSet.add("F");
		hashSet.add("F");
		System.out.println("hashSet: " + hashSet);
		System.out.println("contains: " + hashSet.contains("C"));
		System.out.println("isEmpty: " + hashSet.isEmpty());
		System.out.println("iterator: " + hashSet.iterator());
		System.out.println("remove: " + hashSet.remove("B"));
		System.out.println("hashSet: " + hashSet);
		System.out.println("size: " + hashSet.size());
		hashSet.clear();
		System.out.println("hashSet: " + hashSet);
		
	}
//			hashSet: [A, B, C, D, E, F]
//			contains: true
//			isEmpty: false
//			iterator: java.util.HashMap$KeyIterator@15db9742
//			remove: true
//			hashSet: [A, C, D, E, F]
//			size: 5
//			hashSet: []
}
