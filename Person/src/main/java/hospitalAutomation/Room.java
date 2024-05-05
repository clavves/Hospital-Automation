/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalAutomation;

/**
 *
 * @author 90554
 */
public class Room {
    
    int roomNumber;
    Patient patient;
    Hospital hospital;
    double paymentPerDay;

    public Room(int roomNumber, double paymentPerDay) {
        this.roomNumber = roomNumber;
        this.paymentPerDay = paymentPerDay;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public Patient getPatient() {
        return patient;
    }
    
    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
    
    public double getPaymentPerDay() {
        return paymentPerDay;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    
}
