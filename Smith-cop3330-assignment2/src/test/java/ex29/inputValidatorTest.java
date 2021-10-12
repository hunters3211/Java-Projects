package ex29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class inputValidatorTest {

    @Test
    void validate_zero() {

        inputValidator iv = new inputValidator();
        boolean actual = iv.validate("0");
        boolean expected = false;

        assertEquals(actual,expected);


    }

    @Test
    void validate_nonNumeric() {

        inputValidator iv = new inputValidator();
        boolean actual = iv.validate("abc");
        boolean expected = false;

        assertEquals(actual,expected);


    }

    @Test
    void validate_numeric() {

        inputValidator iv = new inputValidator();
        boolean actual = iv.validate("1000");
        boolean expected = true;

        assertEquals(actual,expected);


    }


}