package Tasks;

import java.util.Scanner;

public class StringToInteger {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char ch[] = str.toCharArray();
		int sum = 0;
		
		for(char c : ch) {
		sum = (sum*10) + ((int) c - (int) '0');
		}
		System.out.println(sum);
	}

}
