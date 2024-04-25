package com.CMS.Clinic.Management.System.Entities;

// Basic Prescription class
public class Prescription {
    private final String prescriptionId;
    private final String appointmentId;
    private final String medicineName;
    private final String directionsOfUse;

    public Prescription(String prescriptionId, String appointmentId, String medicineName, String directionsOfUse) {
        this.prescriptionId = prescriptionId;
        this.appointmentId = appointmentId;
        this.medicineName = medicineName;
        this.directionsOfUse = directionsOfUse;
    }

    public String getPrescriptionId() {
        return prescriptionId;
    }

    public String getAppointmentId() {
        return appointmentId;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public String getDirectionsOfUse() {
        return directionsOfUse;
    }

    @Override
    public String toString() {
        return String.format(
                "Prescription{id='%s', appId='%s', medicineName='%s', directionsOfUse='%s'}",
                prescriptionId, appointmentId, medicineName, directionsOfUse
        );
    }
}