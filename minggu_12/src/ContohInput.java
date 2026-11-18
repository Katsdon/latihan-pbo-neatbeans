import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ContohInput {

    private static double nilai1;
    private static double nilai2;

    public static void main(String[] args) {
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Input Nilai 1 : ");
            nilai1 = Double.parseDouble(input.readLine());
            System.out.print("Input Nilai 2 : ");
            nilai2 = Double.parseDouble(input.readLine());
            System.out.println(nilai1 + " + " + nilai2 + " = " +
                    (nilai1 + nilai2));
            System.out.println(nilai1 + " - " + nilai2 + " = " +
                    (nilai1 - nilai2));
            System.out.println(nilai1 + " * " + nilai2 + " = " +
                    (nilai1 * nilai2));
            System.out.println(nilai1 + " / " + nilai2 + " = " +
                    (nilai1 / nilai2));
        } catch (IOException e) {
        }
    }
}