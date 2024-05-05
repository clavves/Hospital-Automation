/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalAutomation;

import java.util.ArrayList;


public class Hospital {

    static Hospital hospital1 = new Hospital("Asya");
    String hospitalName;
    Room[] rooms;
    ArrayList<Doctor> doctors;
    ArrayList<Nurse> nurses;
    ArrayList<Patient> patients;

    public Hospital(String hospitalName) {
        rooms = new Room[10];
        doctors = new ArrayList<Doctor>();
        nurses = new ArrayList<Nurse>();
        patients = new ArrayList<Patient>();
        this.hospitalName = hospitalName;
    }

    public void add(Room room) {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] == null) {
                rooms[i] = room;
                break;
            }
        }
    }
    
    public void remove(int roomNumber) {
        for (int i = 0; i < rooms.length; i++) {
            if(rooms[i].getRoomNumber() == roomNumber) {
                rooms[i] = null;
                break;
            }
        }
    }

    public void add(Doctor doctor) {
        doctors.add(doctor);
    }
    
    public void remove(Doctor doctor) {
        doctors.remove(doctor);
    }
    
    public void add(Patient patient) {
        patients.add(patient);
    }
    
    public void remove(Patient patient) {
        patients.remove(patient);
    }
    
    public void add(Nurse nurse) {
        nurses.add(nurse);
    }
    
    public void remove(Nurse nurse) {
        nurses.remove(nurse);
    }
    
    public int getTotalSalaryOfDoctors() {
        int totalSalary = 0;
        for (Doctor d:doctors) {
            if (d != null) {
                totalSalary += d.getSalary();
            }
        }
        return totalSalary;
    }
    
    public void incrementSalaryOfAllDoctors(int amount) {
        for (Doctor d: doctors) {
            if (d != null) {
                d.salary += amount;
            }
        }
    }
    
    public void incrementChargeOfDoctor(Doctor doctor, int amount) {
        doctor.charge += amount;
    }
    
    public int getTotalSalaryOfNurses() {
        int totalSalary = 0;
        for (Nurse n:nurses) {
            if (n != null) {
                totalSalary += n.getSalary();
            }
        }
        return totalSalary;
    }
    
    public void incrementSalaryOfAllNurses(int amount) {
        for (Nurse n: nurses) {
            if (n != null) {
                n.salary += amount;
            }
        }
    }
    
    public int getAverageSalary() {
        int average = 0;
        int count = 0;
        for (Doctor d: doctors) {
            if (d != null) {
                average += d.getSalary();
                count++;
            }
        }
        count += doctors.size() - 1;
        for (Nurse n:nurses) {
            if (n != null) {
                average += n.getSalary();
                count++;
            }
        }
        count += nurses.size()-1;
        return average/count;
    }

    public Room getAvailableRoom() {
        Room r = null;
        for (Room room : rooms) {
            if (room != null && room.getPatient() == null) {
                r = room;
                System.out.println("Room " + room.getRoomNumber());
                break;
            }
        }
        return r;
    }

    public void admitPatient(Patient patient, int daySpent) {
        Room room = getAvailableRoom();
        if (room != null) {
            room.setPatient(patient);
            System.out.println("Assigned Room: " + room.roomNumber);
        } else {
            System.out.println("Sorry, no available room.");
        }
    }

    public void dischargePatient(Patient patient, int daySpent) {
        for (Room room : rooms) {
            if (room.getPatient().equals(patient )) {
                room.setPatient(null);
                System.out.println("Total Price: " + this.getTotalPayment(patient, daySpent));
                break;
            }
        }
    }
    
    public double getTotalPayment(Patient patient, int daySpent) {
        int totalPayment = 0;
        patient.payment += patient.getDoctor().getCharge();
        totalPayment += patient.payment;
        for (Room r: rooms) {
            if (r !=null && r.getPatient() == patient) {
                totalPayment += (r.getPaymentPerDay() * daySpent);
            }
        }
        return totalPayment;
    }
    
    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }
    
    public ArrayList<Nurse> getNurses() {
        return nurses;
    }
    
    public ArrayList<Patient> getPatients() {
        return patients;
    }
    
    public Room[] getRooms() {
        return rooms;
    }
}
