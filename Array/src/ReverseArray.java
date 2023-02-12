
public class ReverseArray {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 7, 4, 8, 6, 5};
		
		
		int n = arr.length;
		
		for(int x : arr)
			System.out.print(x+" ");
		
		
		System.out.println();
		
//		int temp=0;
//		
//		for(int i=0; i<n/2; i++) {
//			
//			temp = arr[i];
//			arr[i] = arr[n-1-i];
//			arr[n-1-i] = temp;
//			
//		}
//		
		
		reverseArray(arr, 0, n-1);
		
		
		for(int i=0; i<n; i++) {
			
			System.out.print(arr[i]+" ");
			
		}
		

	}
	
	
	public static void reverseArray(int[] arr, int start, int end) {
		
		if(start>=end)
			return;
		
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		
		
		reverseArray(arr, start++, end--);
		
	}


}
