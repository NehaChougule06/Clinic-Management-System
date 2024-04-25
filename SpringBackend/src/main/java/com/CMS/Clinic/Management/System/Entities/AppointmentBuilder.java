package com.CMS.Clinic.Management.System.Entities;

import java.time.LocalDateTime;

public class AppointmentBuilder {
    private String appointmentId;
    private LocalDateTime dateTime;
    private String patientName;
    private String doctorName;
    private String reason;
    private boolean confirmed;

    public AppointmentBuilder appointmentId(String appointmentId) {
        this.appointmentId = appointmentId;
        return this;
    }

    public AppointmentBuilder dateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
        return this;
    }

    public AppointmentBuilder patientName(String patientName) {
        this.patientName = patientName;
        return this;
    }

    public AppointmentBuilder doctorName(String doctorName) {
        this.doctorName = doctorName;
        return this;
    }

    public AppointmentBuilder reason(String reason) {
        this.reason = reason;
        return this;
    }

    public AppointmentBuilder confirmed(boolean confirmed) {
        this.confirmed = confirmed;
        return this;
    }

    public String getAppointmentId() {
        return appointmentId;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public String getReason() {
        return reason;
    }

    public boolean isConfirmed() {
        return confirmed;
    }

    public Appointment build() {
        return new Appointment(this);
    }
}