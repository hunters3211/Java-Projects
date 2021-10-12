package ex24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramDetectorTest {

    @Test
    void isAnagram_returnsTrue_forAnagrams() {
        AnagramDetector ad = new AnagramDetector();

        boolean expected = true;
        boolean actual = ad.isAnagram("test","stet");

        assertEquals(expected,actual);
    }

    @Test
    void isAnagram_returns_false_for_nonAnagrams(){
        AnagramDetector ad = new AnagramDetector();

        boolean expected = false;
        boolean actual = ad.isAnagram("test","tests");

        assertEquals(expected,actual);
    }
}