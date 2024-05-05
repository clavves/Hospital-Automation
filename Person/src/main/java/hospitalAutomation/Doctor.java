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
public class Doctor extends Person {
    
    String title;
    String specialty;
    int salary;
    int charge;
    ArrayList<Patient> patients;

    //constructor
    public Doctor(String title, String firstName, String lastName, int iDNumber, String specialty, int salary, int charge) {
        super(firstName, lastName, iDNumber);
        this.specialty = specialty;
        this.title = title;
        this.salary = salary;
        this.charge = charge;
        patients = new ArrayList<Patient>();
    }
    
    //returns title of doctor
    public String getTitle() {
        return title;
    }
    
    //returns specialty of doctor
    public String getSpecialty() {
        return specialty;
    }
    
    //returns salary of doctor
    public int getSalary() {
        return salary;
    }
    
    //returns charge of an appointment of the doctor
    public int getCharge() {
        return charge;
    }
    
    //adds patient to doctor's patient arraylist + charges the appointment fee to the patient
    public void addPatient(Patient patient) {
        patients.add(patient);
        patient.setDoctor(this);
        patient.addPayment(this.getCharge());
    }
    
    //removes patient from doctor's patient arraylist
    public void removePatient(Patient patient) {
        patients.remove(patient);
    }

    //returns pat,ent from doctor's patient arraylist
    public ArrayList<Patient> getPatients() {
        return patients;
    }
    
    //displays info about doctor
    @Override
    public void displayInfo() {
        System.out.print("Doctor: " + this.getTitle() + " ");
        super.displayInfo();
        System.out.println("Specialty: " + this.getSpecialty());
        System.out.println("Salary: " + this.getSalary());
        System.out.println("Charge Amount Per Appointment: " + this.getCharge());
    }

    
    
    
}
