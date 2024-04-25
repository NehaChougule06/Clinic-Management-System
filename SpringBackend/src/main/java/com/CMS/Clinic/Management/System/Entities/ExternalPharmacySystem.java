package com.CMS.Clinic.Management.System.Entities;

// An interface for an external system that requires a specific data format
public interface ExternalPharmacySystem {
    String getPrescriptionCode();
    String getPharmacySpecificFormat();
}