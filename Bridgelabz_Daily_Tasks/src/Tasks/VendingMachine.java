package Tasks;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the amount you want to Withdraw");
		long amount = in.nextInt();
		int arr[] = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
		
		for(int i=0;i<arr.length;i++)
		{
			long count = 0;
			while(arr[i] <= amount)
			{
				count = (amount / arr[i]);
				System.out.println(count + " note of " + arr[i]);
				amount = amount % arr[i];
			}
		}
	}
}
