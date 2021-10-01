import java.util.Scanner;

public class Fuel_Spent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int time = sc.nextInt();
		int speed = sc.nextInt();
		
		double res = (time * speed) / 12.0;
		
		System.out.printf("%.3f\n", res);
		
		sc.close();
	}

}
