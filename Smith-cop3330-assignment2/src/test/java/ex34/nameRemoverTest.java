package ex34;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class nameRemoverTest {

    @Test
    void removeName_Jackie_Jackson() {

        String[] names = new String[]{"John Smith",
                "Jackie Jackson",
                "Chris Jones",
                "Amanda Cullen",
                "Jeremy Goodwin"};

        nameRemover nr = new nameRemover();
        String[] actual = nr.removeName(names);

        String[] expected = new String[]{"John Smith",
                "Chris Jones",
                "Amanda Cullen",
                "Jeremy Goodwin"};
        assertEquals(actual,expected);


    }
}