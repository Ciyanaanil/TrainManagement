import java.util.*;

public class UseCase9Test {

    public static void main(String[] args) {

        testGrouping_BogiesGroupedByType();
        testGrouping_MultipleBogiesInSameGroup();
        testGrouping_DifferentBogieTypes();
        testGrouping_EmptyBogieList();
        testGrouping_SingleBogieCategory();
        testGrouping_MapContainsCorrectKeys();
        testGrouping_GroupSizeValidation();
        testGrouping_OriginalListUnchanged();

        System.out.println("\nALL UC9 TESTS COMPLETED");
    }

    static void testGrouping_BogiesGroupedByType() {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 80),
                new Bogie("Sleeper", 60),
                new Bogie("AC Chair", 70)
        );

        Map<String, List<Bogie>> result = UseCase9.groupByType(bogies);

        if (result.get("Sleeper").size() == 2) {
            System.out.println("testGrouping_BogiesGroupedByType PASSED");
        } else {
            System.out.println("testGrouping_BogiesGroupedByType FAILED");
        }
    }

    static void testGrouping_MultipleBogiesInSameGroup() {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("AC Chair", 70),
                new Bogie("AC Chair", 65)
        );

        Map<String, List<Bogie>> result = UseCase9.groupByType(bogies);

        if (result.get("AC Chair").size() == 2) {
            System.out.println("testGrouping_MultipleBogiesInSameGroup PASSED");
        } else {
            System.out.println("testGrouping_MultipleBogiesInSameGroup FAILED");
        }
    }

    static void testGrouping_DifferentBogieTypes() {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 80),
                new Bogie("AC Chair", 70),
                new Bogie("First Class", 50)
        );

        Map<String, List<Bogie>> result = UseCase9.groupByType(bogies);

        if (result.size() == 3) {
            System.out.println("testGrouping_DifferentBogieTypes PASSED");
        } else {
            System.out.println("testGrouping_DifferentBogieTypes FAILED");
        }
    }

    static void testGrouping_EmptyBogieList() {
        List<Bogie> bogies = new ArrayList<>();

        Map<String, List<Bogie>> result = UseCase9.groupByType(bogies);

        if (result.isEmpty()) {
            System.out.println("testGrouping_EmptyBogieList PASSED");
        } else {
            System.out.println("testGrouping_EmptyBogieList FAILED");
        }
    }

    static void testGrouping_SingleBogieCategory() {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 80),
                new Bogie("Sleeper", 60)
        );

        Map<String, List<Bogie>> result = UseCase9.groupByType(bogies);

        if (result.size() == 1 && result.containsKey("Sleeper")) {
            System.out.println("testGrouping_SingleBogieCategory PASSED");
        } else {
            System.out.println("testGrouping_SingleBogieCategory FAILED");
        }
    }

    static void testGrouping_MapContainsCorrectKeys() {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 80),
                new Bogie("AC Chair", 70),
                new Bogie("First Class", 50)
        );

        Map<String, List<Bogie>> result = UseCase9.groupByType(bogies);

        if (result.containsKey("Sleeper")
                && result.containsKey("AC Chair")
                && result.containsKey("First Class")) {
            System.out.println("testGrouping_MapContainsCorrectKeys PASSED");
        } else {
            System.out.println("testGrouping_MapContainsCorrectKeys FAILED");
        }
    }

    static void testGrouping_GroupSizeValidation() {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 80),
                new Bogie("Sleeper", 60),
                new Bogie("Sleeper", 50)
        );

        Map<String, List<Bogie>> result = UseCase9.groupByType(bogies);

        if (result.get("Sleeper").size() == 3) {
            System.out.println("testGrouping_GroupSizeValidation PASSED");
        } else {
            System.out.println("testGrouping_GroupSizeValidation FAILED");
        }
    }

    static void testGrouping_OriginalListUnchanged() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 80));
        bogies.add(new Bogie("AC Chair", 70));

        int originalSize = bogies.size();

        UseCase9.groupByType(bogies);

        if (bogies.size() == originalSize) {
            System.out.println("testGrouping_OriginalListUnchanged PASSED");
        } else {
            System.out.println("testGrouping_OriginalListUnchanged FAILED");
        }
    }
}