package Date;

import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Date date = new Date();
		 Date date2 = new Date(2016, 10, 04);
	     System.out.println("after: "+date.after(date2));
	     System.out.println("before: "+date.before(date2));
	     System.out.println("compareTo: "+date2.compareTo(date));
	     System.out.println("equals: "+date.equals(date2));
	     System.out.println("getTime: "+date.getTime());
	     System.out.println("hashCode: "+date.hashCode());
	     date.setTime(49058270);
	     System.out.println("getTime: "+date.getTime());
	     System.out.println("toString: "+date.toString());
	}
//	after: false
//	before: true
//	compareTo: 1
//	equals: false
//	getTime: 1475490667617
//	hashCode: -1978081994
//	getTime: 49058270
//	toString: Thu Jan 01 20:37:38 ICT 1970
}
