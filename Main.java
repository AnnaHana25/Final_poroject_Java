package final_project;

import java.util.Scanner;

public class Main {
	 static Scanner sc = new Scanner(System.in);
	 
	// reads a number; if the input is not a number, ask again
	    static int readInt() {
	        while (true) {
	            try {
	                return Integer.parseInt(sc.nextLine().trim());
	            } catch (NumberFormatException e) {
	                System.out.print("Enter a number: ");
	            }
	        }
	    }
	 
	    public static void main(String[] args) {
	        Employee[] list = new Employee[100];
	        int count = 0;
	 
	        while (true) {
	            System.out.println("\n1. Register Employee");
	            System.out.println("2. Print Employee Data");
	            System.out.println("3. Print by Position");
	            System.out.println("4. Print by Contract");
	            System.out.println("5. Exit");
	            System.out.print("--> ");
	            int option = readInt();
	 
	            if (option == 1) {
	                if (count == list.length) {
	                    System.out.println("List is full!");
	                    continue;
	                }
	                System.out.println("1. Full Time  2. Part Time  3. Commission  4. Base + Commission");
	                System.out.print("--> ");
	                int type = readInt();
	                if (type < 1 || type > 4) {
	                    System.out.println("Choose between the offered options !");
	                    continue;
	                }
	                System.out.print("First name: ");
	                String first = sc.nextLine();
	                System.out.print("Last name: ");
	                String last = sc.nextLine();
	                System.out.print("Social Number: ");
	                String ssn = sc.nextLine();
	                System.out.print("Type of Contract: ");
	                String contract = sc.nextLine();
	 
	                if (type == 1) {
	                    list[count++] = new FullTimeEmployee(first, last, ssn, contract);
	                } else if (type == 2) {
	                    System.out.print("Hours of work: ");
	                    list[count++] = new PartTimeEmployee(first, last, ssn, contract, readInt());
	                } else if (type == 3) {
	                    System.out.print("Number of sales: ");
	                    list[count++] = new CommissionEmployee(first, last, ssn, contract, readInt(), 70);
	                } else {
	                    System.out.print("Number of sales: ");
	                    list[count++] = new BaseCommissionEmployee(first, last, ssn, contract, readInt());
	                }
	            } else if (option == 2) {
	                for (int i = 0; i < count; i++) {
	                    System.out.println("----------------------");
	                    System.out.println(list[i]);   // polymorphism
	                }
	            } else if (option == 3) {
	                for (int i = 0; i < count; i++) {
	                    System.out.println(list[i].getName() + " - " + list[i].getPosition());
	                }
	            } else if (option == 4) {
	                for (int i = 0; i < count; i++) {
	                    System.out.println(list[i].getName() + " - " + list[i].getContract() + " Contract");
	                }
	            } else if (option == 5) {
	                System.out.println("Thank you for choosing our program");
	                break;
	            } else {
	                System.out.println("Choose between the offered options !");
	            }
	        }
	    }
	}
	 
