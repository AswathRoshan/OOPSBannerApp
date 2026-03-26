/**
 * OOPSBannerApp
 * UC5: Modular Banner Rendering using Methods
 */
public class OOPSBannerApp {

    public static void main(String[] args) {
        printBanner();
    }

    // Method to print banner
    public static void printBanner() {

        String[] banner = new String[7];

        banner[0] = buildLine("  *****  ", "  *****  ", " ******  ", " *****   ");
        banner[1] = buildLine(" *     * ", " *     * ", " *     * ", " *       ");
        banner[2] = buildLine(" *     * ", " *     * ", " *     * ", " *       ");
        banner[3] = buildLine(" *     * ", " *     * ", " ******  ", "  *****  ");
        banner[4] = buildLine(" *     * ", " *     * ", " *       ", "       * ");
        banner[5] = buildLine(" *     * ", " *     * ", " *       ", "       * ");
        banner[6] = buildLine("  *****  ", "  *****  ", " *       ", " *****   ");

        // Loop to print
        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Reusable method to build each line
    public static String buildLine(String a, String b, String c, String d) {
        return String.join(" ", a, b, c, d);
    }
}