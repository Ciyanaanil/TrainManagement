import java.util.HashSet;
import java.util.Set;

public class TrainApp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Create a HashSet to store unique bogie IDs
        Set<String> bogieIDs = new HashSet<>();

        // Add bogie IDs (including duplicates)
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101"); // duplicate
        bogieIDs.add("BG102"); // duplicate

        // Display final set of unique bogie IDs
        System.out.println("\nUnique Bogie IDs in the train consist:");
        System.out.println(bogieIDs);
    }
}