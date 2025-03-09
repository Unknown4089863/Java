import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_Practice {

    static private Scanner sc = new Scanner(System.in);
    static private File file = new File("file.txt");

    public static void main(String[] args) {
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        boolean flag = true;
        while (flag) {
            System.out.print(
                    "\n1 => Add Text in File\n2 => Count Total Words\n3 => Count Specific Word\n4 => Display all text\n5 => longest word\n0 => exit ..\nEnter Your Choice : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    add();
                    break;

                case 2:
                    sc.nextLine();
                    System.out.println("Total no. of words is " + count());
                    break;

                case 3:
                    System.out.print("Enter word/sentence u want to count : ");
                    sc.nextLine();
                    String str = sc.nextLine();
                    System.out.println("Total no. of words is " + countSpecific(str));
                    break;

                case 4:
                    display();
                    break;

                    case 5:
                    // sc.nextLine();
                    System.out.println("Total longest  words is " + longest());
                    break;

                case 0:
                    flag = false;
                    break;

                default:
                    System.out.println("Enter valid choice.");
            }
        }
    }

    static void add() {
        FileWriter writer;
        try {
            writer = new FileWriter("file.txt", true);
            System.out.print("Enter Text ( type : EOF at end of text in new line) : ");
            sc.nextLine();
            while (true) {
                String str = sc.nextLine();
                if (str.equalsIgnoreCase("EOF")) {
                    break;
                }
                writer.append(str + '\n');
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int count() {
        int count = 0;
        try (Scanner read = new Scanner(file)) {
            while (read.hasNext()) {
                read.next();
                count++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return count;
    }

    static int countSpecific(String str) {
        int count = 0;

        try {
            Scanner read = new Scanner(file);

            while (read.hasNext()) {
                String r = read.next();
                if (r.equalsIgnoreCase(str)) {
                    count++;
                }
            }
            read.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return count;
    }

    static void display() {
        Scanner read;
        try {
            read = new Scanner(file);

            while (read.hasNextLine()) {
                String str = read.nextLine();
                System.out.println(str);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    static String longest() {
       String str ="";
        try (Scanner read = new Scanner(file)) {
            while (read.hasNext()) {
                String s= read.next();
                if(s.length()>str.length()){
                    str=s;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return str;
    }

}
