class Circle{
	public static void main(String args[]){
		int rad = Integer.parseInt(args[0]);
		float area = (float)(Math.PI*Math.pow(rad,2));
		float circ = (float)(2*Math.PI*rad);
		System.out.println(area+"\n"+circ);
	}
}
