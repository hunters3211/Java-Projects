package ex27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class inputValidatorTest {

    @Test
    void validate_invalid_name() {

        inputValidator iv = new inputValidator();
        String actual = iv.validate("a","last","12345","aa-1234");
        String expected = "first name must be filled in\n";

        assertEquals(expected,actual);
    }

    @Test
    void validate_invalid_zip() {

        inputValidator iv = new inputValidator();
        String actual = iv.validate("first","last","zip","aa-1234");
        String expected = "zip must contain only numbers";

        assertEquals(expected,actual);
    }

    @Test
    void validate_invalid_id() {

        inputValidator iv = new inputValidator();
        String actual = iv.validate("first","last","12345","aa-12345");
        String expected = "id must be in correct format\n";

        assertEquals(expected,actual);
    }

    @Test
    void validate_valid_input() {

        inputValidator iv = new inputValidator();
        String actual = iv.validate("first","last","12345","aa-1234");
        String expected = "no errors found";

        assertEquals(expected,actual);
    }

}