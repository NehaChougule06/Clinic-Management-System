package com.CMS.Clinic.Management.System.Entities;

import java.time.LocalDateTime;

public class Appointment {
    private final String appointmentId;
    private final LocalDateTime dateTime;
    private final String patientName;
    private final String doctorName;
    private final String reason;
    private final boolean confirmed;

    private Appointment(AppointmentBuilder builder) {
        this.appointmentId = builder.getAppointmentId();
        this.dateTime = builder.getDateTime();
        this.patientName = builder.getPatientName();
        this.doctorName = builder.getDoctorName();
        this.reason = builder.getReason();
        this.confirmed = builder.isConfirmed();
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

    @Override
    public String toString() {
        return String.format(
                "Appointment{id='%s', dateTime=%s, patientName='%s', doctorName='%s', reason='%s', confirmed=%b}",
                appointmentId, dateTime, patientName, doctorName, reason, confirmed
        );
    }
}