import java.util.*;

public class OOPSBannerApp {

    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
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

    public static String[] getCharacterPattern(
            char ch,
            CharacterPatternMap[] patterns) {

        for (CharacterPatternMap pattern : patterns) {
            if (pattern.getCharacter() == ch) {
                return pattern.getPattern();
            }
        }
        return null;
    }

    public static void main(String[] args) {

        CharacterPatternMap[] patterns = {

                new CharacterPatternMap('O', new String[]{
                        " ******** ",
                        "*        *",
                        "*        *",
                        "*        *",
                        "*        *",
                        "*        *",
                        " ******** "
                }),

                new CharacterPatternMap('P', new String[]{
                        "********  ",
                        "*       * ",
                        "*       * ",
                        "********  ",
                        "*         ",
                        "*         ",
                        "*         "
                }),

                new CharacterPatternMap('S', new String[]{
                        " ******** ",
                        "*         ",
                        "*         ",
                        " ******** ",
                        "         *",
                        "         *",
                        " ******** "
                })
        };

        String word = "OOPS";

        for (int row = 0; row < 7; row++) {

            StringBuilder bannerLine = new StringBuilder();

            for (char ch : word.toCharArray()) {

                String[] pattern = getCharacterPattern(ch, patterns);

                bannerLine.append(pattern[row]).append("   ");
            }

            System.out.println(bannerLine);
        }
    }
}