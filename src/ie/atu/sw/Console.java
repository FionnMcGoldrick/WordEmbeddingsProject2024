package ie.atu.sw;

import java.util.Scanner;

public class Console {

    //Instance variables
    private Scanner input = new Scanner(System.in);

    //constructor that calls method start
    public Console() {
        start();
    }

    /**
     * Method to start the console
     */
    public void start() {
        menu();
    }

    /**
     * Method to display the menu
     */
    private void menu() {

        String choice;
        while (true) {

            //menu options
            System.out.println("\n\n");
            System.out.println("************************************************************");
            System.out.println("*     ATU - Dept. of Computer Science & Applied Physics    *");
            System.out.println("*                                                          *");
            System.out.println("*             Virtual Threaded Text Simplifier             *");
            System.out.println("*                                                          *");
            System.out.println("************************************************************");
            System.out.println("(1) Specify Embeddings File");
            System.out.println("(2) Specify Google 1000 File");
            System.out.println("(3) Specify an Output File (default: ./out.txt)");
            System.out.println("(4) Execute, Analyse and Report");
            System.out.println("(5) Optional Extensions");
            System.out.println("(6) Quit");

            System.out.print("Enter choice: ");
            choice = input.nextLine();

            clearScreen();

            //sleep for 1 second
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //switch statement to handle user input
            switch (choice) {
                case "1":
                    System.out.println("Specify Embeddings File");
                    break;
                case "2":
                    System.out.println("Specify Google 1000 File");
                    break;
                case "3":
                    System.out.println("Specify an Output File (default: ./out.txt)");
                    break;
                case "4":
                    System.out.println("Execute, Analyse and Report");
                    break;
                case "5":
                    System.out.println("Optional Extensions");
                    break;
                case "6":
                    System.out.println("Quit");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }

    //method to clear console screen
    private void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
