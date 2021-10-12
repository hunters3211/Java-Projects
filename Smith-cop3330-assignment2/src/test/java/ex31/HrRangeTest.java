package ex31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HrRangeTest {

    @Test
    void generateRange_invalid_check() {

        HrRange hrr = new HrRange();
        boolean actual = hrr.generateRange("abc","123");
        boolean expected = false;

        assertEquals(actual,expected);

    }

    @Test
    void generateRange_valid_check() {

        HrRange hrr = new HrRange();
        boolean actual = hrr.generateRange("150","123");
        boolean expected = true;

        assertEquals(actual,expected);

    }
}