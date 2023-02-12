import java.util.Scanner;
public class Matrix {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int row=scan.nextInt();
		System.out.print("Enter the number of Columns : ");
		int column=scan.nextInt();
		int[][]arr = new int[row][column];
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		System.out.println("The Matrix is : ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
