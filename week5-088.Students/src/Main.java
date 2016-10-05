
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();

        String name = "";
        String studentNumber = "";

        while (true) {
            System.out.println("name:");
            name = reader.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.println("student number:");
            studentNumber = reader.nextLine();

            list.add(new Student(name, studentNumber));
        }

        for (Student student : list) {
            System.out.println(student);
        }

        System.out.println("Give search term:");
        String searchTerm = reader.nextLine();
        System.out.println("Result:");
        for (Student student : list) {
            if (student.getName().contains(searchTerm)) {
                System.out.println(student);
            }
        }
    }
}
