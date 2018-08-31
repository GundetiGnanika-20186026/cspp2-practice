import java.util.Scanner;
/** String concatination.**/
final class Concatinate {
	/** main method **/
	public static void main(final String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		System.out.println(helloName(input));
	}
	/** concatination method **/
	static String helloName( final String input) {
      String result = new String("Hello ");
      String result1 = result.concat(input);
      String result2 = result1.concat("!");
      return result2;
	}
}
