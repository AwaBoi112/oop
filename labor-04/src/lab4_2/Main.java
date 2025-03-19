package lab4_2;

import lab4_1.Person;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    ArrayList<Customer> customers= new ArrayList<>();


    for(Customer i:customers){
        System.out.println(i);
    }
    }
    public static ArrayList<Customer> readFromCSVFile(String fileName) {
        ArrayList<Customer> persons = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(",");
// trim: eliminates leading and trailing spaces
                String firstName = items[0].trim();
                String lastName = items[1].trim();
// Convert String → int: Integer.parseInt( String)
                //persons.add(new Customer(firstName, lastName,));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return persons;
}}
