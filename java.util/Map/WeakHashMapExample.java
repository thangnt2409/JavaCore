package Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> weakHashMap =new WeakHashMap<>();
		Map<Integer, String> weakHashMap3 =new WeakHashMap<>(5);
		weakHashMap.put(1, "A");
		weakHashMap.put(2, "B");
		weakHashMap.put(3, "C");
		Map<Integer, String> weakHashMap2 =new WeakHashMap<>(weakHashMap);
		System.out.println("weakHashMap: " + weakHashMap);
		System.out.println("containsKey: " + weakHashMap.containsKey(2));
		System.out.println("containsValue: " + weakHashMap.containsValue(2));
		System.out.println("entrySet: " + weakHashMap.entrySet());
		System.out.println("equals: " + weakHashMap.equals(weakHashMap2));
		System.out.println("get: " + weakHashMap.get(2));
		System.out.println("hashCode: " + weakHashMap.hashCode());
		System.out.println("isEmpty: " + weakHashMap.isEmpty());
		System.out.println("keySet: " + weakHashMap.keySet());
		System.out.println("put: " + weakHashMap.put(2, "D"));
		System.out.println("weakHashMap: " + weakHashMap);
		weakHashMap3.putAll(weakHashMap);
		System.out.println("weakHashMap3: " + weakHashMap3);
		System.out.println("remove: " + weakHashMap.remove(2));
		System.out.println("weakHashMap: " + weakHashMap);
		System.out.println("size: " + weakHashMap.size());
		System.out.println("values: " + weakHashMap.values());
	}
//	weakHashMap: {3=C, 2=B, 1=A}
//	containsKey: true
//	containsValue: false
//	entrySet: [3=C, 2=B, 1=A]
//	equals: true
//	get: B
//	hashCode: 192
//	isEmpty: false
//	keySet: [3, 2, 1]
//	put: B
//	weakHashMap: {3=C, 2=D, 1=A}
//	weakHashMap3: {3=C, 2=D, 1=A}
//	remove: D
//	weakHashMap: {3=C, 1=A}
//	size: 2
//	values: [C, A]
}
