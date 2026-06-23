import java.util.*;

public class OOPSBannerApp {


    public static void main(String[] args) {

        HashMap<Character , String []>  patterns = new HashMap<>();



               patterns.put('O', new String[]{
                        " ******** ",
                        "*        *",
                        "*        *",
                        "*        *",
                        "*        *",
                        "*        *",
                        " ******** "
                });

                patterns.put('P', new String[]{
                        "********  ",
                        "*       * ",
                        "*       * ",
                        "********  ",
                        "*         ",
                        "*         ",
                        "*         "
                });

                patterns.put('S', new String[]{
                        " ******** ",
                        "*         ",
                        "*         ",
                        " ******** ",
                        "         *",
                        "         *",
                        " ******** "
                });
        

        String word = "OOPS";

        for (int row = 0; row < 7; row++){

        StringBuilder bannerLine = new StringBuilder();

        for (char ch : word.toCharArray()) {

            String[] pattern = patterns.get(ch);

            bannerLine.append(pattern[row]).append("   ");
        }

        System.out.println(bannerLine);
          }
    }
}