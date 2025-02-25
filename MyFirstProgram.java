import java.util.Scanner;

public class MyFirstProgram {
    public static void main(String[] args) {
            // Declare variables  
            String userName;
            // Set up the scanner for user input
            Scanner scanner = new Scanner(System.in);

            // Welcome message
            System.out.println("Welcome to My First Project!");
            System.out.println("Im still learning about java language.");
            System.out.println("Can you please tell me your name?");
            System.out.print("");
            userName = scanner.next();
            System.out.print("Hello " + userName + " Nice to meet you!");
            System.out.print("Let me tell you some funfacts about java!");
}}
