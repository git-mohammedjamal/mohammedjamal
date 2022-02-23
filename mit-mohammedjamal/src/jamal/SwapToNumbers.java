package jamal;

public class SwapToNumbers {

	public static void main(String[] args) {
		float first = 2.50f, second = 4.50f;
		
		System.out.println("--Before swap--");
		System.out.println("First number = " + first);
		System.out.println("Second number = " + second);
		
		float temp = first;
		first = second;
		second = temp;
		
		System.out.println("--After swap--");
		System.out.println("First number = " + first);
		System.out.println("Second number = " + second);
	}

}
