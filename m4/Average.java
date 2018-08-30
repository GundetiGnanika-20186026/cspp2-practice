import java.util.*;
class Average{
	public static void main(String[] args){
	int arr[];
	Scanner scan = new Scanner(System.in);
	int size = scan.nextInt();
	arr = new int [size];
	int sum = 0;
	float avg;
    for (int i = 0; i<size; i++){
		arr[i] = scan.nextInt();
		sum = sum + arr[i];
	}
	avg = sum /size;
	System.out.println(avg);
}
}