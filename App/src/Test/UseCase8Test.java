import java.util.*;

public class UseCase8Test {

    public static void main(String[] args) {

        test1();
        test2();
        test3();
        test4();

        System.out.println("ALL TESTS COMPLETED");
    }

    static void test1() {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 80),
                new Bogie("AC Chair", 75),
                new Bogie("First Class", 60)
        );

        List<Bogie> result = UseCase8.filterBogiesByCapacity(bogies, 70);

        System.out.println(result.size() == 2 ? "TEST1 PASS" : "TEST1 FAIL");
    }

    static void test2() {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 70)
        );

        List<Bogie> result = UseCase8.filterBogiesByCapacity(bogies, 70);

        System.out.println(result.isEmpty() ? "TEST2 PASS" : "TEST2 FAIL");
    }

    static void test3() {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 40)
        );

        List<Bogie> result = UseCase8.filterBogiesByCapacity(bogies, 70);

        System.out.println(result.isEmpty() ? "TEST3 PASS" : "TEST3 FAIL");
    }

    static void test4() {
        List<Bogie> bogies = new ArrayList<>();

        List<Bogie> result = UseCase8.filterBogiesByCapacity(bogies, 70);

        System.out.println(result.isEmpty() ? "TEST4 PASS" : "TEST4 FAIL");
    }
}