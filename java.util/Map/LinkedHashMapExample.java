package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> linkedHashMap =new LinkedHashMap<>();
		Map<Integer, String> linkedHashMap3 =new LinkedHashMap<>(5);
		linkedHashMap.put(1, "A");
		linkedHashMap.put(2, "B");
		linkedHashMap.put(3, "C");
		Map<Integer, String> linkedHashMap2 =new LinkedHashMap<>(linkedHashMap);
		System.out.println("linkedHashMap: " + linkedHashMap);
		System.out.println("containsKey: " + linkedHashMap.containsKey(2));
		System.out.println("containsValue: " + linkedHashMap.containsValue(2));
		System.out.println("entrySet: " + linkedHashMap.entrySet());
		System.out.println("equals: " + linkedHashMap.equals(linkedHashMap2));
		System.out.println("get: " + linkedHashMap.get(2));
		System.out.println("hashCode: " + linkedHashMap.hashCode());
		System.out.println("isEmpty: " + linkedHashMap.isEmpty());
		System.out.println("keySet: " + linkedHashMap.keySet());
		System.out.println("put: " + linkedHashMap.put(2, "D"));
		System.out.println("linkedHashMap: " + linkedHashMap);
		linkedHashMap3.putAll(linkedHashMap);
		System.out.println("linkedHashMap3: " + linkedHashMap3);
		System.out.println("remove: " + linkedHashMap.remove(2));
		System.out.println("linkedHashMap: " + linkedHashMap);
		System.out.println("size: " + linkedHashMap.size());
		System.out.println("values: " + linkedHashMap.values());
	}
//	linkedHashMap: {1=A, 2=B, 3=C}
//	containsKey: true
//	containsValue: false
//	entrySet: [1=A, 2=B, 3=C]
//	equals: true
//	get: B
//	hashCode: 192
//	isEmpty: false
//	keySet: [1, 2, 3]
//	put: B
//	linkedHashMap: {1=A, 2=D, 3=C}
//	linkedHashMap3: {1=A, 2=D, 3=C}
//	remove: D
//	linkedHashMap: {1=A, 3=C}
//	size: 2
//	values: [A, C]
}
