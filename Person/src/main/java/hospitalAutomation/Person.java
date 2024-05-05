/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hospitalAutomation;


public class Person {

    String firstName;
    String lastName;
    int iDNumber;

    //constructorStri
    public Person(String firstName, String lastName, int iDNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.iDNumber = iDNumber;
    }

    //returns first name of person
    public String getFirstName() {
        return firstName;
    }

    //returns last name of person
    public String getLastName() {
        return lastName;
    }
    
    //returns id number of person
    public int getIDNumber() {
        return iDNumber;
    }
    
    public void displayInfo() {
        System.out.println(this.getFirstName() + " " + this.getLastName());
        System.out.println("ID Number: " + this.getIDNumber());
    }
}
