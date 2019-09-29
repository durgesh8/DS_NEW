package matrix;

public class MatrixAddition {

	public static void main(String[] args) {
		int[][] arr=new int[][] {{7,2,6},{5,3,7}};
		int[][] arr2=new int[][] {{2,1,4},{3,1,5}};
		addMatrix(arr, arr2);
		Integer x=1;
		System.out.println(x.toString());
	}
	
	public static int[][] addMatrix(int[][] arr,int[][] arr2){
		int[][] res=new int[arr.length][arr[0].length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				res[i][j]=arr[i][j]+arr2[i][j];
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                  System.out.print(res[i][j] + " ");
            }
            System.out.println();
     }
		return res;
	}
}
