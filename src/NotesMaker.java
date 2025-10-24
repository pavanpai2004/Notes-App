import java.io.*;

public class NotesMaker {

    // --- File where notes are stored ---
    private final String NOTES_FILE = "Notes.txt";


/**
 * Appends a new note to the notes file.
 * If the file does not exist, it will be created automatically.
 */
    public void writeNote(String note) {
        // --- Try-with-resources ensures FileWriter is closed automatically ---
        try(FileWriter writer = new FileWriter(NOTES_FILE, true)){
            writer.write(note+"\n");
        }catch (IOException e){
            System.out.println("Error in writing notes file");
        }
    }

/**
 * Reads and displays all the notes stored in the notes file.
 * Each note is printed with a line number. If file not found,prints error message.
 */
    public void readNotes(){
        File notes = new File(NOTES_FILE);
        if(!notes.exists()){
            System.out.println("No Notes found. please add some notes\n");
            return;
        }

        // --- Try-with-resources ensures BufferedReader is closed automatically ---
        try(BufferedReader reader = new BufferedReader(new FileReader(notes))){
            String line;
            int lineNumber = 1;
            while((line = reader.readLine())!=null){
                System.out.println(lineNumber+"."+line);
                lineNumber++;
            }
        }catch (IOException e){
            System.out.println("Error in reading notes file");
        }
    }
}
