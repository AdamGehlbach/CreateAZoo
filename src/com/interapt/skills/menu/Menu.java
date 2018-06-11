package com.interapt.skills.menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    private Scanner input = new Scanner(System.in);

    public void mainMenu() {

        try {
            System.out.println("Please Choose an option. " +
                    "\n1. Manage People" +
                    "\n2. Manage Animals" +
                    "\n3. Manage Inventory" +
                    "\n4. Exit Program");

            //Handles user input for navigation
            switch (input.nextInt()) {
                case 1:
                    //Manage People
                    PeopleMenu peopleMenu = new PeopleMenu();
                    peopleMenu.managePeople();
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
                    System.out.println("That is not a valid entry.  Please enter a number between 1 and 4");
                    //Restart method to allow user to try again.
                    mainMenu();
                    break;
            }
        } catch (InputMismatchException ime) {
            //Handle if a user puts in something that is not an int
            input.nextLine();
            System.out.println("That is not a valid entry.  Please enter a number between 1 and 4");
            mainMenu();
        }
    }



    //Handles Animal Options
    private void manageAnimals() {

    }

    //Handles Inventory Options
    private void manageInventory() {

    }
}