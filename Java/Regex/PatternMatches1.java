import java.util.regex.*;
class Demo{
	public static void main(String ags[]){
		//Pattern pattern = Pattern.compile("Mister");  // Match not found
		Pattern pattern = Pattern.compile("Mister", Pattern.CASE_INSENSITIVE);  // match found
		Matcher matcher = pattern.matcher("Hii i am mister kumar");
		boolean b = matcher.find();
		
		if(b){
			System.out.println("Match found");
		}
		else{
			System.out.println("Match not found");
		}
	}
}