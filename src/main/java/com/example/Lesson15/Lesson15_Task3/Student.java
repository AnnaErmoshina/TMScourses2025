package com.example.Lesson15.Lesson15_Task3;
import java.util.List;

public class Student {

        private String name;
        private int course;
        private  String group;
        private List<Integer> grades;

        public Student(String name, String group, int course, List<Integer>grades) {
            this.name = name;
            this.group = group;
            this.course = course;
            this.grades = grades;
        }

        public String getName(){
            return  name;
        }

        public int getCourse(){
            return course;
        }

        public void setCourse(int course){
            this.course = course;
        }
        public double getAverageGrade() {
            if (grades == null || grades.isEmpty()) {
                return 0.0;
            }
            int sum = 0;
            for (int grade : grades) {
                sum += grade;
            }
            return (double) sum / grades.size();
        }
        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", group='" + group + '\'' +
                    ", course=" + course +
                    ", averageGrade=" + String.format("%.2f", getAverageGrade()) +
                    '}';
        }
    }

