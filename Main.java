/*
 * Main class
 * Author: Max Resch
 * 
 * A class that handles the I/O interactivity of the program
 * 
 */
import EmployeePackage.*;

public class Main {

    public static void main(String[] args)
    {
        Artist employee = new Artist("John", 12, 14);
        System.out.println(employee.getName());
        System.out.println(employee.getPayout());
    }
}