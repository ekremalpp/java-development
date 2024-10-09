package com.pluralsight;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class BedTimeStroies {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);


        System.out.print("Choose Stroy's File's name (goldilocks.txt) , (hansel_and_gretel.txt), (mary_and_a_little_lamb.txt): ");
        String storyFileName = inputScanner.nextLine();



        File storyFile = new File(storyFileName);
        try {
            Scanner fileScanner = new Scanner(storyFile);
            int lineNumber = 1;


            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(lineNumber + ". " + line);
                lineNumber++;
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Story file not found: " + storyFileName);
        }

        inputScanner.close();

    }

}
