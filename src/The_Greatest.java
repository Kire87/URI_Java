import java.util.Scanner;

public class The_Greatest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
		
		int greatest = (x + y + Math.abs(x - y)) / 2;
		greatest = (greatest + z + Math.abs(greatest - z)) / 2;
		
		System.out.println(greatest + " eh o maior");
		
		sc.close();
	}

}
