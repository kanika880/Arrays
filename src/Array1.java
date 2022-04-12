import java.util.Scanner;

public class Array1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter size of array:");
	int size = sc.nextInt();	
	String[] names = new String[size];
	
	//input
	System.out.println("enter names:");
	for (int i = 0; i<size; i++) {		
	 names[i] = sc.next();
	 
}
	//output
	for (int i=0; i<names.length; i++) {
		System.out.println(names[i]);
	}
}}
