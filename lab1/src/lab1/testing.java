package lab1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class testing {

    @Test
    void testStdId() {
        Student StdIdNum = new Student();
        int stdCompare = StdIdNum.main();
        assertEquals(633020040, stdCompare);
    }

}
