import java.io.*;
class FileCreate{
	public static void main(String args[]) // throws IOException
	{
		File f = new File("c:\\Users\\HP\\OneDrive\\Desktop\\newFile.txt");
		try{
			if(f.createNewFile()){
				System.out.println("File Successfully Created..");
			}
			else{
				System.out.println("File Already Exist..");
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}