class StringBuilderDemo{
	public static void main(String args[]){
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());
	}
}
//StringBuilder same as StringBuffer but StringBuilder has non-synchronized methods
//StringBuilder increase the performance of source code.

// StringBuffer has synchronized methods so it is slow as compare to StringBuilder