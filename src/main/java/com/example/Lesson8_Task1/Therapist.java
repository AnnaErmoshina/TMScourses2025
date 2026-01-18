package com.example.Lesson8_Task1;

public class Therapist implements Doctor{
    @Override
    public void treat() {
        System.out.println("Провожу общий осмотр...");
        System.out.println("Осмотр проведен. Рецепт выписан.");
    }

    public void assignDoctor(Patient patient) {
        if (patient.treatmentPlan == 1) {
            patient.doctor = new Surgeon();
            System.out.println("Терапевт: Назначаю хирурга для пациента " + patient.name);
        } else if (patient.treatmentPlan == 2) {
            patient.doctor = new Dentist();
            System.out.println("Терапевт: Назначаю дантиста для пациента " + patient.name);
        } else {
            patient.doctor = new Therapist();
            System.out.println("Терапевт: Буду лечить пациента " + patient.name + " сам");
        }
    }
}
