import java.util.Scanner;

public class Consumption {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		double Y = sc.nextDouble();
		
		double res = X / Y;
		
		System.out.printf("%.3f km/l\n", res);
		
		sc.close();
	}

}
