package p3;

public class P3_main {
    public static void main(String[] args) {
        int x = 5;
        if (x < 0) {
            x = -x;
        }
        System.out.println("Betrag" + x);
        {
            x = x * x;
            System.out.println("Quadrat" + x);
        }
        if (x % 2 == 0) {
            System.out.println("Grade");
        }
        else
            System.out.println("Ungrade");
    }
}