package p2;

public class P2_main {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 16;
        int d = 0;
        int Zahl = 0;

        if (a==b){
            Zahl++;
        }
        if (a==b || a==c) {
            Zahl++;
        }
        if (a + b >= c){
            Zahl++;
        }
        if (a + b +c >= 100){
            Zahl++;
        }
        d = Zahl;
        System.out.println(d);
    }
}
