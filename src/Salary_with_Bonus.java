import java.util.Scanner;

public class Salary_with_Bonus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		@SuppressWarnings("unused")
		String sellerName = sc.nextLine();
		double sellerFixedSalary = sc.nextDouble();
		double sellerSalesValue = sc.nextDouble();
		
		double sellerSalary = sellerFixedSalary + (sellerSalesValue * 15 / 100);
		
		System.out.printf("TOTAL = R$ %.2f\n", sellerSalary);
		
		sc.close();
	}

}
