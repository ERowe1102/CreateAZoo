package com.company.menu;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Menu {
    private static Scanner input;

    public void mainMenu() {
        try {
            System.out.println("Please choose an option. " +
                    "\n1. Manage People" +
                    "\n2. Manage Animals" +
                    "\n3. Manage Inventory" +
                    "\n4. Quit Program");

            switch (input.nextInt()) {
                case 1:
                    //Manage People
                    PeopleMenu peopleMenu = new PeopleMenu();
                    peopleMenu.managePeople();
                    managePeople();
                    break;
                case 2:
                    //Manage Animals
                    manageAnimals();
                    break;
                case 3:
                    //Manage Inventory
                    manageInventory();
                    break;
                case 4:
                    System.out.println("Thank you for using the Zoo Program");
                    System.exit(0);
                    break;
                default:
                    //Handle wrong number
                    System.out.println("That is not a valid entry. Please enter a number between 1 and 4.");
                    //Restart method to allow user to try again.
                    mainMenu();
                    break;
            }
        } catch (InputMismatchException ime) {
            //Handle if a user something that is not an int
            input.nextLine();
            System.out.println("That is not a valid entry. Please enter a number between 1 and 4.");
            mainMenu();

        }
    }

    private void manageInventory() {

    }

    //Handles Inventory Options


    //Handles Employees
    private void manageEmployee() {
    }

    //Handles Animal Options
    private void manageAnimals() {

        try {
            //Enter Code here that you would like to run that MAY throw an exception
        } catch (InputMismatchException ime) {
            //What you want your program to do if this exception happens
        }
    }

    //Handles People Options
    private void managePeople() {

    }
}


