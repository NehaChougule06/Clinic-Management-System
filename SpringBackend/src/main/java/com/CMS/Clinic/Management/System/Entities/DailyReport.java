package com.CMS.Clinic.Management.System.Entities;

// Daily report class
public class DailyReport extends Report {
    public DailyReport() {
        super("Daily Clinic Report");
    }

    @Override
    public void generate() {
        // Generate the daily report (implementation details here)
        System.out.println("Generating daily report...");
    }
}

package com.CMS.Clinic.Management.System.Entities;

// Patient history report class
public class PatientHistoryReport extends Report {
    public PatientHistoryReport() {
        super("Patient History Report");
    }

    @Override
    public void generate() {
        // Generate the patient history report (implementation details here)
        System.out.println("Generating patient history report...");
    }
}