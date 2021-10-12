package ex25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordCheckerTest {

    @Test
    void passwordValidator_veryWeak() {
        PasswordChecker pc = new PasswordChecker();
        int actual = pc.passwordValidator("123456");
        int expected = 1;

        assertEquals(expected,actual);
    }

    @Test
    void passwordValidator_weak(){
        PasswordChecker pc = new PasswordChecker();
        int actual = pc.passwordValidator("abcdef");
        int expected = 2;

        assertEquals(expected,actual);
    }

    @Test
    void passwordValidator_strong(){
        PasswordChecker pc = new PasswordChecker();
        int actual = pc.passwordValidator("abcdef123");
        int expected = 3;

        assertEquals(expected,actual);
    }

    @Test
    void passwordValidator_veryStrong(){
        PasswordChecker pc = new PasswordChecker();
        int actual = pc.passwordValidator("abcdef123$$P");
        int expected = 4;

        assertEquals(expected,actual);
    }
}