package PrintWriter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterExample {

	public static void Write2File(String fileName) throws IOException{
		//Tạo luồng xuất
		FileOutputStream out=new FileOutputStream(fileName);
		//Tạo thiết bị viết
		PrintWriter output=new PrintWriter(out,true);//auto flush
		//ghi 1 chuỗi ra file
		output.println("Nội dung cần lưu xuống file...");
		//đóng luồng
		out.close();
		output.close();
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Write2File("src/PrintWriterExample");
			System.out.println("done");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
