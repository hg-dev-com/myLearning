
import java.util.HashSet;

public class LongestSubstring {
	
    public static void main(String[] args) {
        String str = "javajavaspringbootspring";
        HashSet<Character> set = new HashSet<>();

        int left = 0, maxLength = 0;
        

        for (int right = 0; right < str.length(); right++) {
            while (set.contains(str.charAt(right))) {
                set.remove(str.charAt(left));
                left++;
            }
            
            set.add(str.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }
        

        System.out.println("Max Length: " + maxLength);
    }
}