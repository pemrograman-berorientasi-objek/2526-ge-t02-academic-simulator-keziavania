package academic.driver;

import academic.model.Course;
import java.util.Scanner;
import java.util.ArrayList; 

/**
 * @author 12S24009 Kezia Vania Pasaribu
 */
public class Driver1 {

    public static void main(String[] _args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Course> courses = new ArrayList<>();

        System.out.println("Masukkan data course (format: CODE#NAMA#KREDIT#GRADE), akhiri dengan '---'");

        while (input.hasNextLine()) {
            String line = input.nextLine();

            if (line.equals("---")) {
                break;
            }

            String[] parts = line.split("#");

            if (parts.length == 4) {
                String code = parts[0];
                String name = parts[1];
                int credits = Integer.parseInt(parts[2]);
                String grade = parts[3];

                Course course = new Course(code, name, credits, grade);
                courses.add(course);
            } else {
                System.err.println("Peringatan: Format input tidak lengkap atau salah: " + line);
            }
        }

        System.out.println("\nMenampilkan semua courses yang tersimpan:");
        for (Course course : courses) {
            System.out.println(course);
        }

        input.close();
    }
}
