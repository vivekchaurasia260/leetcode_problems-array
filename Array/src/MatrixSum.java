import java.util.Scanner;
public class MatrixSum {
 public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	 System.out.print("Enter number of rows : ");
	 int rows = scan.nextInt();
	 System.out.print("Enter number of columns : ");
	 int columns = scan.nextInt();
	 int[][] arr = new int[rows][columns];
	 int[][] arr1 = new int[rows][columns];
	 int[][] result = new int[rows][columns];
	 for(int i=0;i<rows;i++) {
		 for(int j=0;j<columns;j++) {
			 arr[i][j]= scan.nextInt();
		 }
	 }
	 for(int i=0;i<rows;i++) {
		 for(int j=0;j<columns;j++) {
			 arr1[i][j]= scan.nextInt();
		 }
	 }
	 System.out.println("The Sum of Matrix is : ");
	 for(int i=0;i<rows;i++) {
		 for(int j=0;j<columns;j++) {
			 result[i][j]= arr1[i][j];
			 System.out.print(result[i][j]+"\t");
		 }
		 System.out.println();		 
	 }
 }
}
