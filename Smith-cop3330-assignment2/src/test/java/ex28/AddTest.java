package ex28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTest {

    @Test
    void adder_test() {
        int[] testArr =new int[]{ 1,2,3,4,5 };

        Add add = new Add();
        int actual = add.adder(testArr);
        int expected = 15;

        assertEquals(expected,actual);

    }
}