package KatasAll;

public class Kata2 {

    public static Integer adjusting (int color) {
        if (color < 0 ) color = 0;
        if (color > 255) color = 255;
        return color;
    }
    public static String hex (int r, int g, int b) {
        return String.format("%02X%02X%02X", adjusting(r), adjusting(g), adjusting(b));
    }
}
