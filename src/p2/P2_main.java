package p2;

public class P2_main {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 16;
        int d = 0;
        int count = 0;

        if (a==b){count++;}
        if (a==b || a==c){count++;}
        if (a + b >= c){count++;}
        if (a + b +c >= 100){count++;
        }
        d = count;
        System.out.println(d);
    }
}
