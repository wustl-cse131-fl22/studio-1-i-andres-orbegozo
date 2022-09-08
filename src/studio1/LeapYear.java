package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("What year are you checking?");
		int year = in.nextInt();
		boolean check1 = year%4 == 0;
		boolean check2 = year%100 != 0;
		boolean check3 = year%400 == 0;
		boolean leapYear = check1 && (check2 || check3);
		System.out.println(year + " is a leap year: " + leapYear);
		
	}

}
