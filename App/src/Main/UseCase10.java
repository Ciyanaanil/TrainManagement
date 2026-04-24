import java.util.*;
import java.util.stream.Collectors;

// Bogie class
class Bogie {
    String type;
    int capacity;

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
        return type + " (" + capacity + ")";
    }
}

// Main class
public class UseCase10 {

    // Method to calculate total seats using reduce
    public static int calculateTotalSeats(List<Bogie> bogies) {

        return bogies.stream()
                .map(b -> b.getCapacity())
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {

        // Step 1: Create bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 80));
        bogies.add(new Bogie("AC Chair", 70));
        bogies.add(new Bogie("First Class", 50));
        bogies.add(new Bogie("Sleeper", 60));

        // Step 2: Calculate total seats
        int totalSeats = calculateTotalSeats(bogies);

        // Step 3: Display result
        System.out.println("=== Train Seating Capacity ===");
        System.out.println("Total Seats in Train: " + totalSeats);
    }
}