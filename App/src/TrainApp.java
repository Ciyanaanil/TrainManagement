import java.util.LinkedList;

public class TrainApp {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Create LinkedList for train consist
        LinkedList<String> trainConsist = new LinkedList<>();

        // Add bogies in order
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("\nTrain consist after initial addition:");
        System.out.println(trainConsist);

        // Insert Pantry Car at position 2 (0-based index)
        trainConsist.add(2, "Pantry Car");

        System.out.println("\nTrain consist after inserting Pantry Car at position 2:");
        System.out.println(trainConsist);

        // Remove first and last bogie
        trainConsist.removeFirst();  // Engine removed
        trainConsist.removeLast();   // Guard removed

        System.out.println("\nFinal ordered train consist after removing first and last bogie:");
        System.out.println(trainConsist);
    }
}