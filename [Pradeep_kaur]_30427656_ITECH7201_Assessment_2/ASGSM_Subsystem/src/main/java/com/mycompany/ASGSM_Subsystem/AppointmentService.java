package com.mycompany.ASGSM_Subsystem;

import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;

public class AppointmentService {
    private List<Appointment> appointments;

    // Constructor to initialize appointments list
    public AppointmentService() {
        this.appointments = new ArrayList<>();
    }

    // Method to create an appointment
    public void createAppointment(String serviceType, LocalDateTime scheduledTime, String customerID) {
        // Use parameterized constructor instead of default constructor
        String appointmentID = "APT" + System.currentTimeMillis(); // Generating appointment ID
        Appointment newAppointment = new Appointment(
            appointmentID,
            scheduledTime,
            serviceType,
            "Scheduled",  // Default status
            ""  // Default notes
        );

        // Add the appointment to the list
        appointments.add(newAppointment);
        System.out.println("Appointment created for customer " + customerID + " at " + scheduledTime);
    }

    // Method to update the appointment status
    public void updateAppointmentStatus(String appointmentID, String newStatus) {
        for (Appointment appointment : appointments) {
            if (appointment.getAppointmentID().equals(appointmentID)) {
                appointment.setStatus(newStatus);
                System.out.println("Appointment status updated to " + newStatus);
                break;
            }
        }
    }

    // Method to cancel an appointment
    public void cancelAppointment(String appointmentID) {
        boolean removed = appointments.removeIf(appointment -> appointment.getAppointmentID().equals(appointmentID));
        if (removed) {
            System.out.println("Appointment with ID " + appointmentID + " has been cancelled.");
        } else {
            System.out.println("Appointment with ID " + appointmentID + " not found.");
        }
    }

    // Method to list all appointments
    public void listAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments available.");
        } else {
            for (Appointment appointment : appointments) {
                System.out.println(appointment.toString());
            }
        }
    }

    // Method to get appointment by ID
    public Appointment getAppointmentByID(String appointmentID) {
        for (Appointment appointment : appointments) {
            if (appointment.getAppointmentID().equals(appointmentID)) {
                return appointment;
            }
        }
        return null; // If not found
    }
}
