import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class Test{
	void readFile() throws FileNotFoundException{
		FileInputStream fis = new FileInputStream("c:\fileInput.txt");
		// statements
	}
	void saveFiles() throws FileNotFoundException{
		String test = "this is demo";
		FileOutputStream fos = new FileOutputStream("Downloads/fileInput.txt");
		
	}
}
class Demo{
	public static void main(String args[]){
		Test t = new Test();
		try{
			t.readFile();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		try{
			t.saveFiles();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}
}
