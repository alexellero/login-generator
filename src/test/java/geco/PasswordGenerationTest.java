package geco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordGenerationTest {

    PasswordGeneration passwordGeneration;

    @Before
    public void init() {
        passwordGeneration = new PasswordGeneration();
    }

    @Test
    public void getRandomPassword() {
        String password = passwordGeneration.getRandomPassword();
        assertTrue(password.length() == 8);
    }
}