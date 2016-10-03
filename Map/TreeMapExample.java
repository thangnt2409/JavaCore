package Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> treeMap =new TreeMap<>();
		Map<Integer, String> treeMap3 =new TreeMap<>();
		treeMap.put(1, "A");
		treeMap.put(3, "C");
		treeMap.put(2, "B");
		Map<Integer, String> treeMap2 =new TreeMap<>(treeMap);
		System.out.println("treeMap: " + treeMap);
		System.out.println("containsKey: " + treeMap.containsKey(2));
		System.out.println("containsValue: " + treeMap.containsValue(2));
		System.out.println("entrySet: " + treeMap.entrySet());
		System.out.println("equals: " + treeMap.equals(treeMap2));
		System.out.println("get: " + treeMap.get(2));
		System.out.println("hashCode: " + treeMap.hashCode());
		System.out.println("isEmpty: " + treeMap.isEmpty());
		System.out.println("keySet: " + treeMap.keySet());
		System.out.println("put: " + treeMap.put(2, "D"));
		System.out.println("treeMap: " + treeMap);
		treeMap3.putAll(treeMap);
		System.out.println("treeMap3: " + treeMap3);
		System.out.println("remove: " + treeMap.remove(2));
		System.out.println("treeMap: " + treeMap);
		System.out.println("size: " + treeMap.size());
		System.out.println("values: " + treeMap.values());
	}
//	treeMap: {1=A, 2=B, 3=C}
//	containsKey: true
//	containsValue: false
//	entrySet: [1=A, 2=B, 3=C]
//	equals: true
//	get: B
//	hashCode: 192
//	isEmpty: false
//	keySet: [1, 2, 3]
//	put: B
//	treeMap: {1=A, 2=D, 3=C}
//	treeMap3: {1=A, 2=D, 3=C}
//	remove: D
//	treeMap: {1=A, 3=C}
//	size: 2
//	values: [A, C]

}
