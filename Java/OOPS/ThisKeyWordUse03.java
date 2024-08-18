/*
3) this() : to invoke current class constructor
The this() constructor call can be used to invoke the current class constructor. It is used to reuse the constructor. In other words, it is used for constructor chaining.

Calling default constructor from parameterized constructor:
*/
class A{  
	A(){
		System.out.println("hello a");
	}  
	A(int x){  
		this();  
		System.out.println(x);  
	}  
}  
class TestThis5{  
	public static void main(String args[]){  
		A a=new A(10);  
	}
}  
/*
Calling parameterized constructor from default constructor:

class A{  
	A(){  
		this(5);  
		System.out.println("hello a");  
	}  
	A(int x){  
		System.out.println(x);  
	}  
}  
class TestThis6{  
	public static void main(String args[]){  
		A a=new A();  
	}	
}  


class Student{  
	int rollno;  
	String name,course;  
	float fee;  
	Student(int rollno,String name,String course){  
		this.rollno=rollno;  
		this.name=name;  
		this.course=course;  
	}  
	Student(int rollno,String name,String course,float fee){  
		this(rollno,name,course);//reusing constructor  
		this.fee=fee;  
	}  
	void display(){System.out.println(rollno+" "+name+" "+course+" "+fee);}  
}  
class TestThis7{  
	public static void main(String args[]){  
		Student s1=new Student(111,"ankit","java");  
		Student s2=new Student(112,"sumit","java",6000f);  
		s1.display();  
		s2.display();  
	}
}  

*/