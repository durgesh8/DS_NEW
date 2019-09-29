package string;

public class IntersectionOfTwoSortedArrays {

	public static void main(String[] args) {
		getIntersectionPoint(new int[]{21, 22,34,35,41}, new int[]{11,21,34, 45,61});
	}
	private static void getIntersectionPoint(int[] ar1,int[] ar2) {
		int len1=ar1.length;
		int len2=ar2.length;
		int x=0,y=0;
		
		while(x<len1 && y<len2) {
			if(ar1[x]==ar2[y]) {
				System.out.println(ar1[x]);
				x++;
				y++;
			}
				
			else if(ar1[x]<ar1[y])
				x++;
			else
				y++;
		}
	}
}
