import java.io.*;
class FileInfo{
	public static void main(String args[]){
		File f = new File("c:\\users\\HP\\OneDrive\\desktop\\newFile.txt");
		if(f.exists()){
			System.out.println("File Name: "+f.getName());
			System.out.println("File Location: "+f.getAbsolutePath());
			System.out.println("File Writable: "+f.canWrite());
			System.out.println("File Readable: "+f.canRead());
			System.out.println("File Size: "+f.length());
			System.out.println("File Removed: "+f.delete());
		}
		else{
			System.out.println("File not exit");
		}
	}
}