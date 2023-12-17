import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan Nama Mahasiswa: ");
        String studentNama = scanner.nextLine();
        System.out.print("Masukan Nomor ID: ");
        int studentID = scanner.nextInt();
        scanner.nextLine();
        student student = new student(studentNama, studentID);

        System.out.print("Enter courses to enroll in (separated by commas): ");
        String coursesInput = scanner.nextLine();
        String[] courses = coursesInput.split(", ");
        for (String course : courses) {
            student.enrollInCourse(course);
        }

        System.out.println(student.getUserDetails());

        teacher teacher1 = new teacher("Nina Fitriyanti", 505, "Math");
        teacher teacher2 = new teacher("Iqbal Ramadan", 550, "Business");

        teacher1.teachClass();
        teacher2.teachClass();

        scanner.close();
    }
}
