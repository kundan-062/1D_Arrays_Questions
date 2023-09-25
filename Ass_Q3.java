// Write a program to calculate the maximum element in the array.
// Input 1: arr[] = {34,21,54,65,43}
// Output 1: 65
// Input 1: arr[] = {4,3,6,7,1}
// Output 1: 7
public class Q3 {
    public static void main(String[] args) {
        int[] arr = {34,21,54,65,43};
        int max = Integer.MIN_VALUE;
        for (int val : arr) {
            max = Math.max(max, val);
        }
        System.out.print("Maximum value in given array is " + max);

    }
    
}
