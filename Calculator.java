package dsa;

public class Calculator {

	public static void main(String[] args) {
	
		int num1 = 100;
		int num2 = 200;
		char op = '/';
		
		
		if(op == '+' || op == '-' || op == '*' || op == '/') {
			if(op == '+') {
				System.out.println(num1+num2);
			}
			if(op == '-'){
				System.out.println(num1-num2);
			}
			if(op == '*'){
				System.out.println(num1*num2);
			}
			if(op == '/'){
				System.out.println(num1/num2);
			}
		
		}
		else {
			System.out.println("invalid operator");
		}

	}

}
