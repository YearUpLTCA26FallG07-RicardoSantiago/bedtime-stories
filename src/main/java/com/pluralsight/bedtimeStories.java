package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class bedtimeStories {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        //store the stories

        String[] stories = {"Goldilocks", "Hansel and Gretel", "Mary had a little lamb",};

        System.out.println("Stories avalable: ");

        for(int i=0; i <stories.length;i++) {
            System.out.println((i+1) + "." +stories[i]);
        }

        // Menu selection

        System.out.print("\nChoose a story (1-" + stories.length + "): ");
        int choice = scanner.nextInt();

        if(choice < 1 || choice > stories.length) {
            System.out.println("Invalid input. Please try again");
            return;
        }

        //File selection

        String selectedstory = stories[choice - 1];

        System.out.println("Showing: " + selectedstory);


        try {
            BufferedReader reader = new FileReader(selectedstory);
            String line;
            int lineNumber = 1;

            while ((line = reader.readLine()) != null) {
                System.out.println(lineNumber + ": " + line);
                lineNumber++;
            }

            reader.close();
        


        }








    }}
