import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NotesMaker notesMaker = new NotesMaker();

        while(true){
            System.out.println("=====================");
            System.out.println("1. Add note");
            System.out.println("2. Read notes");
            System.out.println("3. Exit");
            System.out.println("=====================");
            System.out.print("Enter your choice: ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {

                // --- Write Note ---
                case 1: {
                    System.out.println("\nEnter note: ");

                    // consume the new line character stored in buffer
                    scanner.nextLine();

                    // read the note
                    String note = scanner.nextLine();
                    notesMaker.writeNote(note);

                    break;
                }

                // --- Read Note ---
                case 2: {
                    notesMaker.readNotes();
                    System.out.println();
                    break;
                }

                // --- EXit --
                case 3: {
                    return;
                }

                // --- Invalid Input ---
                default: {
                    System.out.println("Invalid choice. please enter valid choice.");
                }
            }

        }

    }
}