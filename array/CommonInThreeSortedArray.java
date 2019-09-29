package array;

public class CommonInThreeSortedArray {

	public static void main(String[] args) {
		System.out.println(getCommonElements(new int[] {1, 5, 10, 20, 40, 80},new int[] {6, 7, 20, 80, 100},new int[] {3, 4, 15, 20, 30, 70, 80, 120}));
	}
	
	private static String getCommonElements(int[] arr1,int[] arr2,int[] arr3) {
		int i=arr1.length-1;
		int j=arr2.length-1;
		int k=arr3.length-1;
		int a=0,b=0,c=0;
		StringBuilder sb=new StringBuilder();
		while(a<i || b<j || c<k) {
			if(arr1[a]==arr2[b]&& arr2[b]==arr3[c]) {
				sb.append(String.valueOf(arr1[a])+" ");
				a++;
				b++;
				c++;
			} 
			else if(arr1[a]<arr2[b]) 
				a++;
			else if(arr1[a]>arr2[b]) 
				b++;
			else
				c++;
			
		}
		return sb.toString();
	}
	
}
