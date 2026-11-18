
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3};

        Scanner userInput = new Scanner(System.in);
        FileInputStream fileInput = null;
        String pesanIO = null;
        String pesanGabungan = null;

        System.out.print("nilai array ke: ");
        int index = userInput.nextInt();
        // exception handling (try,catch,finally)
        System.out.println("Handling out of bound");
        try {
            System.out.printf("index ke-%d, adalah %d\n", index, array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(e);
        }

        // runtime error jika file tidak ada
        System.out.println("Handling IO not found");
        try {
            fileInput = new FileInputStream("input.txt");
        } catch (IOException e) {
            pesanIO = e.toString();
        }

        // menggabungkan dua exception
        System.out.println("menggabungkan dua buah exception");
        try {
            System.out.printf("index ke-%d, adalah %d\n", index, array[index]);
            fileInput = new FileInputStream("input.txt");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Index yang anda masukan tidak sesuai dengan jumlah array");
        } catch (IOException e) {
            pesanGabungan = "file tidak ditemukan";
        }

        // finally
        System.out.println("Menambahkan Finally");

        try {
            System.out.printf("index ke-%d, adalah %d\n", index, array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Index yang anda masukan tidak sesuai dengan jumlah array");
        } finally {
            System.out.println("finally");
        }

        System.out.println("\nakhir dari program");
        System.out.flush();

        // pesan error dicetak paling akhir
        if (pesanIO != null) {
            System.err.println(pesanIO);
        }
        if (pesanGabungan != null) {
            System.err.println(pesanGabungan);
        }
    }
}
