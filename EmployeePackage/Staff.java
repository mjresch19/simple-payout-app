/*
 * Staff Class
 * Author: Max Resch
 * 
 * A class that describes a staff-specific employee
 * 
 */

package EmployeePackage;

public class Staff extends Employee{

    private int salary;
    private int bonus;

    public Staff(String n, int s){
        name = n;
        salary = s;
        bonus = 0;
    }

    //Overloaded Constructor to accomodate for an optional employee bonus
    public Staff(String n, int s, int b){
        name = n;
        salary = s;
        bonus = b;
    }

    public int getPayout() {return salary + bonus;}
}
