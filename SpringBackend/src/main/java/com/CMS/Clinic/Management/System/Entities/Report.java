package com.CMS.Clinic.Management.System.Entities;


public abstract class Report {
    protected String reportName;

    public Report(String reportName) {
        this.reportName = reportName;
    }

    public String getReportName() {
        return reportName;
    }

    // Method to generate the report, to be implemented by subclasses
    public abstract void generate();

    @Override
    public String toString() {
        return "Report{name='" + reportName + "'}";
    }
}