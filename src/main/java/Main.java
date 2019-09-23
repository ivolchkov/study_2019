import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;

public class Main {
    public static void main(String[] args) {
        String line = "Hello word!";
        String result = method(line);
        System.out.println(result);
    }

    public static String method(String line) {
        validation(line);

        Map<String, Long> letterToCounter = letterCounter(line);

        return transferMapToString(line, letterToCounter);
    }

    private static String transferMapToString(String line, Map<String, Long> letterToCounter) {
        final StringBuilder result = new StringBuilder().append(line).append("\n");
        letterToCounter.forEach((key, value) -> result.append(String.format("\"%s\" - %d\n", key, value)));

        return result.toString();
    }

    private static void validation(String line) {
        // your implementation quit good
    }

    private static Map<String, Long> letterCounter(String line) {
        return Arrays.stream(line.split("")).
                collect(Collectors.groupingBy(identity(), counting()));
    }
}
