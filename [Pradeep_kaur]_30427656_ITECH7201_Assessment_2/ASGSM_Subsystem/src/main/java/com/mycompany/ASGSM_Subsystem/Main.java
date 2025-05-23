package com.mycompany.ASGSM_Subsystem;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Appointment> appointments = new ArrayList<>();  // To store appointments

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input for creating an appointment
        System.out.println("Enter Customer ID:");
        String customerID = scanner.nextLine();

        System.out.println("Enter Service Type (e.g., Grooming, Pet Care):");
        String serviceType = scanner.nextLine();

        System.out.println("Enter Appointment Date and Time (YYYY-MM-DDTHH:MM):");
        String dateTimeString = scanner.nextLine();
        LocalDateTime scheduledTime = null;

        // Handling invalid date format input
        try {
            scheduledTime = LocalDateTime.parse(dateTimeString);
        } catch (Exception e) {
            System.out.println("Invalid date format. Please use YYYY-MM-DDTHH:MM format.");
            return;
        }

        // Create the appointment
        Appointment appointment = new Appointment("APPT" + System.currentTimeMillis(), scheduledTime, serviceType, "Scheduled", "No Notes");
        appointments.add(appointment);  // Add to the list of appointments

        System.out.println("Appointment Created: " + appointment.toString());

        // Ask if user wants to update the appointment status
        System.out.println("Would you like to update the status of the appointment? (yes/no)");
        String statusUpdateResponse = scanner.nextLine();

        if (statusUpdateResponse.equalsIgnoreCase("yes")) {
            System.out.println("Enter Appointment ID to update status:");
            String appointmentID = scanner.nextLine();

            // Find the appointment based on the ID
            Appointment existingAppointment = findAppointmentByID(appointmentID);
            if (existingAppointment != null) {
                System.out.println("Enter new status (e.g., Scheduled, Checked-In, Completed):");
                String newStatus = scanner.nextLine();

                // Update the appointment status
                existingAppointment.setStatus(newStatus);
                System.out.println("Updated Appointment: " + existingAppointment.toString());
            } else {
                System.out.println("Appointment with ID " + appointmentID + " not found.");
            }
        }

        scanner.close();
    }

    // Method to find an appointment by ID
    private static Appointment findAppointmentByID(String appointmentID) {
        for (Appointment appointment : appointments) {
            if (appointment.getAppointmentID().equals(appointmentID)) {
                return appointment;
            }
        }
        return null;
    }
}
