import java.io.*;
class Demo{
	public static void main(String args[]){
		try{
			FileReader fr = new FileReader("c:\\Users\\HP\\OneDrive\\Desktop\\newFile.txt");
			try{
				int i;
				while((i=fr.read()) != -1){
					System.out.print((char)i);
				}
			}
			finally{
				fr.close();
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}