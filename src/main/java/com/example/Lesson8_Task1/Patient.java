package com.example.Lesson8_Task1;

public class Patient {
    public String name;
    public int treatmentPlan;
    public Doctor doctor;

    public Patient(String name, int treatmentPlan) {
        this.name = name;
        this.treatmentPlan = treatmentPlan;
        this.doctor = null;
    }

    public void treat() {
        if (doctor != null) {
            System.out.println("Начинаем лечение пациента " + name);
            doctor.treat();
        } else {
            System.out.println("Пациенту " + name + " еще не назначен врач!");
        }
    }
}
