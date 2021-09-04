import java.util.Scanner;

public class Area_of_a_Circle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double raio = sc.nextDouble();
		
		double area = (3.14159) * Math.pow(raio, 2);
		
		System.out.printf("A=%.4f\n", area);
		
		sc.close();
	}

}
