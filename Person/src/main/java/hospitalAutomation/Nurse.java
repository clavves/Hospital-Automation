/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalAutomation;

import java.util.ArrayList;

/**
 *
 * @author 90554
 */
public class Nurse extends Person {
    
    int salary;
    ArrayList<Patient> patients = new ArrayList();
    Room[] rooms = new Room[5];
    
    //constructor
    public Nurse (String firstName, String lastName, int iDNumber, int salary) {
        super(firstName, lastName, iDNumber);
        this.salary = salary;
        patients = new ArrayList<Patient>();
    }
    
    //returns salary of nurse
    public int getSalary() {
        return salary;
    }
    
    //adds patient to nurse's patient arraylist
    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    //removes patient from nurse's patient arraylist
    public void removePatient(Patient patient) {
        patients.remove(patient);
    }
    
    //returns all patients of the nurse
    public ArrayList<Patient> getPatients() {
        return patients;
    }

    //add the room to the nurse's room array
    public void addRoom(Room room) {
        for (int i = 0; i < this.rooms.length; i++) {
            if (rooms[i] == null) {
                rooms[i] = room;
                System.out.println(room.getRoomNumber() + " assigned.");
                break;
            } else if(rooms[rooms.length - 1] != null){
                System.out.println("Reached the limit of rooms.");
            }
        }
    }

    public void removeRoom(Room room) {
        for (int i = 0; i < rooms.length; i++) {
            if(rooms[i]== room) {
                rooms[i] = null;
                break;
            }
        }
    }
    
    public Room[] getRooms() {
        return rooms;
    }
    
    //displays info about the nurse
    @Override
    public void displayInfo() {
        System.out.print("Nurse: ");
        super.displayInfo();
        System.out.println("Responsible Rooms: " + this.getRooms());
        System.out.println("Responsible Patients: " + this.getPatients());
        System.out.println("Salary: " + this.getSalary());
    }

    
}
