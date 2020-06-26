import java.util.*;
import java.util.Map.Entry;

public class RegexPatterns{

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Map<String, String> users = new HashMap<>();
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];
            String emailID = firstNameEmailID[1];

            users.putIfAbsent(emailID, firstName);
        }

        scanner.close();
        users.entrySet().stream()
            .filter(e -> e.getKey().matches("\\b.+@gmail.com\\b"))
            .sorted(Entry.comparingByValue())
            .forEach(e -> System.out.println(e.getValue()));
    }

}