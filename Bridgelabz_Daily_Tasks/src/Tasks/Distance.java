package Tasks;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter co-ordinate (x, y)");
		int x = in.nextInt();
		int y = in.nextInt();
		int distance = 0;
		distance = (x*x + y*y);
		System.out.println(squareRoot(distance));
	}

	private static double squareRoot(int distance) {
		
	    double dist = Math.sqrt(distance);
		return dist;
		
		
	}

}
