package com.example.Lesson8_Task1;

public class Main {
    public static void main(String[] args) {
        Therapist therapist = new Therapist();

        Patient patient1 = new Patient("Иван Иванов", 1);
        Patient patient2 = new Patient("Мария Петрова", 2);
        Patient patient3 = new Patient("Алексей Сидоров", 3);
        Patient patient4 = new Patient("Ольга Козлова", 0);

        System.out.println("\nПациент: " + patient1.name);
        System.out.println("План лечения: " + patient1.treatmentPlan);
        therapist.assignDoctor(patient1);
        patient1.treat();

        System.out.println("\nПациент: " + patient2.name);
        System.out.println("План лечения: " + patient2.treatmentPlan);
        therapist.assignDoctor(patient2);
        patient2.treat();

        System.out.println("\nПациент: " + patient3.name);
        System.out.println("План лечения: " + patient3.treatmentPlan);
        therapist.assignDoctor(patient3);
        patient3.treat();

        System.out.println("\nПациент: " + patient4.name);
        System.out.println("План лечения: " + patient4.treatmentPlan);
        therapist.assignDoctor(patient4);
        patient4.treat();
    }
}
