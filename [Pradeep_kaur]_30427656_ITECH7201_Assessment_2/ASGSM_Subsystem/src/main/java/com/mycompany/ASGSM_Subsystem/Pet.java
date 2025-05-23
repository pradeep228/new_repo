package com.mycompany.ASGSM_Subsystem;

public class Pet {
    private String petID;
    private String petName;
    private String petType;

    // Constructor
    public Pet(String petID, String petName, String petType) {
        this.petID = petID;
        this.petName = petName;
        this.petType = petType;
    }

    // Getter and Setter methods
    public String getPetID() {
        return petID;
    }

    public void setPetID(String petID) {
        this.petID = petID;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    // Example method that could override a supertype method (just for reference)
    @Override
    public String toString() {
        return "Pet [petID=" + petID + ", petName=" + petName + ", petType=" + petType + "]";
    }
}
