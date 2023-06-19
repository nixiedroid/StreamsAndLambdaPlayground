package streams;

import org.junit.jupiter.api.Test;


import static com.nixiedroid.streams.Ints.countPositiveNumbers;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntsTest {
    @Test
   public void countPositiveNumbersTest(){
        assertEquals(4,countPositiveNumbers(new int[]{1,5,4,-5,8,-8}));
    }
}
