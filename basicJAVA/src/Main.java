import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5};

        for (int num : numbers) {
            System.out.println(num + "");
        }

        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        for (String name : names) {
            System.out.println(name);
        }

        // String loop with for each

        String text = "Hello, World!";

        for (char c : text.toCharArray()) {
            System.out.println(c + " ");
        }
    }
}