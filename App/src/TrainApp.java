import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Bogie class with name and capacity
class Bogie {
    private String name;
    private int capacity;

    // Constructor
    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return name + " (" + capacity + " seats)";
    }
}

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create a list of passenger bogies
        List<Bogie> passengerBogies = new ArrayList<>();
        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair", 60));
        passengerBogies.add(new Bogie("First Class", 50));

        System.out.println("\nPassenger bogies before sorting:");
        passengerBogies.forEach(System.out::println);

        // Sort bogies by capacity (ascending)
        passengerBogies.sort(Comparator.comparingInt(Bogie::getCapacity));

        System.out.println("\nPassenger bogies after sorting by capacity:");
        passengerBogies.forEach(System.out::println);
    }
}