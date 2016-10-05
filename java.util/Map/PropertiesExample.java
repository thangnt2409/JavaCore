package Map;

import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;

public class PropertiesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties properties =new Properties();
		Properties properties3 =new Properties();
		properties.put(1, "A");
		properties.put(3, "C");
		properties.put(2, "B");
		Properties treeMap2 =new Properties(properties);
		System.out.println("properties: " + properties);
		System.out.println("containsKey: " + properties.containsKey(2));
		System.out.println("containsValue: " + properties.containsValue(2));
		System.out.println("entrySet: " + properties.entrySet());
		System.out.println("equals: " + properties.equals(treeMap2));
		System.out.println("get: " + properties.get(2));
		System.out.println("hashCode: " + properties.hashCode());
		System.out.println("isEmpty: " + properties.isEmpty());
		System.out.println("keySet: " + properties.keySet());
		System.out.println("put: " + properties.put(2, "D"));
		System.out.println("properties: " + properties);
		properties3.putAll(properties);
		System.out.println("properties3: " + properties3);
		System.out.println("remove: " + properties.remove(2));
		System.out.println("treeMap: " + properties);
		System.out.println("size: " + properties.size());
		System.out.println("values: " + properties.values());
	}
//	properties: {3=C, 2=B, 1=A}
//	containsKey: true
//	containsValue: false
//	entrySet: [3=C, 2=B, 1=A]
//	equals: false
//	get: B
//	hashCode: 192
//	isEmpty: false
//	keySet: [3, 2, 1]
//	put: B
//	properties: {3=C, 2=D, 1=A}
//	properties3: {3=C, 2=D, 1=A}
//	remove: D
//	treeMap: {3=C, 1=A}
//	size: 2
//	values: [C, A]

}
