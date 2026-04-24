


import java.util.*;
public class UseCase10Test {

    public static void main(String[] args) {

        testReduce_TotalSeatCalculation();
        testReduce_MultipleBogiesAggregation();
        testReduce_SingleBogieCapacity();
        testReduce_EmptyBogieList();
        testReduce_AllBogiesIncluded();
        testReduce_OriginalListUnchanged();

        System.out.println("\nALL UC10 TESTS COMPLETED");
    }

    static void testReduce_TotalSeatCalculation() {

        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 80),
                new Bogie("AC Chair", 70),
                new Bogie("First Class", 50)
        );

        int result = UseCase10.calculateTotalSeats(bogies);

        if (result == 200) {
            System.out.println("testReduce_TotalSeatCalculation PASSED");
        } else {
            System.out.println("testReduce_TotalSeatCalculation FAILED");
        }
    }

    static void testReduce_MultipleBogiesAggregation() {

        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 80),
                new Bogie("Sleeper", 60),
                new Bogie("AC Chair", 70)
        );

        int result = UseCase10.calculateTotalSeats(bogies);

        if (result == 210) {
            System.out.println("testReduce_MultipleBogiesAggregation PASSED");
        } else {
            System.out.println("testReduce_MultipleBogiesAggregation FAILED");
        }
    }

    static void testReduce_SingleBogieCapacity() {

        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 90)
        );

        int result = UseCase10.calculateTotalSeats(bogies);

        if (result == 90) {
            System.out.println("testReduce_SingleBogieCapacity PASSED");
        } else {
            System.out.println("testReduce_SingleBogieCapacity FAILED");
        }
    }

    static void testReduce_EmptyBogieList() {

        List<Bogie> bogies = new ArrayList<>();

        int result = UseCase10.calculateTotalSeats(bogies);

        if (result == 0) {
            System.out.println("testReduce_EmptyBogieList PASSED");
        } else {
            System.out.println("testReduce_EmptyBogieList FAILED");
        }
    }

    static void testReduce_AllBogiesIncluded() {

        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 40),
                new Bogie("AC Chair", 30),
                new Bogie("First Class", 20)
        );

        int result = UseCase10.calculateTotalSeats(bogies);

        if (result == 90) {
            System.out.println("testReduce_AllBogiesIncluded PASSED");
        } else {
            System.out.println("testReduce_AllBogiesIncluded FAILED");
        }
    }

    static void testReduce_OriginalListUnchanged() {

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 80));
        bogies.add(new Bogie("AC Chair", 70));

        int originalSize = bogies.size();

        UseCase10.calculateTotalSeats(bogies);

        if (bogies.size() == originalSize) {
            System.out.println("testReduce_OriginalListUnchanged PASSED");
        } else {
            System.out.println("testReduce_OriginalListUnchanged FAILED");
        }
    }
}