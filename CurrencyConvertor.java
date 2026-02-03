package dsa;

import java.util.Scanner;

public class CurrencyConvertor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount in rupess: ");
		double rupees = sc.nextDouble();
		
		if(rupees > 0) {
			double usd =  rupees/91.67;
			 System.out.println(usd); 
		}
		else {
			System.out.println("Invalid amount");
		}
		
		

	}

}
