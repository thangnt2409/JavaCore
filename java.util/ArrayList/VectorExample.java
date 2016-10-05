package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> vector = new Vector<Integer>();
		

		for (int i = 1; i <= 10; i++) {
			//Thêm phần tử đã cho tới cuối của arrayList
			vector.add(i);
		}
		vector.add(6);
		
		System.out.println("vector: " + vector);
		
		List<Integer> vector2 = new Vector<Integer>(vector);
		System.out.println("vector2: " + vector2);
		
		
		List<Integer> vector3 = new Vector<Integer>(5);
		List<Integer> vector4 = new Vector<Integer>(5,6);
		//Thêm tất cả phần tử trong vector2 vào vector3
		vector3.addAll(vector2);
		System.out.println("vector3: " + vector3);
		//Xóa phần tử tại index từ List đang gọi và trả về phần tử bị xóa đó.
		System.out.println("remove: " + vector.remove(6));
		System.out.println("vector: " + vector);
		//Gán 22 tới vị trí 9 bên trong vector
		vector.set(9,22);
		System.out.println("set: " + vector);
		System.out.println("vector: " + vector);
		//Trả về một list mà bao gồm các phần tử từ start tới end-1 trong List đang gọi.
		System.out.println("subList: " + vector.subList(3, 7));
		//Trả về đối tượng được lưu giữ tại index 
		System.out.println("get index = 3: " + vector.get(3));
		//Trả về index của sự xuất hiện đầu tiên của obj trong arrayList 
		System.out.println("indexOf index = 6: " + vector.indexOf(6));
		//Trả về index của sự xuất hiện cuối cùng của obj trong arrayList
		System.out.println("lastIndexOf index = 6: " + vector.lastIndexOf(6));
		
		
		//Trả về true nếu list này chứa phần tử đã cho.
		System.out.println("Contains: " + vector.contains(4));
		//Trả về kích thước của mảng
		System.out.println("Size: " + vector.size());
		//Trả về mảng chứa tất cả phần tử trong vector 
		System.out.println("Size: " + vector.toArray());
		
		
		
		
		vector.clear();
		System.out.println("vector: " + vector);
	}
//			vector: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 6]
//			vector2: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 6]
//			vector3: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 6]
//			remove: 7
//			vector: [1, 2, 3, 4, 5, 6, 8, 9, 10, 6]
//			set: [1, 2, 3, 4, 5, 6, 8, 9, 10, 22]
//			vector: [1, 2, 3, 4, 5, 6, 8, 9, 10, 22]
//			subList: [4, 5, 6, 8]
//			get index = 3: 4
//			indexOf index = 6: 5
//			lastIndexOf index = 6: 5
//			Contains: true
//			Size: 10
//			Size: [Ljava.lang.Object;@15db9742
//			vector: []
}
