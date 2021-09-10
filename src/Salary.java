import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int employeeNumber = sc.nextInt();
		int employeeHours = sc.nextInt();
		double employeeValue = sc.nextDouble();
		
		double employeeSalary = employeeHours * employeeValue;
		
		System.out.printf("NUMBER = %d\nSALARY = U$ %.2f\n", employeeNumber, employeeSalary);
		
		sc.close();
	}

}
