package week01.exercise05;

import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise05Test {

    @Test
    public void runMethodTest01() {
        Exercise05 tester = new Exercise05();

        String text = "hello";

        assertEquals("Letters are wrong!", "Ifmmp", tester.run(text));
    }

    @Test
    public void runMethodTest02() {
        Exercise05 tester = new Exercise05();

        String text = "fun times!";

        assertEquals("Letters are wrong!", "gvO Ujnft!", tester.run(text));

    }
}