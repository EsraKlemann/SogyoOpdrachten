package nl.sogyo.javaopdrachten.exceptionalusers;

import java.util.Scanner;

public class ExceptionalUsers {

    public static void main(String[] args) {

        Scanner In = new Scanner(System.in);
        System.out.println("Enter a username:");
        String usern = In.nextLine();
        System.out.println(
                "Enter a new password. This requires at least one uppercase, lowercase character and a number:");
        String passw = In.nextLine();

        try {
            passwValid(passw);
        } catch (Exception e) {
            System.err.println("Something has gone wrong." + e);
        }

    }

    private static void passwValid(String passw) throws Exception {
        if (passw.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).+$")) {
            System.out.println("User succesfully registered.");
        }
        if (!passw.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).+$")) {
            throw new Exception("Unvalid, Password must contain an uppercase, lowercase character and a number.");
        }

    }

}
