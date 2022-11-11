package com.bridgelabz;

import java.util.Scanner;

public class CustomizeMessage {
    private static void check(String fName, String lName, String num) {
        if ((fName != null && lName != null) && (fName.matches("^[a-zA-Z]*$") && lName.matches("^[a-zA-Z]*$"))) {
            System.out.println("Hello " + fName + ", We've your Full Name as " + fName + " " + lName + " in our System.");
        }
        if (num.matches("\\d{10}")) {
            System.out.println("Your Contact Number is " + num + " Please, let us know in case of any clarification Thank you BridgeLabz 21/08/2022. \"");
        } else {
            System.out.println("Number Didn't Match to the criteria");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello Xyz, We've your Full Name as Xyz Abc in our System Your Contact Number is 1234567890 Please, let us know in case of any clarification Thank you Bridgelabz 02/11/2022. ");

        System.out.println();
        System.out.println("Enter First Name");
        String fName = sc.next();
        System.out.println("Enter Last Name: ");
        String lName = sc.next();
        System.out.println("Enter Your Phone Number");
        String number = sc.next();

        check(fName, lName, number);
    }

}
