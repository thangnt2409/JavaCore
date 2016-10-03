package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arrayList = new ArrayList<Integer>();
		//ArrayList( ) : xây dựng một danh sách mảng trống.
	//ArrayList<Integer> arrayList = new ArrayList<Integer>();

		for (int i = 1; i <= 10; i++) {
			//Thêm phần tử đã cho tới cuối của arrayList
			arrayList.add(i);
		}
		arrayList.add(6);
		
		System.out.println("arrayList: " + arrayList);
		//ArrayList(Collection c) : 
		//xây dựng một Array List mà được khởi tạo với các phần tử của collection c.
		List<Integer> arrayList2 = new ArrayList<Integer>(arrayList);
		System.out.println("arrayList2: " + arrayList2);
		
		//ArrayList(int capacity) : 
		//xây dựng một Array List mà có dung lượng ban đầu được xác định. 
		//Dung lượng tự động tăng khi các phần tử được thêm vào Array List.
		List<Integer> arrayList3 = new ArrayList<Integer>(5);
		//Thêm tất cả phần tử trong arrayList2 vào arrayList3
		arrayList3.addAll(arrayList2);
		System.out.println("arrayList3: " + arrayList3);
		//Xóa phần tử tại index từ List đang gọi và trả về phần tử bị xóa đó.
		System.out.println("remove: " + arrayList.remove(6));
		System.out.println("arrayList: " + arrayList);
		//Gán 22 tới vị trí 9 bên trong arrayList
		arrayList.set(9,22);
		System.out.println("set: " + arrayList);
		System.out.println("arrayList: " + arrayList);
		//Trả về một list mà bao gồm các phần tử từ start tới end-1 trong List đang gọi.
		System.out.println("subList: " + arrayList.subList(3, 7));
		//Trả về đối tượng được lưu giữ tại index 
		System.out.println("get index = 3: " + arrayList.get(3));
		//Trả về index của sự xuất hiện đầu tiên của obj trong arrayList 
		System.out.println("indexOf index = 6: " + arrayList.indexOf(6));
		//Trả về index của sự xuất hiện cuối cùng của obj trong arrayList
		System.out.println("lastIndexOf index = 6: " + arrayList.lastIndexOf(6));
		
		
		//Trả về true nếu list này chứa phần tử đã cho.
		System.out.println("Contains: " + arrayList.contains(4));
		//Trả về kích thước của mảng
		System.out.println("Size: " + arrayList.size());
		//Trả về mảng chứa tất cả phần tử trong arrayList 
		System.out.println("Size: " + arrayList.toArray());
		
		
		
		
		arrayList.clear();
		System.out.println("arrayList: " + arrayList);
	}

}
