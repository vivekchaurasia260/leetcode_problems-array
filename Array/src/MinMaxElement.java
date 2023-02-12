
public class MinMaxElement {

	public static void main(String[] args) {
		
		int[] arr = {1, 345, 234, 21, 56789};
		
		int min = Integer.MAX_VALUE;
		
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			
			if(min>arr[i])
				min=arr[i];
			else if(max<arr[i])
				max=arr[i];
			
		}
		
		
		System.out.println(min+"  " + max);

	}

}
