package ex41;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 first_name last_name
 */
public class NameSorter
{
    public static void main( String[] args ) throws IOException {
        File file = new File("exercise41_input.txt");
        FileWriter output = new FileWriter("exercise41_output.txt");
        ArrayList<String> names = read_File(file);
        Collections.sort(names);
        output_file(names, output);

    }
    public static ArrayList <String> read_File (File file) throws FileNotFoundException {
        Scanner sc = new Scanner(file);
        ArrayList<String> names = new ArrayList<String>();
        while (sc.hasNextLine())
            names.add(sc.nextLine());
        return names;
    }

    public static void output_file (ArrayList<String> names, FileWriter output) throws IOException {
        output.write("Total of " + names.size() + " names\n" + "--------------------\n");
        for (int i = 0; i< names.size(); i++){
            output.write(names.get(i) + "\n");
        }
        output.close();
    }
    }

