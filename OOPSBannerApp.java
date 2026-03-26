/**
 * OOPSBannerApp
 * UC6: Refactor Banner Logic into Functions
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] o = getOPattern();
        String[] p = getPPattern();
        String[] s = getSPattern();

        // Build final banner
        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = String.join(" ", o[i], o[i], p[i], s[i]);
        }

        // Print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Method for O pattern
    public static String[] getOPattern() {
        return new String[]{
                "  *****  ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                "  *****  "
        };
    }

    // Method for P pattern
    public static String[] getPPattern() {
        return new String[]{
                " ******  ",
                " *     * ",
                " *     * ",
                " ******  ",
                " *       ",
                " *       ",
                " *       "
        };
    }

    // Method for S pattern
    public static String[] getSPattern() {
        return new String[]{
                " *****   ",
                " *       ",
                " *       ",
                "  *****  ",
                "       * ",
                "       * ",
                " *****   "
        };
    }
}