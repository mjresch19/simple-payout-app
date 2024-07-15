/*
 * Staff Class
 * Author: Max Resch
 * 
 * A class that describes an artist-specific employee
 * 
 */
package EmployeePackage;

public class Artist extends Employee {

    private int hourlyWage;
    private double hoursWorked;

    public Artist(String n, int hwa, double hwo){
        name = n;
        hourlyWage = hwa;
        hoursWorked = hwo;
    }

    public double getPayout() {return hourlyWage * hoursWorked;}
    
    
}
