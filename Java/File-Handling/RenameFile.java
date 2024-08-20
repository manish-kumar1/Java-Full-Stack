import java.io.*;
class RenameFile{
	public static void main(String args[]){
		File f = new File("c:\\Users\\HP\\OneDrive\\Desktop\\newFile.txt");
		File r = new File("c:\\Users\\HP\\OneDrive\\Desktop\\changeFile.txt");
		
		if(f.exists()){
			System.out.println(f.renameTo(r));
		}
		else{
			System.out.println("File not exist");
		}
	}
}