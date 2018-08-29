import java.util.Scanner;
class Sum1{
	public static void main(String[] args){
		int n = new Scanner(System.in).nextInt();
		int sum = 0;
		for(int i=0;i<=n;i++){
			sum = sum + i;

		}
		System.out.println(sum);
	}
}