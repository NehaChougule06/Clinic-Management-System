package com.CMS.Clinic.Management.System.Factory;

import com.CMS.Clinic.Management.System.Entities.DailyReport;
import com.CMS.Clinic.Management.System.Entities.PatientHistoryReport;
import com.CMS.Clinic.Management.System.Entities.Report;

enum ReportType {
    DAILY,
    PATIENT_HISTORY
}

public class ReportFactory {
    public static Report createReport(ReportType reportType) {
        switch (reportType) {
            case DAILY:
                return new DailyReport();
            case PATIENT_HISTORY:
                return new PatientHistoryReport();
            default:
                throw new IllegalArgumentException("Unknown report type: " + reportType);
        }
    }
}
