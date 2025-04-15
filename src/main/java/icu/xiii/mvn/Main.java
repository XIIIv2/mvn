package icu.xiii.mvn;

import icu.xiii.PasswordGenerator;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        logger.debug("Running Main::main()");

        PasswordGenerator passwordGenerator = new PasswordGenerator();
        int passwordLength = 12;

        logger.info("Generated password (length={}): {}",
                passwordLength,
                passwordGenerator.generatePassword(passwordLength));

        logger.debug("Finishing Main::main()");
    }
}
