/**
 * OOPSBannerApp
 * UC4: Render OOPS Banner using String Array and Loop
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        // Create array
        String[] banner = new String[7];

        // Store each line using String.join()
        banner[0] = String.join(" ",
                "  *****  ",
                "  *****  ",
                " ******  ",
                " *****   ");

        banner[1] = String.join(" ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *       ");

        banner[2] = String.join(" ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *       ");

        banner[3] = String.join(" ",
                " *     * ",
                " *     * ",
                " ******  ",
                "  *****  ");

        banner[4] = String.join(" ",
                " *     * ",
                " *     * ",
                " *       ",
                "       * ");

        banner[5] = String.join(" ",
                " *     * ",
                " *     * ",
                " *       ",
                "       * ");

        banner[6] = String.join(" ",
                "  *****  ",
                "  *****  ",
                " *       ",
                " *****   ");

        // Print using loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}