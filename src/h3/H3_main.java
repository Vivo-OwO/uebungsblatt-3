package h3;

public class H3_main {
    public static void main(String[] args) {
        int max = 5;
        int fix = 2;
        int wartend = 2;
        boolean istvoll = false;

        if (max-fix > 0 && wartend > 0) {

            if (wartend <= max-fix) {
                fix = fix + wartend;
                wartend = 0;
            } else {
                wartend = wartend - (max-fix);
                fix = max;
            }
        }
        if (fix == max) {
            istvoll = true;

        } else {
            istvoll = false;
        }
        System.out.println("fix " + fix);
        System.out.println("wartend " + wartend);
        System.out.println("istvoll " + istvoll);
    }
}

