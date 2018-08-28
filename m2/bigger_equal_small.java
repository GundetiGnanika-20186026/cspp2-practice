import java.util.Scanner;
class Comparision {
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	int varA = scan.nextInt();
	int varB = scan.nextInt();
	if (varA > varB) System.out.println("Bigger");
	else if (varA == varB) System.out.println("equal");
	else System.out.println("smaller");
	}
}