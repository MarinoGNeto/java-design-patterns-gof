package com.example.design_patterns.behavioral.chain_of_responsability;

import java.util.Objects;

/**
 * Base Validator class
 */
public abstract class PasswordValidator {

    private PasswordValidator nextStepValidator;

    /**
     * Build chains of validators objects.
     */
    public static PasswordValidator link(PasswordValidator first, PasswordValidator... chain) {
        PasswordValidator head = first;
        for (PasswordValidator nextInChain : chain) {
            head.nextStepValidator = nextInChain;
            head = nextInChain;
        }
        return first;
    }

    /**
     * Subclasses will implement this method with concrete validations
     */
    public abstract boolean isValid(String password);

    /**
     * validate next object in the chain or ends if we`re in last object in chain.
     */
    protected boolean validateNext(String password) {
        if (Objects.isNull(nextStepValidator)) return true;

        return nextStepValidator.isValid(password);
    }
}
