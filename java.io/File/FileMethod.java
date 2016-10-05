package File;

import java.io.File;
import java.io.IOException;

public class FileMethod {

	public void createNewFile(String patch) {
		try {
			  
	          File file = new File(patch);
	  
	          if (file.createNewFile()){
	            System.out.println("File is created!");
	          }else{
	            System.out.println("File already exists.");
	          }
	  
	        } catch (IOException e) {
	          e.printStackTrace();
	    }
	}
	public void  FilePath() {
		try {
			  
	          String filename = "testing.txt";
	          String finalfile = "";
	          String workingDir = System.getProperty("user.dir")+"\\src";
	  
	          finalfile = workingDir + File.separator + filename;
	  
	          System.out.println("Final filepath : " + finalfile);
	          File file = new File(finalfile);
	  
	      if (file.createNewFile()){
	         System.out.println("Done");
	      }else{
	         System.out.println("File already exists!");
	      }
	  
	        } catch (IOException e) {
	          e.printStackTrace();
	    }
	}
	public void DeleteFile(String patch) {
		try{
			  
            File file = new File(patch);
  
            if(file.delete()){
                System.out.println(file.getName() + " is deleted!");
            }else{
                System.out.println("Delete operation is failed.");
            }
  
        }catch(Exception e){
  
            e.printStackTrace();
  
        }
	}
	public void RenameFile() {
		File oldfile =new File("src/testing.txt");
        File newfile =new File("src/newfile.txt");
  
        if(oldfile.renameTo(newfile)){
            System.out.println("Rename succesful");
        }else{
            System.out.println("Rename failed");
        }
	}
	
}
