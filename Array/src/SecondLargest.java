import java.util.Scanner;
public class SecondLargest {
	public static void main(String[] args) {
		int largest=0;
		int secondLargest=0;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]= scan.nextInt();	
		}
		System.out.print("The Element of Array is : ");
		for(int j=0; j<arr.length;j++) {
			System.out.print(arr[j]+" ");
		}
		System.out.println();		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				secondLargest=largest;
				largest=arr[i];				
			}
			else if(arr[i]>secondLargest) {
				secondLargest=arr[i];
			}
			
		}
		System.out.println("First Largest is : "+largest);
		System.out.println("Second Largest is : "+secondLargest);
		
	}

}
