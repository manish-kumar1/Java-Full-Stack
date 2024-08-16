class StringBufferDemo{
	public static void main(String args[]){
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());//default capacity of Empty StringBuffer 16
		sb.append("Hello");
		System.out.println(sb.capacity());
		sb.append("Manish Javaa"); // capacity acxid then capacity will be 
							     // (old_capacity + 1) * 2
		System.out.println(sb.capacity());  
		System.out.println(sb.length());
		sb.append(" Hello");
		System.out.println(sb.length() + " " + sb.capacity());
		System.out.println(sb.charAt(4));
		System.out.println(sb);
		System.out.println(sb.delete(3, 7));
		System.out.println(sb.deleteCharAt(0));
		System.out.println(sb);
		System.out.println(sb.indexOf("h"));
		System.out.println(sb.insert(0,"Y"));
		System.out.println(sb.replace(0, 2, "A"));
		System.out.println(sb.reverse());
		System.out.println(sb.subSequence(0, 5));
		System.out.println(sb.capacity());
		sb.ensureCapacity(50);
		System.out.println(sb.capacity());
		sb.setCharAt(4, 'X');
		System.out.println(sb);
		sb.setLength(4);
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb);
		sb.trimToSize();
		System.out.println(sb.capacity());
	}
}