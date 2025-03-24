package lab4_2;

import lab4_1.Person;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    ArrayList<Customer> customers= readFromCSVFile("lab4_2_input.csv");
    for(Customer i:customers){
        System.out.println(i);
    }
    }
    public static ArrayList<Customer> readFromCSVFile(String fileName) {
        ArrayList<Customer> customers = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            Customer currentCustomer = null; // Keep track of the current customer
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(", ");
                if (items[0].equals("Customer")) {
                    currentCustomer = new Customer(items[1].trim(), items[2].trim());
                    customers.add(currentCustomer);
                } else if (items[0].equals("Account") && currentCustomer != null) {
                    BankAccount account = new BankAccount(items[1]);
                    account.deposit(Double.parseDouble(items[2]));
                    currentCustomer.addAccount(account);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found - " + fileName);
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        return customers;
}}
