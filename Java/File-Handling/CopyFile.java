import java.io.*;
class CopyFile{
	public static void main(String args[]) throws IOException{
		FileInputStream r = new FileInputStream("c:\\Users\\HP\\OneDrive\\Desktop\\changeFile.txt");
		FileOutputStream w = new FileOutputStream("c:\\Users\\HP\\OneDrive\\Desktop\\newFile.txt");
		
		int i;
		while((i=r.read()) != -1){
			w.write((char)i);
		}
		System.out.println("SuccessFully Copied");
	}
}
		