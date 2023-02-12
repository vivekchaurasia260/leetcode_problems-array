import java.util.Scanner;
public class Transpose {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int rows = scan.nextInt();
		int columns = scan.nextInt();
		int[][] arr = new int[rows][columns];
		int[][] transpose = new int[rows][columns];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				transpose[j][i] = arr[i][j];
			}
		}
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.print(transpose[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}
