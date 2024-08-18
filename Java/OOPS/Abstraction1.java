abstract class Shape{
	abstract void draw();
}
class Rectangle extends Shape{
	void draw(){
		System.out.println("drawing rectangle");
	}
}
class Circle extends Shape{
	void draw(){
		System.out.println("Circle Shape");
	}
}
class UseAbstraction{
	public static void main(String argsp[]){
		Shape sp = new Rectangle();
		sp.draw();
		
		Circle cr = new Circle();
		cr.draw();
	}
}