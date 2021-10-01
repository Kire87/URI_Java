import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dis = sc.nextInt();
		
		int res = dis * 2;
		
		System.out.println(res + " minutos");
		
		sc.close();
	}

}
