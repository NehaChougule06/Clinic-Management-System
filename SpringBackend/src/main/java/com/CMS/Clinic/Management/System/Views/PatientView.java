package com.CMS.Clinic.Management.System.Views;

import com.CMS.Clinic.Management.System.Entities.Patient;
import com.CMS.Clinic.Management.System.Service.PatientService;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Route("/")
public class PatientView extends VerticalLayout {

    private final PatientService patientService;
    private final Grid<Patient> patientGrid;
    private final Dialog newPatientDialog;

    @Autowired
    public PatientView(PatientService patientService) {
        this.patientService = patientService;

        // Grid to display patients
        patientGrid = new Grid<>(Patient.class);
        loadPatients();

        // Button to open the dialog for adding new patients
        Button addPatientButton = new Button("Add Patient", event -> openNewPatientDialog());

        // Dialog for adding new patients
        newPatientDialog = new Dialog();
        newPatientDialog.add(createNewPatientForm());
        newPatientDialog.setCloseOnOutsideClick(true);

        // Add components to the layout
        add(addPatientButton, patientGrid);
    }

    private void loadPatients() {
        List<Patient> patients = patientService.getAllPatients();
        patientGrid.setItems(patients); // Set the grid data
    }

    private VerticalLayout createNewPatientForm() {
        TextField nameField = new TextField("Name");
        TextField emailField = new TextField("Email");
        TextField phoneField = new TextField("Phone");
        TextField ageField = new TextField("Age");
        TextField bloodGroupField = new TextField("Blood Group");

        Button saveButton = new Button("Save", event -> {
            try {
                Patient newPatient = new Patient(
                        null, // Auto-generated ID
                        nameField.getValue(),
                        "", // Default password
                        emailField.getValue(),
                        phoneField.getValue(),
                        Integer.parseInt(ageField.getValue()), // Convert to integer
                        bloodGroupField.getValue()
                );

                patientService.savePatient(newPatient); // Save the new patient
                loadPatients(); // Refresh the grid
                newPatientDialog.close(); // Close the dialog
            } catch (NumberFormatException e) {
                // Handle invalid age input
                ageField.setErrorMessage("Invalid age");
            }
        });

        return new VerticalLayout(nameField, emailField, phoneField, ageField, bloodGroupField, saveButton);
    }

    private void openNewPatientDialog() {
        newPatientDialog.open();
    }
}