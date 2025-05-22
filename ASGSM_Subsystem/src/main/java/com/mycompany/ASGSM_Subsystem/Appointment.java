/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ASGSM_Subsystem;

import java.time.LocalDateTime;
// Class appointment for booking an appointment 
public class Appointment {
    private String appointmentID;
    private LocalDateTime scheduledTime;
    private String serviceType;
    private String status; // Scheduled, Checked-In, etc.
    private String notes;
// Define methods for appointment class
    public void createAppointment() {}
    public void updateStatus() {}
    public void modifyDetails() {}
    public void cancelAppointment() {}
    public void sendReminder() {}
}
