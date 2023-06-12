import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Input the name: ");
            String name = scanner.next();
            try {
                user.setName(name);
                System.out.println("Successful. Your name is :" + name);
            } catch (IllegalNameException ie) {
                System.out.println(ie.getMessage());
            }

            System.out.println("Input your age: ");
            int age = scanner.nextInt();
            try {
                user.setAge(age);
                System.out.println("Successful. Your age is :" + age);
            } catch (IllegalAgeException ie) {
                System.out.println(ie.getMessage());
            }
        }
    }
}