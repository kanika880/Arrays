import java.util.Scanner;

public class Transpose {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows:");
		int rows = sc.nextInt();
		System.out.println("Enter number of columns:");
		int col = sc.nextInt();
		int[][] matrix = new int[rows][col];
		//input
		System.out.println("Enter numbers for matrix:");
		for (int i=0; i<rows; i++) {
			for (int j=0; j<col; j++) {
				
				matrix[i][j]=sc.nextInt();
				
				}
			}
		
		System.out.println("The transpose is:");
		
		
	//output
	for (int j=0; j<rows; j++) {
		for (int i=0; i<col; i++) {
			System.out.print(matrix[i][j]+ " ");	
			
			}System.out.println();
		}
	}
}

