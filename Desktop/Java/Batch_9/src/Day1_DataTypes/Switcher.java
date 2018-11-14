package Day1_DataTypes;

import java.util.Scanner;

public class Switcher {
	public static void main(String[] args) {
		switch(10) {
		case 5:
			System.out.println("This is 5");
			break;
		case 6:
			System.out.println("This is 6");
			break;
		default:
			System.out.println("Not 5 not 6");
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number between 1-12");
		int num=scan.nextInt();
		if(num>0 && num<13) {
	
	switch(num) {
	case 1:
		System.out.println("January");
	case 2:
		System.out.println("February");
		break;
	case 3:
		System.out.println("March");
		break;
	case 4:
		System.out.println("April");
		break;
	case 5:
		System.out.println("May");
		break;
	case 6:
		System.out.println("June");
	    break;
	}

  }
		else {
			System.out.println("invalid input");
			}
		}
}
