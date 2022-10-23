package closedLab;

class Test1 {
	Test1(int msg){
		System.out.println(msg+" constructor called.");
	}
	static int b=5;
	void nonstatmethod() {
		b=8;
		System.out.println(b);
	}
}
public class Test{
	public static void main(String[] args) {
		final int a=10;
		System.out.println(a);
		//Attempting to modify constant member
        //a=12; The final local variable can not be changed
        //Attempting to instantiate a class object without necessary parameters
		Test1 obj=new Test1(a);
		obj.nonstatmethod();
	}
}