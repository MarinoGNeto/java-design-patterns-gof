package com.example.design_patterns.behavioral.chain_of_responsability;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        PasswordValidator passwordValidator = PasswordValidator.link(
                new LengthValidator(),
                new SpecialCharacterValidator()
        );

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        boolean isValidPassword = passwordValidator.isValid(password);

        while (!isValidPassword) {
            System.out.println("Invalid password. Try again.");
            System.out.print("Enter password: ");
            password = scanner.nextLine();
            isValidPassword = passwordValidator.isValid(password);
        }

        System.out.println("Valid password!!");
    }
}
