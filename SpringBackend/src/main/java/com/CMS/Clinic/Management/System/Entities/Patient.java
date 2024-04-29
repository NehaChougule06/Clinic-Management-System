package com.CMS.Clinic.Management.System.Entities;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-incremented ID
    private Long id;

    @Column(name = "name", nullable = false) // Patient name
    private String name;

    @Column(name = "email", nullable = false, unique = true) // Unique email
    private String email;

    @Column(name = "phone", nullable = false, unique = true) // Unique phone number
    private String phone;

    @Column(name = "age") // Patient age
    private int age;

    @Column(name = "bloodgroup") // Blood group
    private String bloodGroup;

    // Default constructor (required for JPA)
    public Patient() {
    }

    // Parameterized constructor for initialization
    public Patient(String name, String email, String phone, int age, String bloodGroup) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.age = age;
        this.bloodGroup = bloodGroup;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return Objects.equals(id, patient.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
