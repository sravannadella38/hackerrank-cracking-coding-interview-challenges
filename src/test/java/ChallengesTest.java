import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by sravann on 6/8/17.
 */
public class ChallengesTest {
    @Test
    public void testArraysLeftRotation() {
        int[] a = {1, 2, 3, 4, 5};
        assertThat(ArraysLeftRotation.leftRotate(a, 4), is("5 1 2 3 4 "));
    }
}
