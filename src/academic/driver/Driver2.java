package academic.driver;

import academic.model.Student;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * @author 12S24009 Kezia Vania Pasaribu
 */
public class Driver2 {

    public static void main(String[] _args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.println("Masukkan data student (format: ID#NAMA#TAHUN#JURUSAN), akhiri dengan '---'");

        while (input.hasNextLine()) {
            String line = input.nextLine();

            if (line.equals("---")) {
                break;
            }

            String[] parts = line.split("#");

            if (parts.length == 4) {
                String id = parts[0];
                String name = parts[1];
                int year = Integer.parseInt(parts[2]);
                String major = parts[3];

                Student student = new Student(id, name, year, major);
                students.add(student);
            } else {
                System.err.println("Peringatan: Format input tidak lengkap atau salah: " + line);
            }
        }

        System.out.println("\nMenampilkan semua students yang tersimpan:");
        for (Student student : students) {
            System.out.println(student);
        }

        input.close();
    }
}