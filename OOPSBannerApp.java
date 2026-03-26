import java.util.HashMap;
import java.util.Map;

/**
 * OOPSBannerApp
 * UC8: Use HashMap for Character Patterns
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = getPatternMap();

        String word = "OOPS";

        String[] banner = new String[7];

        // Build banner
        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                line.append(patternMap.get(ch)[i]).append(" ");
            }

            banner[i] = line.toString();
        }

        // Print banner
        printBanner(banner);
    }

    // Method to create pattern map
    public static Map<Character, String[]> getPatternMap() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                "  *****  ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                "  *****  "
        });

        map.put('P', new String[]{
                " ******  ",
                " *     * ",
                " *     * ",
                " ******  ",
                " *       ",
                " *       ",
                " *       "
        });

        map.put('S', new String[]{
                " *****   ",
                " *       ",
                " *       ",
                "  *****  ",
                "       * ",
                "       * ",
                " *****   "
        });

        return map;
    }

    // Method to print banner
    public static void printBanner(String[] banner) {
        for (String line : banner) {
            System.out.println(line);
        }
    }
}