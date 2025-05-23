package com.mycompany.ASGSM_Subsystem;

import java.time.LocalDateTime;

/**
 * Appointment class represents a grooming appointment.
 * Implements Schedulable interface and inherits from BaseEntity.
 */
public class Appointment extends BaseEntity implements Schedulable {
    private LocalDateTime scheduledTime;
    private String serviceType;
    private String status; // Scheduled, Checked-In, Completed etc.
    private String notes;

    // ✅ NEW: Assigned Groomer field
    private Groomer assignedGroomer;

    // Parameterized constructor
    public Appointment(String appointmentID, LocalDateTime scheduledTime, String serviceType, String status, String notes) {
        this.id = appointmentID;  // from BaseEntity
        this.scheduledTime = scheduledTime;
        this.serviceType = serviceType;
        this.status = status;
        this.notes = notes;
    }

    // Default constructor (optional use)
    public Appointment() {
        throw new UnsupportedOperationException("Default constructor not supported yet.");
    }

    // Getter and Setter methods
    public String getAppointmentID() {
        return id;  // From BaseEntity
    }

    public void setAppointmentID(String appointmentID) {
        this.id = appointmentID;
    }

    @Override
    public LocalDateTime getScheduledTime() {
        return scheduledTime;
    }

    @Override
    public void setScheduledTime(LocalDateTime scheduledTime) {
        this.scheduledTime = scheduledTime;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Appointment ID: " + id + ", Service: " + serviceType + ", Status: " + status + ", Time: " + scheduledTime;
    }

    // ✅ Updated method to return assigned groomer
    Object getAssignedGroomer() {
        return assignedGroomer;
    }

    // ✅ Updated method to assign groomer
    void setAssignedGroomer(Groomer groomer) {
        this.assignedGroomer = groomer;
    }
}
