package ex45;
import java.io.*;
import java.util.*;


/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 first_name last_name
 */
public class WordFinder {
    public static void main (String args[]) throws IOException {
        File file = new File("C:/Users/j/Desktop/exercise45_input.txt");
        Scanner scan = new Scanner(System.in);
        Scanner sc = new Scanner(file);
        System.out.println("What would you like your output file to be named");
        String output_name = scan.nextLine();

        sc.close();

    }
    public static void replace_words(Scanner sc, String output_name) throws IOException {
        FileWriter output = new FileWriter(output_name);

        while(sc.hasNext()) {
            String user = sc.nextLine();
            user = user.replaceAll("utilize", "use");
            output.write(user);
            output.write("\n");
        }
        output.close();
    }
}
