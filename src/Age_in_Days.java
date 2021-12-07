import java.util.Scanner;

public class Age_in_Days
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int days = sc.nextInt();
		
		int years = 0, months = 0;
		
		if(days >= 365)
		{
			years = days / 365;
			days -= years * 365;
		}
		if(days >= 30)
		{
			months = days / 30;
			days -= months * 30;
		}
		
		System.out.println(years + " ano(s)\n" + months + " mes(es)\n" + days + " dia(s)");
		
		sc.close();
	}

}
