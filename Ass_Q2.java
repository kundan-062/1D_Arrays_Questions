//Write a program to traverse over the elements of the array using for each loop and print all even elements.
// Input 1: arr[] = {34,21,54,65,43}
// Output 1: 34 54
// Input 1: arr[] = {4,3,6,7,1}
// Output 1: 4 6
public class Q2 {
    public static void main(String[] args) {
        int[] arr = {34,21,54,65,43};
        for (int n : arr) {
            if (n % 2 == 0)
                System.out.println(n);

        }
    }
}
