package icu.xiii.mvn;

import icu.xiii.generator.PasswordGenerator;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        logger.debug("Running Main::main()");

        PasswordGenerator passwordGenerator = new PasswordGenerator();
        int passwordLength = 12;
        String password = passwordGenerator.generatePassword(passwordLength);

        logger.info("Generated password (length={}): {}",
                password.length(),
                password
        );

        logger.debug("Finishing Main::main()");
    }
}
