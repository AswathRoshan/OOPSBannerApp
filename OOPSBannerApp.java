/**
 * OOPSBannerApp
 * UC7: Store Character Pattern in a Class
 */
public class OOPSBannerApp {

    /**
     * Inner static class to store character and its pattern
     */
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility method to get pattern for a character
     */
    public static String[] getPattern(char ch, CharacterPattern[] patterns) {
        for (CharacterPattern cp : patterns) {
            if (cp.getCharacter() == ch) {
                return cp.getPattern();
            }
        }
        return null;
    }

    public static void main(String[] args) {

        // Define patterns
        CharacterPattern[] patterns = new CharacterPattern[]{

                new CharacterPattern('O', new String[]{
                        "  *****  ",
                        " *     * ",
                        " *     * ",
                        " *     * ",
                        " *     * ",
                        " *     * ",
                        "  *****  "
                }),

                new CharacterPattern('P', new String[]{
                        " ******  ",
                        " *     * ",
                        " *     * ",
                        " ******  ",
                        " *       ",
                        " *       ",
                        " *       "
                }),

                new CharacterPattern('S', new String[]{
                        " *****   ",
                        " *       ",
                        " *       ",
                        "  *****  ",
                        "       * ",
                        "       * ",
                        " *****   "
                })
        };

        String word = "OOPS";

        String[] banner = new String[7];

        // Build banner
        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                String[] pattern = getPattern(ch, patterns);
                line.append(pattern[i]).append(" ");
            }

            banner[i] = line.toString();
        }

        // Print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}