
package project2;

public class KelasFinal {
    private final int max = 5;
    private final int hargaCireng = 1000;
    private static int a;

    public static void main(String[] args) {
        KelasFinal kls = new KelasFinal();
        for (a = 1; a <= kls.max; a++) {
            System.out.println("Harga Cireng " + a + " : " + kls.hargaCireng * a);
        }
    }
}

