import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

/**
 * A simple implementation using a HashMap to store the domain occurrences:
 * The program has a time complexity of O(NlogN), where N is the number of email addresses. This is due to the sorting step when displaying the top domains.
 * This program is optimal when we store multiple records and read them only once.
 * In cases when we need to read stored values many times it would be better to use a TreeMap instead of HashMap.
 */
public class TopDomainsCounter {

    public static void main(String[] args) {
        Map<String, Integer> domainCountMap = new HashMap<>();

        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNextLine()) {
                String email = scanner.nextLine();
                Optional<String> domain = extractDomain(email);
                domain.ifPresent(s -> domainCountMap.put(s, domainCountMap.getOrDefault(s, 0) + 1));
            }
        }

        printDomains(domainCountMap, 10);
    }

    private static void printDomains(Map<String, Integer> domainCountMap, int limit) {
        domainCountMap.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(limit)
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }

    private static Optional<String> extractDomain(String email) {
        if(email == null) {
            return Optional.empty();
        }
        int index = email.indexOf('@');
        if(index == -1) {
            return Optional.empty();
        }
        return Optional.of(email.substring(index + 1));
    }
}
