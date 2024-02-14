package com.example.design_patterns.behavioral.chain_of_responsability;

/**
 * ConcreteHandler. Validate if password length is correct
 */
public class LengthValidator extends PasswordValidator {

    private static final int MIN_LENGTH = 8;
    private static final int MAX_LENGTH = 20;

    @Override
    public boolean isValid(String password) {
        if (password.length() < MIN_LENGTH || password.length() > MAX_LENGTH) {
            System.out.println("Invalid length password.");
            return false;
        }

        return validateNext(password);
    }

}
