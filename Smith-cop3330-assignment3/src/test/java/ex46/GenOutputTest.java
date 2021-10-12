package ex46;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenOutputTest {

    @Test
    void getFrequency_test() {
        GenOutput go = new GenOutput();
        String[] list = {"a", "z", "g", "a", "a", "z"};

        String act = go.getFrequency(list);
        String exp = "a ***\nz **\ng *\n";

        assertEquals(exp,act);
    }
}