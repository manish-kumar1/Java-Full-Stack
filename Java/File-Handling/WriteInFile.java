import java.io.*;
class WriteInFile{
	public static void main(String args[]){
		try{
			FileWriter fw = new FileWriter("c:\\users\\HP\\OneDrive\\Desktop\\newFile.txt");
			try{
				fw.write("i am reading file handling in mid night");
			}
			finally{
				fw.close();
			}
			System.out.println("Successfully data wrote in File");
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}