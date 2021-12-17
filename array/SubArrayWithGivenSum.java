package array;

import java.util.ArrayList;

/**
 * @author dksingh
 */

//https://www.interviewbit.com/blog/subarray-with-given-sum/?amp=1

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        System.out.println(subarraySumNaive(new int[]{1, 2, 3, 7, 5},5,12));
        System.out.println(subarraySumOofN(new int[]{1, 2, 3, 7, 5},5,12));

    }

    static ArrayList<Integer> subarraySumNaive(int[] arr, int n, int s)
    {
       for(int i =0; i<n;i++){
           int sum =0;
           for (int j=i;j<n;j++){
               sum= sum+arr[j];
               if(sum == s){
                   ArrayList<Integer> list = new ArrayList<>();
                   list.add(i+1);
                   list.add(j);
                   return list;
               } else if(sum>s){
                   break;
               } else{
                   continue;
               }
           }

       }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-1);
        return list;
    }

    static ArrayList<Integer> subarraySumOofN(int[] arr, int n, int s)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int sum = arr[0];
        int start =0;
        for(int i =1; i<=n;i++){
            while(sum>s && start<i-1){
                sum-=arr[start];
                start ++;
            }
            if (sum == s){
                list.add(start+1);
                list.add(i-1);
                return list;
            }

            sum+=arr[i];
        }
        list.add(-1);
        return list;
    }
}
