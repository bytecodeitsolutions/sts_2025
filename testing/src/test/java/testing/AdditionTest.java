package testing;

import static org.junit.Assert.*;
import org.junit.Test;

public class AdditionTest {

    @Test
    public void testAdd() {
        Addition addition = new Addition();
        int result = addition.add(2, 4);
        assertEquals(5, result);
    }
}
