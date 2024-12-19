import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Immutable map using Map.ofEntries (introduced in JDK 9)
        Map<String, Integer> immutableMap = Map.ofEntries(
                Map.entry("Alice", 90),
                Map.entry("Bob", 85),
                Map.entry("Charlie", 92)
        );

        System.out.println("Immutable Map: " + immutableMap);

        // Mutable map for demonstration
        Map<String, Integer> scores = new HashMap<>(immutableMap);

        // computeIfAbsent: Add a default score if the student doesn't exist
        scores.computeIfAbsent("Diana", k -> 75);
        System.out.println("After computeIfAbsent: " + scores);

        // merge: Update scores conditionally
        scores.merge("Alice", 5, Integer::sum); // Add 5 to Alice's score
        System.out.println("After merge: " + scores);

        // getOrDefault: Handle missing entries gracefully
        int frankScore = scores.getOrDefault("Frank", 0);
        System.out.println("Frank's score (default): " + frankScore);

        // Demonstrating the use of records (introduced in JDK 16)
        record StudentScore(String name, int score) {}

        scores.forEach((name, score) -> {
            StudentScore student = new StudentScore(name, score);
            System.out.println("Student Record: " + student);
        });
    }
}