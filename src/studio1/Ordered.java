package studio1;

import java.util.Scanner;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Value for x?");
		int x = in.nextInt();
		System.out.println("Value for y?");
		int y = in.nextInt();
		System.out.println("Value for z?");
		int z = in.nextInt();
		boolean ordered1 = x-y > 0;
		boolean ordered2 = x-z > 0;
		boolean ordered3 = z-y > 0;
		boolean ordered4 = z-x > 0;
		boolean isOrdered = (ordered1 && ordered2) || (ordered3 && ordered4);
		System.out.println(isOrdered);
		

	}

}
