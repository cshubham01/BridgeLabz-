package Tasks;

import java.util.Scanner;

public class SpringSeason {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Month And date");
	    int m = sc.nextInt();
		int d = sc.nextInt();
		boolean status = false;
		if(m == 3)
		{
			if(d >= 20)
			{
				System.out.println("Spring Season");
				status = true;
			}
		}
		else if(m == 6)
		{
			if(d <= 20)
			{
				System.out.println("Spring Season");
				status = true;
			}
		}
		else
		{
			System.out.println("Not Spring Season");
			status = true;
		}
		
		if(!status)
		{
		 if(m>3)
		 {
			if(m<6)
			{
				System.out.println("Spring Season");
			}
			else
			{
				System.out.println("Not Spring Season");
			}
		 }
		 else
		 {
			System.out.println("Not Spring Season");
		 }
	   }
	}

}
