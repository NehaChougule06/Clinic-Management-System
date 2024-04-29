package com.CMS.Clinic.Management.System.Repository;

import com.CMS.Clinic.Management.System.Entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    // JpaRepository provides basic CRUD methods
}
