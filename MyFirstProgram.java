import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class MyFirstProgram {
    // Colors
    public static final String Green = "\u001b[0;32m";
    public static final String Bblue = "\u001b[1;34m";
    public static final String Yellow = "\u001b[0;33m";
    public static final String Orange = "\u001b[38;5;208m";
    public static final String Red = "\u001b[0;31m";
    public static final String Purple = "\u001b[0;35m";
    public static final String Cyan = "\u001b[0;36m";
    public static final String Bred = "\u001b[91m";
    public static void main(String[] args) {
            // Declare variables  
            String userName;
            // Set up the scanner for user input
            Scanner scanner = new Scanner(System.in);

            // Creating a List
            List<String> myList = new ArrayList<>();

            // List of Funfacts
            myList.add(Cyan + "Did you know? Java was created by accident when James Gosling and his team at Sun Labs were working on a set-top box. They started by \"cleaning up\" C++ and ended up with a new language.");
            myList.add(Cyan + "Did you know? Java code can run on any underlying platform, such as Windows, Linux, iOS, or Android, without needing to be rewritten.");
            myList.add(Cyan + "Did you know? Java is an important component of the Internet of Things (IoT) ecosystem. IoT is a top trending technology that is making the world more connected.");

            // Shuffle List
            Collections.shuffle(myList);

            // Welcome message (Task 1)
            System.out.println(Green + "Welcome to My First Project!");
            System.out.println(Yellow + "(Im still learning about java language.)");

            // User Input (Task 2)
            System.out.println(Orange + "Can you please tell me your name?");
            System.out.print(Red + "Enter your name :  ");
            userName = scanner.next();
            System.out.println(Purple + "Hello " + Bred + userName + Purple + " Nice to meet you!");

            // Display Funfacts (Task 3)
            System.out.println(Green + "Let me tell you a funfact about java!");
            System.out.println(myList.get(0));

            System.out.println(Bblue + "(Java version : " + System.getProperty("java.version") + ")");
            

            // close the scanner
            scanner.close();
}}
