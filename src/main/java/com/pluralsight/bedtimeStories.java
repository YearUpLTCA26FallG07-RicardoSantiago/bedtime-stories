package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class bedtimeStories {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //store the stories

        String[] stories = {"goldilocks.txt", "hansel_and_gretel.txt", "mary_had_a_little_lamb.txt",};

        System.out.println("Stories avalable: ");

        for(int i=0; i <stories.length;i++) {
            System.out.println((i+1) + "." +stories[i]);
        }

        // Menu selection
        int choice = 0;

        while (true) {
            try {
                System.out.print("\nChoose a story (1-" + stories.length + "): ");
                choice = scanner.nextInt();

                if (choice >= 1 && choice <= stories.length) {
                    break;
                }

                System.out.println("Invalid input. Please try again");

            } catch (Exception e) {
                System.out.println("Please enter a number 1-3");
                scanner.nextLine();

            }
            }




        //File selection

        String selectedstory = stories[choice - 1];

        System.out.println("Showing: " + selectedstory);

        System.out.println("Current Directory: "
                + System.getProperty("user.dir"));

        try {
            BufferedReader reader =
                    new BufferedReader(
                            new FileReader(selectedstory));

            String line;
            int lineNumber = 1;

            while ((line = reader.readLine()) != null) {
                System.out.println(lineNumber + ": " + line);
                lineNumber++;
            }

            reader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        scanner.close();
    }
}