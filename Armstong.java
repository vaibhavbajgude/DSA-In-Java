package dsa;

public class Armstong {

	public static void main(String[] args) {
		int num = 153;
		int sum = 0;
		int rem;
		int temp = num ;
		while(num > 0) {
			rem = num % 10;
			num = num/10;
			sum = rem*rem*rem +sum;  	
		}
		
		if(temp == sum) {
			System.out.println("AM");
		}else {
			System.out.println("NAM");
		}

	}

}
