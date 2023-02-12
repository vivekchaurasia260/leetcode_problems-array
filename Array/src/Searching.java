import java.util.Scanner;
public class Searching {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int temp;
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] =scan.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				temp = arr[i] +arr[j];
				if(temp==m) {
					System.out.println("True");
				}
			}
			}
		}
	}
