package Day1_DataTypes;

import java.util.Scanner;

public class Task {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter number 1-10");
		int num=scan.nextInt();
		for(int k=0;k<num;k++) {
			System.out.println("Please enter number"+(i+1));
			int answer=scan.nextInt();
			if(answer%2==0) {
		    System.out.println("Even");
			}
			else {
				System.out.println("Odd");
			}
		}
		int k=1;
		while(true) {
			System.out.println("Please enter number"+k);
			int n=scan.nextInt();
			if(n%2!=0) {
				break;
			}
			k++;
		}
		System.out.println("End of program");
	}
	
	

}
