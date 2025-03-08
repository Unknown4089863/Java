import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.List;

public class Student_Management_System_Using_Collections {
    static HashMap<Integer, Student> map = new HashMap<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            System.out.println(
                    "\n1 => Add New Student              2 => Search by roll number\n3 => Display all Students            4 => Top Student by Marks\n0 => Exit");
            System.out.print("Enter Your Choice : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    add();
                    break;
                case 2:
                    System.out.println("Enter roll no of student : ");
                    int x = sc.nextInt();
                    search(x);
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    highestScore();
                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("Please select valid option");
            }
        }
    }

    static void add() {
        Student st = new Student();
        st.add();
        map.put(st.id, st);
    }

    static void remove(int key) {
        if (map.containsKey(key)) {
            map.remove(key);
            System.out.println("Student deleted successful\n");
        }
        return;
    }

    static void search(int id) {
        if (map.containsKey(id)) {
            print(map.get(id));
            return;
        }
        System.out.println("Student not found\n");
        return;
    }

    static void print(Student obj) {
        System.out.println("\n------------------------------");
        System.out.println("Name : " + obj.name);
        System.out.println("Roll no  : " + obj.id);
        System.out.println("Age : " + obj.age);
        System.out.println("Marks : " + obj.marks);
        System.out.println("------------------------------\n");
    }

    static void display() {
        if (map.isEmpty()) {
            System.out.println("No Student Found\n");
            return;
        }
        List<Student> students = marksDescendingOrder();
        for (Student student : students) {
            print(student);
        }
    }

    static void highestScore() {
        List<Student> students = marksDescendingOrder();
        print(students.get(0));
    }

    static List<Student> marksDescendingOrder() {
        List<Student> students = new ArrayList<>(map.values());
        students.sort(Comparator.comparingDouble(Student::getmarks).reversed());
        return students;
    }

}

class Student {
    int id;
    String name;
    int age;
    double marks;
    static int count = 1;
    Scanner sc = new Scanner(System.in);

    public Student() {
        id = count;
        count++;
        name = null;
        age = 0;
        marks = 0;

    }

    void add() {
        System.out.print("\nEnter name of student : ");
        name = sc.nextLine();
        System.out.print("Enter age of student : ");
        age = sc.nextInt();
        System.out.print("Enter marks of student : ");
        marks = sc.nextDouble();
        System.out.println("Student added successful\n");
    }

    public double getmarks() {
        return marks;
    }

}
