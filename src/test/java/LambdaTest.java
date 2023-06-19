import com.nixiedroid.Lambda;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class LambdaTest {
    @Test
    public void sumOfInt(){
        assertEquals(9, Lambda.sum(5, 4));

    }
    @Test
    public void failedTest(){
        //Next test WILL fail:
        //assertEquals(2,4);
        //assertTrue(false);
    }
    @Test
    public void bigLambda(){
        assertEquals(31, Lambda.someBigEquation(7, 5));
    }

    @Test
    public void sumOfDouble(){
        assertEquals(9, Lambda.sum(5.,4));
    }
    @Test
    public void greeting(){
        assertEquals("hello", Lambda.greeting());
    }
    @Test
    public void appendString(){
        assertEquals("hello world", Lambda.appendString("hello"));
    }
    @Test
    public void appendNullString(){
        assertEquals("Empty String", Lambda.appendString(null));
    }
    @Test
    public void appendNullStringV2(){
        assertEquals("null world", Lambda.appendString(Objects.toString(null)));
    }
}
