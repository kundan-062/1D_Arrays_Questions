//WAP to print the sum of all the elements present on even indexes in the given array.
public class q1 {
    public static void main(String[] args) {
        int arr[] = {3,20,4,6,9};
        //int arr[] = {4,3,6,7,1}
   	 int i = 0, sum = 0;
     while (i < arr.length) {
         sum += arr[i];
         i += 2;
     }
     System.out.println(sum);
    }
}
