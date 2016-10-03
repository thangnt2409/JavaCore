package ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LinkedList( ) : xây dựng một danh sách mảng trống.
				List<Integer> linkedList = new LinkedList<Integer>();

				for (int i = 1; i <= 10; i++) {
					//Thêm phần tử đã cho tới cuối của arrayList
					linkedList.add(i);
				}
				linkedList.add(6);
				
				System.out.println("linkedList: " + linkedList);
				//LinkedList(Collection c) : 
				//xây dựng một LinkedList mà được khởi tạo với các phần tử của collection c.
				List<Integer> linkedList2 = new LinkedList<Integer>(linkedList);
				System.out.println("linkedList2: " + linkedList2);
				//Xóa tất cả các phần tử trong mảng
				linkedList2.clear();
				System.out.println("linkedList2: " + linkedList2);
				//Thêm tất cả phần tử trong linkedList vào linkedList2
				linkedList2.addAll(linkedList);
				System.out.println("linkedList2: " + linkedList2);
				//Xóa phần tử tại index từ List đang gọi và trả về phần tử bị xóa đó.
				System.out.println("remove: " + linkedList.remove(6));
				System.out.println("linkedList: " + linkedList);
				//Gán 22 tới vị trí 9 bên trong linkedList
				linkedList.set(9,22);
				System.out.println("set: " + linkedList);
				System.out.println("linkedList: " + linkedList);
				//Trả về một list mà bao gồm các phần tử từ start tới end-1 trong List đang gọi.
				System.out.println("subList: " + linkedList.subList(3, 7));
				//Trả về đối tượng được lưu giữ tại index 
				System.out.println("get index = 3: " + linkedList.get(3));
				//Trả về index của sự xuất hiện đầu tiên của obj trong arrayList 
				System.out.println("indexOf index = 6: " + linkedList.indexOf(6));
				//Trả về index của sự xuất hiện cuối cùng của obj trong arrayList
				System.out.println("lastIndexOf index = 6: " + linkedList.lastIndexOf(6));
				
				
				//Trả về true nếu list này chứa phần tử đã cho.
				System.out.println("Contains: " + linkedList.contains(4));
				//Trả về kích thước của mảng
				System.out.println("Size: " + linkedList.size());
				//Trả về mảng chứa tất cả phần tử trong linkedList 
				System.out.println("Size: " + linkedList.toArray());	
				
	}

//			linkedList: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 6]
//			linkedList2: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 6]
//			linkedList2: []
//			linkedList2: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 6]
//			remove: 7
//			linkedList: [1, 2, 3, 4, 5, 6, 8, 9, 10, 6]
//			set: [1, 2, 3, 4, 5, 6, 8, 9, 10, 22]
//			linkedList: [1, 2, 3, 4, 5, 6, 8, 9, 10, 22]
//			subList: [4, 5, 6, 8]
//			get index = 3: 4
//			indexOf index = 6: 5
//			lastIndexOf index = 6: 5
//			Contains: true
//			Size: 10
//			Size: [Ljava.lang.Object;@15db9742
}
