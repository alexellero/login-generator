package geco;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class LoginServiceTest {
    LoginService loginService;

    @Before
    public void setUp() throws Exception {
        String[] logins = {"login1","login2"};
        loginService = new LoginService(logins);
    }

    @Test
    public void loginExists() {
        assertTrue(loginService.loginExists("login1"));
        assertFalse(loginService.loginExists("log"));
    }

    @Test
    public void addLogin() {
        loginService.addLogin("login3");
        assertTrue(loginService.loginExists("login3"));
    }

    @Test
    public void findAllLoginsStartingWith() {
        loginService.addLogin("test");
        List<String> listTest = new ArrayList<String>(Arrays.asList("login1","login2"));
        assertEquals(listTest,loginService.findAllLoginsStartingWith("log"));
    }

    @Test
    public void findAllLogins() {
        List<String> listTest = new ArrayList<String>(Arrays.asList("login1","login2"));
        assertEquals(listTest,loginService.findAllLogins());
    }
}