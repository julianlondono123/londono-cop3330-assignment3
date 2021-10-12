package ex42;
import java.io.*;
import java.util.*;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 first_name last_name
 */
public class Parser {
    public static void main( String[] args ) throws IOException {
        File file = new File("exercise42_input.txt");
        ArrayList<ArrayList<String>> names = read_File(file);
        print_table(names);
    }
    public static  ArrayList<ArrayList<String>> read_File(File file) throws FileNotFoundException {
        Scanner scan = new Scanner(file);
        String line = null;

        ArrayList<ArrayList<String>> names = new ArrayList<>();
        int counter = 0;
        while (scan.hasNextLine()) {
            line = scan.nextLine();
            names.add(new ArrayList<String>());
            String[] values = line.split(",");
            for (int i =0; i< values.length; i++) {
                names.get(counter).add(values[i]);
            }
            counter++;
        }

        return names;
    }

    public static void print_table (ArrayList<ArrayList<String>> names) {
        System.out.printf("%-10s%-10s%-10s", "Last", "First", "Salary");
        System.out.println("");
        System.out.println("---------------------------------\n");
        for (int i=0; i<names.size(); i++) {
            System.out.printf("%-10s%-10s%-10s", names.get(i).get(0), names.get(i).get(1), names.get(i).get(2));
            System.out.println("");
        }
    }
}
