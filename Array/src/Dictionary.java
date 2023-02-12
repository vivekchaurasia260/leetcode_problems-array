import java.util.Scanner;

public class Dictionary {
  public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	String[] arr = new String[n];
	for(int i=0;i<n;i++) {
		arr[i]= scan.next();
		}
	for(int i=0;i<n;i++) {
		for(int j=i+1;j<n;j++) {
			if(arr[i].compareTo(arr[j]) > 0) {
				String temp =arr[i];
				arr[i]=arr[j];
				arr[j] = temp;
			}
		}
	}
	for(int i=0;i<n;i++) {
		System.out.println(arr[i]);
	}
}
}
