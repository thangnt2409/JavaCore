package ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> stack = new Stack<Integer>();
		List<Integer> stack2 = new Stack<Integer>();
		for (int i = 1; i <= 10; i++) {
			//Thêm phần tử đã cho tới cuối của stack
			stack.add(i);
		}
		stack.add(6);
		
		System.out.println("stack: " + stack);
		
		
		
		//Xóa tất cả các phần tử trong mảng
		stack2.clear();
		System.out.println("stack2: " + stack2);
		//Thêm tất cả phần tử trong stack vào stack2
		stack2.addAll(stack);
		System.out.println("stack2: " + stack2);
		//Xóa phần tử tại index từ List đang gọi và trả về phần tử bị xóa đó.
		System.out.println("remove: " + stack.remove(6));
		System.out.println("stack: " + stack);
		//Gán 22 tới vị trí 9 bên trong stack
		stack.set(9,22);
		System.out.println("set: " + stack);
		System.out.println("stack: " + stack);
		//Trả về một list mà bao gồm các phần tử từ start tới end-1 trong List đang gọi.
		System.out.println("subList: " + stack.subList(3, 7));
		//Trả về đối tượng được lưu giữ tại index 
		System.out.println("get index = 3: " + stack.get(3));
		//Trả về index của sự xuất hiện đầu tiên của obj trong stack 
		System.out.println("indexOf index = 6: " + stack.indexOf(6));
		//Trả về index của sự xuất hiện cuối cùng của obj trong stack
		System.out.println("lastIndexOf index = 6: " + stack.lastIndexOf(6));
		
		
		//Trả về true nếu stack này chứa phần tử đã cho.
		System.out.println("Contains: " + stack.contains(4));
		//Trả về kích thước của mảng
		System.out.println("Size: " + stack.size());
		//Trả về mảng chứa tất cả phần tử trong stack 
		System.out.println("Size: " + stack.toArray());	
	}

//			stack: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 6]
//			stack2: []
//			stack2: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 6]
//			remove: 7
//			stack: [1, 2, 3, 4, 5, 6, 8, 9, 10, 6]
//			set: [1, 2, 3, 4, 5, 6, 8, 9, 10, 22]
//			stack: [1, 2, 3, 4, 5, 6, 8, 9, 10, 22]
//			subList: [4, 5, 6, 8]
//			get index = 3: 4
//			indexOf index = 6: 5
//			lastIndexOf index = 6: 5
//			Contains: true
//			Size: 10
//			Size: [Ljava.lang.Object;@15db9742
}
