package geco;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class LoginGeneratorTest {
    LoginService loginService;
    LoginGenerator loginGenerator;

    @Before
    public void setUp() throws Exception {
        loginService = new LoginService(new String[] {"JROL","BPER","CGUR","JDU","JRAL","JRAL1"});
        loginGenerator = new LoginGenerator(loginService);
    }

    @Test
    public void generateLoginForNomAndPrenom() {
        loginGenerator.generateLoginForNomAndPrenom("Durand","Paul");
        assertTrue(loginService.loginExists("PDUR"));
        loginGenerator.generateLoginForNomAndPrenom("Ralling","John");
        assertTrue(loginService.loginExists("JRAL2"));
        loginGenerator.generateLoginForNomAndPrenom("Rolling","Jean");
        assertTrue(loginService.loginExists("JROL1"));
        loginGenerator.generateLoginForNomAndPrenom("Dùrand","Paul");
        assertTrue(loginService.loginExists("PDUR"));
    }
}