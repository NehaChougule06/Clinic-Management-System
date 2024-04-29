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
