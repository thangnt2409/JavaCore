package Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> treeSet=new TreeSet<>();
		treeSet.add("B");
		treeSet.add("A");
		treeSet.add("D");
		treeSet.add("E");
		treeSet.add("C");
		treeSet.add("F");
		treeSet.add("F");
		System.out.println("treeSet: " + treeSet);
		System.out.println("contains: " + treeSet.contains("C"));
		System.out.println("isEmpty: " + treeSet.isEmpty());
		System.out.println("iterator: " + treeSet.iterator());
		System.out.println("remove: " + treeSet.remove("B"));
		System.out.println("treeSet: " + treeSet);
		System.out.println("size: " + treeSet.size());
		treeSet.clear();
		System.out.println("treeSet: " + treeSet);
	}
//			treeSet: [A, B, C, D, E, F]
//			contains: true
//			isEmpty: false
//			iterator: java.util.TreeMap$KeyIterator@15db9742
//			remove: true
//			treeSet: [A, C, D, E, F]
//			size: 5
//			treeSet: []

}
