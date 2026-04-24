import java.util.*;
import java.util.stream.Collectors;

// Bogie class
class Bogie {
    private String type;
    private int capacity;

    public Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Bogie{type='" + type + "', capacity=" + capacity + "}";
    }
}

// Main UC9 class
public class UseCase9 {

    public static Map<String, List<Bogie>> groupByType(List<Bogie> bogies) {

        return bogies.stream()
                .collect(Collectors.groupingBy(Bogie::getType));
    }

    public static void main(String[] args) {

        // Step 1: Create bogie list
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 80));
        bogies.add(new Bogie("AC Chair", 70));
        bogies.add(new Bogie("Sleeper", 60));
        bogies.add(new Bogie("First Class", 50));
        bogies.add(new Bogie("AC Chair", 65));

        // Step 2: Group bogies by type
        Map<String, List<Bogie>> grouped = groupByType(bogies);

        // Step 3: Display grouped result
        System.out.println("=== Grouped Bogies by Type ===");

        for (Map.Entry<String, List<Bogie>> entry : grouped.entrySet()) {
            System.out.println("\nType: " + entry.getKey());

            for (Bogie b : entry.getValue()) {
                System.out.println("  " + b);
            }
        }
    }
}