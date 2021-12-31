package array;

import java.time.Duration;
import java.time.Instant;

/**
 * @author dksingh
 */
public class KadanesAlgo {

    public static void main(String[] args) {
        System.out.println(bruteForce(new int[]{1, 2, 3, -2, 5}));
        System.out.println(bruteForce(new int[]{-1,-2,-3,-4}));
        System.out.println(efficientSolution(new int[]{1, 2, 3, -2, 5}));
    }


    public static int bruteForce(int[] arr) {
        Instant in1 = Instant.now();
        int max = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum > max) {
                    max = sum;
                }
            }
        }
        Instant in2 = Instant.now();
        System.out.println(Duration.between(in1,in2).toNanos());
        return max;
    }

    public static int efficientSolution(int[] arr) {
        Instant in1 = Instant.now();
        int max = -1;
        int maxCurrent = 0;

        for (int i = 0; i < arr.length; i++) {
            maxCurrent += arr[i];
            if (maxCurrent > max) {
                max = maxCurrent;
            }
            if (maxCurrent < 0)
                maxCurrent = 0;
        }
        Instant in2 = Instant.now();
        System.out.println(Duration.between(in1,in2).toNanos());
        return max;
    }
}
