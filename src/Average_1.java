import java.util.Scanner;

public class Average_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		
		double result = ((A * 3.5) + (B * 7.5)) / 11;
		
		System.out.printf("MEDIA = %.5f\n", result);
	}

}
