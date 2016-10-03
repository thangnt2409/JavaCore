package Map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> hashtable =new Hashtable<>();
		Map<Integer, String> hashtable3 =new Hashtable<>(5);
		hashtable.put(1, "A");
		hashtable.put(2, "B");
		hashtable.put(3, "C");
		Map<Integer, String> hashtable2 =new Hashtable<>(hashtable);
		System.out.println("hashtable: " + hashtable);
		System.out.println("containsKey: " + hashtable.containsKey(2));
		System.out.println("containsValue: " + hashtable.containsValue(2));
		System.out.println("entrySet: " + hashtable.entrySet());
		System.out.println("equals: " + hashtable.equals(hashtable2));
		System.out.println("get: " + hashtable.get(2));
		System.out.println("hashCode: " + hashtable.hashCode());
		System.out.println("isEmpty: " + hashtable.isEmpty());
		System.out.println("keySet: " + hashtable.keySet());
		System.out.println("put: " + hashtable.put(2, "D"));
		System.out.println("hashtable: " + hashtable);
		hashtable3.putAll(hashtable);
		System.out.println("hashtable3: " + hashtable3);
		System.out.println("remove: " + hashtable.remove(2));
		System.out.println("hashtable: " + hashtable);
		System.out.println("size: " + hashtable.size());
		System.out.println("values: " + hashtable.values());
	}

//	hashtable: {3=C, 2=B, 1=A}
//	containsKey: true
//	containsValue: false
//	entrySet: [3=C, 2=B, 1=A]
//	equals: true
//	get: B
//	hashCode: 192
//	isEmpty: false
//	keySet: [3, 2, 1]
//	keySet: B
//	hashtable: {3=C, 2=D, 1=A}
//	hashtable3: {3=C, 2=D, 1=A}
//	remove: D
//	hashtable: {3=C, 1=A}
//	size: 2
//	values: [C, A]
}
