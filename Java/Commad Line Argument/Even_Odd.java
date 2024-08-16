class Even_Odd{
	public static void main(String args[]){
		int valid = 0, invalid = 0;
		
		for(int i = 0; i < args.length; i++){
			try{
				int num = Integer.parseInt(args[i]);
				valid++;
			}
			catch(NumberFormatException e){
				invalid++;
			}
		}
		System.out.println(valid+" "+invalid);
		

	}
}