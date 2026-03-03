package academic.driver;

import java.util.ArrayList;
import java.util.Scanner;

class Course {
    String code;
    String name;
    int credit;
    String grade;

    Course(String code, String name, int credit, String grade) {
        this.code = code;
        this.name = name;
        this.credit = credit;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return code + "|" + name + "|" + credit + "|" + grade;
    }
}

class Student {
    String nim;
    String name;
    int year;
    String studyProgram;

    Student(String nim, String name, int year, String studyProgram) {
        this.nim = nim;
        this.name = name;
        this.year = year;
        this.studyProgram = studyProgram;
    }

    @Override
    public String toString() {
        return nim + "|" + name + "|" + year + "|" + studyProgram;
    }
}

class Enrollment {
    String courseCode;
    String studentNim;
    String academicYear;
    String semester;
    String grade;

    Enrollment(String courseCode, String studentNim,
               String academicYear, String semester) {
        this.courseCode = courseCode;
        this.studentNim = studentNim;
        this.academicYear = academicYear;
        this.semester = semester;
        this.grade = "None";
    }

    @Override
    public String toString() {
        return courseCode + "|" + studentNim + "|" +
               academicYear + "|" + semester + "|" + grade;
    }
}

public class Driver4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Course> courses = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Enrollment> enrollments = new ArrayList<>();

        while (true) {
            String input = sc.nextLine();
            if (input.equals("---")) {
                break;
            }

            String[] parts = input.split("#");

            switch (parts[0]) {

                case "course-add":
                    courses.add(new Course(
                            parts[1],
                            parts[2],
                            Integer.parseInt(parts[3]),
                            parts[4]
                    ));
                    break;

                case "student-add":
                    students.add(new Student(
                            parts[1],
                            parts[2],
                            Integer.parseInt(parts[3]),
                            parts[4]
                    ));
                    break;

                case "enrollment-add":
                    enrollments.add(new Enrollment(
                            parts[1],
                            parts[2],
                            parts[3],
                            parts[4]
                    ));
                    break;
            }
        }

        // OUTPUT sesuai urutan
        for (Course c : courses) {
            System.out.println(c);
        }

        for (Student s : students) {
            System.out.println(s);
        }

        for (Enrollment e : enrollments) {
            System.out.println(e);
        }

        sc.close();
    }
}