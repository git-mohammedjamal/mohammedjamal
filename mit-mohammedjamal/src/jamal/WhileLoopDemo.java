package jamal;

import java.util.Scanner;

public class WhileLoopDemo {

	public static void main(String[] args) {
		int number, sum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("n Please enter any integer Value below 10: ");
		number = sc.nextInt();
		
		while (number <= 10) {
			sum = sum + number;
			number++;
			
		}
		System.out.println(" Sum of the Numbers from the while Loop is: "+sum);

	}

}
