package com.mycompany.ASGSM_Subsystem;

import java.util.List;
import java.util.Objects;

/**
 * Groomer class represents a pet groomer who can be assigned to appointments.
 * Implements Assignable interface and inherits from BaseEntity.
 */
public class Groomer extends BaseEntity implements Assignable {
    private String name;
    private List<String> expertise;

    // Constructor
    public Groomer(String groomerID, String name, List<String> expertise) {
        this.id = groomerID;  // From BaseEntity
        this.name = name;
        this.expertise = expertise;
    }

    // Getter and Setter methods
    public String getGroomerID() {
        return id;  // From BaseEntity
    }

    public void setGroomerID(String groomerID) {
        this.id = groomerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getExpertise() {
        return expertise;
    }

    public void setExpertise(List<String> expertise) {
        this.expertise = expertise;
    }

    @Override
    public void assignToAppointment(Appointment appointment) {
        // ✅ Assign this groomer to the appointment
        appointment.setAssignedGroomer(this);  // set this groomer into the appointment
        System.out.println("Groomer " + name + " has been assigned to appointment " + appointment.getAppointmentID());
    }

    public void checkAvailability() {
        // Method to check if the groomer is available for the appointment
    }

    @Override
    public String toString() {
        return "Groomer ID: " + id + ", Name: " + name + ", Expertise: " + expertise;
    }

    // Override equals() and hashCode() to ensure proper comparison in tests
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Groomer groomer = (Groomer) obj;
        return Objects.equals(id, groomer.id) && Objects.equals(name, groomer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
