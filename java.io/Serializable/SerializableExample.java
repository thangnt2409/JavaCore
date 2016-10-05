package Serializable;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableExample {
	public static void writeFile(String patch, Object a)
	{
		File file = new File(patch);
		 
        try (FileOutputStream fop = new FileOutputStream(file)) {
            if (!file.exists()) {
                file.createNewFile();
            }
            ObjectOutputStream oOT = new ObjectOutputStream(fop); // Sử dụng để ghi file theo từng Object
            oOT.writeObject(a); // Ghi  Object là đối tượng a xuống file
            oOT.close();
            fop.close();
            System.out.println("Ghi hoàn thành.");
            
  
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	public static Object readFile(String patch)
	{
		File file = new File(patch);
		Object a=null;
		try (FileInputStream fis = new FileInputStream(file)) {
			System.out.println("Kích thước file (in bytes) : "+ fis.available());
			int content;			
			ObjectInputStream oIT = new ObjectInputStream(fis); // Sử dụng để đọc file theo từng Object
            a =  oIT.readObject(); //Đọc Object 
            oIT.close();
            fis.close();

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     SinhVien b = new SinhVien();
	     b.setHoTen("Nguyễn Văn A");
	     b.setMSSV("7339922745");
	     writeFile("src/SerializableExample",b);
	   SinhVien a=(SinhVien)  readFile("src/SerializableExample");
	   System.out.println("Thông tin sinh viên đọc ra là: \nTên: " + a.getHoTen() + "\nMSSV: " + a.getMSSV());
	}
//	Ghi hoàn thành.
//	Kích thước file (in bytes) : 114
//	Thông tin sinh viên đọc ra là: 
//	Tên: Nguyễn Văn A
//	MSSV: 7339922745
}
