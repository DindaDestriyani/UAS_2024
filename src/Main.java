import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class PendeteksiKecepatan {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> Kecepatan1 = new ArrayList<>();

        System.out.print("Masukan Angka = ");
        Scanner inputUser = new Scanner(System.in);
        int number = inputUser.nextInt();
        int batas_atas = 200;
        int batas_bawah = 0;
        while (number <= batas_atas) {
            System.out.println("Angka = " + number);
            number++;

            for (int i = 0; i < 200; i++) {
                int kecepatan = Kecepatan1.get(0);
                Kecepatan1.add(kecepatan);
            }

            System.out.println("Kecepatan antara 80 km/jam dan 100 km/jam");
            for (int kecepatan : Kecepatan1) {
                if (kecepatan >= 80 && kecepatan <= 100) {
                    System.out.println(kecepatan + " km/jam ");
                }
            }
            System.out.println("Kecepatan di bawah 80 km/jam");
            for (int kecepatan : Kecepatan1) {
                if (kecepatan < 80) {
                    System.out.println(kecepatan + " km/jam ");
                }
            }
        }
    }
}