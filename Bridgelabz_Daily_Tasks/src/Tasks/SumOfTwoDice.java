package Tasks;

import java.util.Random;

public class SumOfTwoDice {

	public static void main(String[] args) {
		
		int n = 2;
		int sum = 0;
		
		Random r = new Random();
		
		for(int i=0;i<n;i++)
		{
			int value = (r.nextInt(5)+1);
			sum = sum + value;
		}
		System.out.println(sum);
	}

}
