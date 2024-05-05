/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalAutomation;

/**
 *
 * @author 90554
 */
public class Test {

    public static void main(String[] args) {

        Hospital hospital1 = Hospital.hospital1;
        Room room1 = new Room(1, 400);
        Room room2 = new Room(2, 500);
        Patient patient1 = new Patient("Aslı", "Gür", 11111111, "Heart Attack");
        Doctor doctor1 = new Doctor("Uzman Doktor", "Derya", "Kaya", 9292929, "Cardiology", 40000, 200);
        Nurse nurse1 = new Nurse("Sude", "Arel", 829392, 12000);

        
        hospital1.add(room1);
        hospital1.add(room2);
        hospital1.add(doctor1);
        hospital1.add(nurse1);
        hospital1.add(patient1);
        
        System.out.println(hospital1.getDoctors());
        System.out.println(hospital1.getNurses());
        System.out.println(hospital1.getPatients());
        System.out.println(hospital1.getRooms());
        
        System.out.println(hospital1.getTotalSalaryOfDoctors());
        System.out.println(hospital1.getTotalSalaryOfNurses());
        hospital1.incrementSalaryOfAllNurses(1000);
        hospital1.incrementSalaryOfAllDoctors(5000);
        System.out.println(hospital1.getTotalSalaryOfNurses());
        System.out.println(hospital1.getTotalSalaryOfDoctors());
        System.out.println(hospital1.getAverageSalary());
        
        doctor1.displayInfo();
        System.out.println("---");
        nurse1.displayInfo();
        System.out.println("---");
        patient1.displayInfo();
        System.out.println("---");
        
        
        doctor1.addPatient(patient1);
        System.out.println(doctor1.getPatients());
        System.out.println("---");
        
        
        nurse1.addPatient(patient1);
        nurse1.addRoom(room1);
        
        
        room1.setHospital(hospital1);
        room2.setHospital(hospital1);
        
        patient1.setDoctor(doctor1);
        hospital1.admitPatient(patient1, 2);
        room1.setPatient(patient1);
        System.out.println("----");
        hospital1.dischargePatient(patient1, 2);
        
        System.out.println(room1.getPatient());
        
        
        
        
        
    }
}
