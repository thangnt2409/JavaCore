package Java.lang;

public class StringBuilderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder sb=new StringBuilder("Hello ");  
		//nối chuỗi
		sb.append("Java");
		System.out.println(sb);
		
		//chèn chuỗi đã cho vào chuỗi tại vị trí đã cho
		sb.insert(1,"Java");
		System.out.println(sb);
		
		//thay thế chuỗi đã cho bắt đầu từ 1 tới 3.
		sb.replace(1,3,"Java");  
		System.out.println(sb);
		
		//xóa chuỗi bắt đầu từ chỉ mục 1 tới 3 
		sb.delete(1,3);  
		System.out.println(sb);
		
		//đảo chuỗi
		sb.reverse();
		System.out.println(sb);
		
		//trả về ký tự tại 4
		System.out.println(sb.charAt(1));
		
		//độ dài chuỗi
		System.out.println(sb.length());
		
		//trả về chuỗi con từ vị trí 3 đến kết thúc chuỗi
		System.out.println(sb.substring(3));
		
		//trả về chuỗi con từ vị trí 3 đến vị trí 10
		System.out.println(sb.substring(3,10));
	}
//	Hello Java
//	HJavaello Java
//	HJavavaello Java
//	Hvavaello Java
//	avaJ olleavavH
//	v
//	14
//	J olleavavH
//	J ollea
}
