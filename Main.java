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
        Employee employee = new Artist("John");
        System.out.println(employee.name);
    }
}