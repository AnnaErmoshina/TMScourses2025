package com.example.Lesson15.Lesson15_Task3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {

        public static void main(String[] args){
            List<Student> students = new ArrayList<>();
            students.add(new Student("Max", "Группа А", 1, Arrays.asList(5, 4, 4, 5, 3)));
            students.add(new Student("Van", "Группа В", 3, Arrays.asList(3, 3, 2, 4, 4)));
            students.add(new Student("Zoi", "Группа Б", 2, Arrays.asList(2, 3, 2, 2, 3)));
            students.add(new Student("Ben", "Группа Б", 2, Arrays.asList(5, 5, 5, 5, 4)));
            students.add(new Student("Ivan", "Группа А",1, Arrays.asList(3, 3, 2, 3, 3)));
            System.out.println("Учащиеся до перевода");
            printAllStudents(students);
            processStudents(students);
            System.out.println("\nСписок студентов после перевода:");
            printAllStudents(students);
            System.out.println("\nСтуденты 2 курса:");
            printStudents(students, 2);

            System.out.println("\nСтуденты 1 курса:");
            printStudents(students, 1);
        }

        public static void printAllStudents(List<Student> students) {
            for (Student student : students) {
                System.out.println(student);
            }
        }
        public static void processStudents(List<Student> students) {
            Iterator<Student> iterator = students.iterator();
            while (iterator.hasNext()) {
                Student student = iterator.next();
                double average = student.getAverageGrade();

                if (average < 3.0) {
                    iterator.remove(); // Удаляем студента
                } else {
                    student.setCourse(student.getCourse() + 1); // Переводим на следующий курс
                }
            }
        }
        public static void printStudents(List<Student> students, int course) {
            boolean found = false;
            for (Student student : students) {
                if (student.getCourse() == course) {
                    System.out.println(student.getName() + " (группа: " + getGroupFromToString(student) + ")");
                    found = true;
                }
            }
            if (!found) {
                System.out.println("На курсе " + course + " нет студентов.");
            }
        }
        private static String getGroupFromToString(Student student) {
            String str = student.toString();
            int start = str.indexOf("group='") + 7;
            int end = str.indexOf("'", start);
            return str.substring(start, end);
        }
    }
