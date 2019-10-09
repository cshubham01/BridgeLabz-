package Tasks;

import java.util.Scanner;

public class Gambler {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int stake = 10;
		int goal = 15;
		System.out.println("Enter no. of times you want to iterate");
		int num = in.nextInt();
		for(int i=0;i<num;i++)
		{
			double random = Math.random();
			//System.out.println(random);
			if(random > 0.5)
			{
				stake++;
			}
			else
			{
				stake--;
			}
			if(stake == goal)
			{
				System.out.println("You Won");
				break;
			}
			if(stake==0){
			{
				System.out.println("You Lost");
				break;
				
			}
			}
		}
	}

}
