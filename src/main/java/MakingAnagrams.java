
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created by sravann on 6/8/17.
 */
public class MakingAnagrams {
    public static int numberNeeded(String first, String second) {
        int[] charArray = new int[26];
        first.chars().forEach(character -> charArray[character - 'a'] += 1);
        second.chars().forEach(character -> charArray[character - 'a'] -= 1);
        return IntStream.of(charArray).reduce(0, (x, y) -> x + Math.abs(y));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
