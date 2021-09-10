import java.util.Scanner;

public class Simple_Calculate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		@SuppressWarnings("unused")
		int productOneCode = sc.nextInt();
		int productOneUnits = sc.nextInt();
		double productOnePrice = sc.nextDouble();
		
		@SuppressWarnings("unused")
		int productTwoCode = sc.nextInt();
		int productTwoUnits = sc.nextInt();
		double productTwoPrice = sc.nextDouble();
		
		double result = (productOneUnits * productOnePrice) + (productTwoUnits * productTwoPrice);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", result);
		
		sc.close();
	}

}
