/*
Private Inner Class
Unlike a "regular" class, an inner class can be private or protected. 
If you don't want outside objects to access the inner class, declare the class as private:
*/
class OuterClass {
	int x = 10;

  //private class InnerClass { // can't access outside the class error
	public class InnerClass{  // public, protected, and default can use
		int y = 5;
	}
}

class Main {
	public static void main(String[] args) {
		OuterClass myOuter = new OuterClass();
		OuterClass.InnerClass myInner = myOuter.new InnerClass();
		System.out.println(myInner.y + myOuter.x);
	}
}