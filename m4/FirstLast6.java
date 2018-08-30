import java.util.*;
class array1{
	public static void main(String[] args){
	int arr[];
	Scanner scan = new Scanner(System.in);
	int size = scan.nextInt();
	arr = new int [size];

	for (int i = 0; i<size; i++){
		arr[i]=scan.nextInt();
	}
	if ((arr[0]==6)||arr[arr.length-1]==6) System.out.println("true");
	else System.out.println("false");
	}
}