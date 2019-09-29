package array;

public class MissingNumberInArray {

	public static void main(String[] args) {
		
		System.out.println(findNumber(new int[]{1, 2, 3, 4, 6, 7, 9, 8, 10}));

	}
	
	public static int findNumber(int[] arr) {
		int sum=0;
		int noOfElementsInArray=arr.length+1;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		
		int sumOfNaturalNumber=(noOfElementsInArray)*(noOfElementsInArray+1)/2;
		
		return sumOfNaturalNumber-sum;
	}
}
