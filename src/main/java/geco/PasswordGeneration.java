package geco;

import java.util.Random;

public class PasswordGeneration {

    String getRandomPassword() {
        String password = "";
        Random rand = new Random();
        for (int i = 0; i < 8; i++) {
            char c = (char) (rand.nextInt(26) + 'a');
            password += c;
        }
        return password;
    }

}
