package File;

public class FileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileMethod fm=new FileMethod();
		fm.createNewFile("src/demo1.txt");
		System.out.println();
		fm.FilePath();
		System.out.println();
		
		System.out.println();
		fm.RenameFile();
		fm.DeleteFile("src/demo1.txt");
		
	}
//	File already exists.
//
//	Final filepath : E:\Android\List\src\testing.txt
//	File already exists!
//
//
//	Rename succesful
//	demo1.txt is deleted!
}
