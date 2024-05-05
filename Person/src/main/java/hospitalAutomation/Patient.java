/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalAutomation;

/**
 *
 * @author 90554
 */
public class Patient extends Person {
    
    String illness;
    Doctor doctor;
    double payment;

    //constructor
    public Patient(String name, String lastName, int iDNumber, String illness) {
        super(name, lastName, iDNumber);
        this.illness = illness;
        this.payment = 0.0;
    }

    //returns illness of patient
    public String getIllness() {
        return illness;
    }

    //sets doctor to the patient
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    //returns doctor of the patient
    public Doctor getDoctor() {
        return doctor;
    }
    
    //returns payment of patient
    public double getPayment() {
        return payment;
    }
    
    //adds extra charges to payment
    public void addPayment(double charge) {
        payment += charge;
    }
    
    //displays info about patient
    @Override
    public void displayInfo() {
        System.out.print("Patient: ");
        super.displayInfo();
        System.out.println("Complaint: " + this.getIllness());
        if (this.getDoctor() != null) {
            System.out.println("Doctor: " + this.doctor.getTitle() + " " + this.doctor.getFirstName() + " " + this.doctor.getLastName());
        }
    }   
}
