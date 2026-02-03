package dsa;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principal amt: ");
		int p = sc.nextInt();
		System.out.println("Enter the Time: ");
		int t= sc.nextInt();
		System.out.println("Enter the rate");
		int r = sc.nextInt();
		
		int SI = p*r*t/100;
		System.out.println(SI);

	}

}
