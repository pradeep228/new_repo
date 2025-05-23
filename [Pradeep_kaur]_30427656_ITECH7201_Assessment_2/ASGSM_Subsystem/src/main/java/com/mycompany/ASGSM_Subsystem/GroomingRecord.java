package com.mycompany.ASGSM_Subsystem;

public class GroomingRecord implements Recordable {
    private String recordID;
    private String petID;
    private String groomingStatus;

    // Default constructor (no-argument constructor)
    public GroomingRecord() {
        this.recordID = "";
        this.petID = "";
        this.groomingStatus = "Not Started"; // Set default status if required
    }

    // Constructor with parameters
    public GroomingRecord(String recordID, String petID, String groomingStatus) {
        this.recordID = recordID;
        this.petID = petID;
        this.groomingStatus = groomingStatus;
    }

    // Implementing record method from Recordable interface
    @Override
    public void record() {
        // Record logic here
        System.out.println("Recording grooming status for pet: " + petID);
    }

    // Getter and Setter methods
    public String getRecordID() {
        return recordID;
    }

    public void setRecordID(String recordID) {
        this.recordID = recordID;
    }

    public String getPetID() {
        return petID;
    }

    public void setPetID(String petID) {
        this.petID = petID;
    }

    public String getGroomingStatus() {
        return groomingStatus;
    }

    public void setGroomingStatus(String groomingStatus) {
        this.groomingStatus = groomingStatus;
    }

    @Override
    public String toString() {
        return "GroomingRecord [recordID=" + recordID + ", petID=" + petID + ", groomingStatus=" + groomingStatus + "]";
    }
}
