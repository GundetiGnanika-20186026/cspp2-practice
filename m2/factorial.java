import java.util.Scanner;
class Factorial{
	public static void main(final String[] args){
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println(fact(num));
    }
	static int fact(int num){
		if (num ==1) return 1;
		else return num * fact(num - 1);
	}   
}