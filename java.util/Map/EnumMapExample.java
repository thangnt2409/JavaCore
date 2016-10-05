package Map;

import java.util.EnumMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class EnumMapExample {
	public enum STATE{
        NEW, RUNNING, WAITING, FINISHED;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<STATE, String> stateMap = new EnumMap<STATE, String>(STATE.class);
		Map<STATE, String> stateMap3 = new EnumMap<STATE, String>(STATE.class);
        stateMap.put(STATE.RUNNING, "Program is running");
        stateMap.put(STATE.WAITING, "Program is waiting");
        stateMap.put(STATE.NEW, "Program has just created");
        stateMap.put(STATE.FINISHED, "Program has finished");
        Map<STATE, String> stateMap2 =new EnumMap<STATE, String>(stateMap);
        System.out.println("stateMap: " + stateMap);
		System.out.println("containsKey: " + stateMap.containsKey(STATE.NEW));
		System.out.println("containsValue: " + stateMap.containsValue(STATE.NEW));
		System.out.println("entrySet: " + stateMap.entrySet());
		System.out.println("equals: " + stateMap.equals(stateMap2));
		System.out.println("get: " + stateMap.get(STATE.NEW));
		System.out.println("hashCode: " + stateMap.hashCode());
		System.out.println("isEmpty: " + stateMap.isEmpty());
		System.out.println("keySet: " + stateMap.keySet());
		System.out.println("put: " + stateMap.put(STATE.WAITING, "Program is waiting"));
		System.out.println("stateMap: " + stateMap);
		stateMap3.putAll(stateMap);
		System.out.println("hashtable3: " + stateMap3);
		System.out.println("remove: " + stateMap.remove(STATE.NEW));
		System.out.println("stateMap: " + stateMap);
		System.out.println("size: " + stateMap.size());
		System.out.println("values: " + stateMap.values());

	}
//	stateMap: {NEW=Program has just created, RUNNING=Program is running, WAITING=Program is waiting, FINISHED=Program has finished}
//	containsKey: true
//	containsValue: false
//	entrySet: [NEW=Program has just created, RUNNING=Program is running, WAITING=Program is waiting, FINISHED=Program has finished]
//	equals: true
//	get: Program has just created
//	hashCode: -1920517273
//	isEmpty: false
//	keySet: [NEW, RUNNING, WAITING, FINISHED]
//	put: Program is waiting
//	stateMap: {NEW=Program has just created, RUNNING=Program is running, WAITING=Program is waiting, FINISHED=Program has finished}
//	hashtable3: {NEW=Program has just created, RUNNING=Program is running, WAITING=Program is waiting, FINISHED=Program has finished}
//	remove: Program has just created
//	stateMap: {RUNNING=Program is running, WAITING=Program is waiting, FINISHED=Program has finished}
//	size: 3
//	values: [Program is running, Program is waiting, Program has finished]
}
