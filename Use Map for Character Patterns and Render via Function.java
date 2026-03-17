import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    static Map<Character, String[]> patternMap = new HashMap<>();

    public static void main(String[] args) {

        initializePatterns();
        renderBanner("OOPS");
    }

    static void renderBanner(String word) {

        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {
                String[] pattern = patternMap.get(c);
                if (pattern != null) {
                    line.append(pattern[i]).append("   ");
                }
            }

            System.out.println(line);
        }
    }

    static void initializePatterns() {

        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patternMap.put('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        patternMap.put('S', new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        });
    }
}
