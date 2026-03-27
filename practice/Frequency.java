import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        Map<Character, Integer> map = new HashMap<>();

        for (char ch : input.toCharArray()) {

            if (ch == ' ') continue;

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        System.out.println("Character Frequencies:");

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        sc.close();
    }
}