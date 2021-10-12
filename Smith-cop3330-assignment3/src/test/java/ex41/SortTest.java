package ex41;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortTest {

    @Test
    void sorter_test() {
        String[] act = {"a","z","g"};
        Sort s = new Sort();
        String[] res = s.sorter(act);
        String[] exp = {"a","g","z"};
        assertArrayEquals(res, exp);
    }
}