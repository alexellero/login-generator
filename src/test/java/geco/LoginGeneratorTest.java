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
        String tmp;
        tmp = loginGenerator.generateLoginForNomAndPrenom("Durand","Paul");
        assertEquals("PDUR",tmp);
        tmp = loginGenerator.generateLoginForNomAndPrenom("Ralling","John");
        assertEquals("JRAL2",tmp);
        tmp = loginGenerator.generateLoginForNomAndPrenom("Rolling","Jean");
        assertEquals("JROL1",tmp);
        tmp = loginGenerator.generateLoginForNomAndPrenom("Du","Paul");
        assertEquals("PDU",tmp);
    }
}