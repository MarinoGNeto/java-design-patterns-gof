package com.example.design_patterns.behavioral.chain_of_responsability;

/**
 * ConcreteHandler. Validate if password has invalid special character
 */
public class SpecialCharacterValidator extends PasswordValidator {

    private static final String REGEX = "^[a-zA-Z0-9]+$";

    @Override
    public boolean isValid(String password) {
        if (!password.matches(REGEX)) {
            System.out.println("Invalid password. It cannot contain special characters.");
            return false;
        }

        return validateNext(password);
    }

}
