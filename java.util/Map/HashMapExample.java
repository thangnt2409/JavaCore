package Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map =new HashMap<>();
		Map<Integer, String> map3 =new HashMap<>(5);
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		Map<Integer, String> map2 =new HashMap<>(map);
		System.out.println("map: " + map);
		System.out.println("containsKey: " + map.containsKey(2));
		System.out.println("containsValue: " + map.containsValue(2));
		System.out.println("entrySet: " + map.entrySet());
		System.out.println("equals: " + map.equals(map2));
		System.out.println("get: " + map.get(2));
		System.out.println("hashCode: " + map.hashCode());
		System.out.println("isEmpty: " + map.isEmpty());
		System.out.println("keySet: " + map.keySet());
		System.out.println("put: " + map.put(2, "D"));
		System.out.println("map: " + map);
		map3.putAll(map);
		System.out.println("map3: " + map3);
		System.out.println("remove: " + map.remove(2));
		System.out.println("map: " + map);
		System.out.println("size: " + map.size());
		System.out.println("values: " + map.values());
	}
//	map: {1=A, 2=B, 3=C}
//	containsKey: true
//	containsValue: false
//	entrySet: [1=A, 2=B, 3=C]
//	equals: true
//	get: B
//	hashCode: 192
//	isEmpty: false
//	keySet: [1, 2, 3]
//	keySet: B
//	map: {1=A, 2=D, 3=C}
//	map3: {1=A, 2=D, 3=C}
//	remove: D
//	map: {1=A, 3=C}
//	size: 2
//	values: [A, C]
}
