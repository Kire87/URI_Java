import java.util.Scanner;

public class Banknotes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int value = sc.nextInt();
		
		System.out.println(value);
		
		int counter = 0;
		
		while(value >= 100) {
			value -= 100;
			counter++;
		}
		
		System.out.println(counter + " nota(s) de R$ 100,00");
		counter = 0;
		
		while(value >= 50) {
			value -= 50;
			counter++;
		}
		
		System.out.println(counter + " nota(s) de R$ 50,00");
		counter = 0;
		
		while(value >= 20) {
			value -= 20;
			counter++;
		}
		
		System.out.println(counter + " nota(s) de R$ 20,00");
		counter = 0;
		
		while(value >= 10) {
			value -= 10;
			counter++;
		}
		
		System.out.println(counter + " nota(s) de R$ 10,00");
		counter = 0;
		
		while(value >= 5) {
			value -= 5;
			counter++;
		}
		
		System.out.println(counter + " nota(s) de R$ 5,00");
		
		if(value % 2 == 0) {
			System.out.println((value / 2) + " nota(s) de R$ 2,00");
			System.out.println("0 nota(s) de R$ 1,00");
		}else {
			System.out.println((value / 2) + " nota(s) de R$ 2,00");
			System.out.println("1 nota(s) de R$ 1,00");
		}
		
		sc.close();
	}

}
