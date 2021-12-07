import java.util.Scanner;

public class Time_Conversion
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int seconds;
		seconds = sc.nextInt();
		
		int minutes = 0, hours = 0;
		
		if(seconds >= 3600)
		{
			hours = seconds / 3600;
			seconds -= hours * 3600;
		}
		if(seconds >= 60)
		{
			minutes = seconds / 60;
			seconds -= minutes * 60;
		}
		
		System.out.println(hours + ":" + minutes + ":" + seconds);
		
		sc.close();
	}

}
