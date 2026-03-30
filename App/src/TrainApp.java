import java.util.LinkedHashSet;
import java.util.Set;

public class TrainApp {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Create LinkedHashSet to store bogies (unique + insertion order)
        Set<String> trainFormation = new LinkedHashSet<>();

        // Attach bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to attach a duplicate bogie
        trainFormation.add("Sleeper"); // duplicate ignored automatically

        // Display final train formation
        System.out.println("\nFinal train formation (unique + ordered):");
        System.out.println(trainFormation);
    }
}