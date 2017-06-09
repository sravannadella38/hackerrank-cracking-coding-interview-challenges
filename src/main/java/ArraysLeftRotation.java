import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created by sravann on 6/8/17.
 */
public class ArraysLeftRotation {

    public static String leftRotate(int[] a, int numberOfRotations) {
        StringBuilder sb = new StringBuilder();
        IntStream.range(numberOfRotations, a.length).forEach(i -> sb.append(a[i] + " "));
        IntStream.range(0, numberOfRotations).forEach(i -> sb.append(a[i] + " "));
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        System.out.print(leftRotate(a, k));
    }
}
