package ex44;
import java.io.*;
import java.util.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 first_name last_name
 */


public class Product_Search {
    public static void main (String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        System.out.print("What is the product name? ");
        input = bufferedReader.readLine();
        JSONArray subjects = read_json();

        while (check_inventory(subjects,input).length() < 2) {
            System.out.print("What is the product name? ");
            input = bufferedReader.readLine();
            subjects = read_json();
        }

        System.out.println(check_inventory(subjects, input));
    }
    public static String check_inventory (JSONArray subjects,String input ) {
        int flag = 0;
        Iterator iterator = subjects.iterator();
        while (iterator.hasNext()) {
            JSONObject json = (JSONObject) iterator.next();
            String name = (String)json.get("name");
            if(input.toLowerCase().equals(name.toLowerCase())){
                String output = "";
                output = "Name: "+name;
                output = output + "\nPrice: "+ json.get("price");
                output = output + "\nQuantity: "+json.get("quantity");
                return output;
            }
        }
        return new String("");
    }
    public static JSONArray read_json () {
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader("C:/Users/j/Desktop/exercise44_input.json"));
            JSONObject jsonObject = (JSONObject)obj;
            JSONArray subjects = (JSONArray)jsonObject.get("products");
            return subjects;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

}
