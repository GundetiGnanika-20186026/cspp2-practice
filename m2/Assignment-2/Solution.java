import java.util.Scanner;
import java.lang.Math;
/** code to find quadratic. **/
final class Solution {
	/*
	Do not modify this main function.
	*/
	private Solution() { }
	/**
	   * @param args this is the constructor.
	**/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		rootsOfQuadraticEquation(a, b, c);
	}
	/*
	Need to write the rootsOfQuadraticEquation function and print the output.
	*/
	static double rootsOfQuadraticEquation(final int a, final int b, final int c) {
		double value = (b * b) - (4 * a * c);
		double r1 = (-b + Math.sqrt(value)) / (2 * a);
        double r2 = (-b - Math.sqrt(value)) / (2 * a);
        System.out.println(r1 + " " + r2);
        return 0;
	} 
}
