import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nilai F: ");
        int F = sc.nextInt();

        System.out.print("Hasil Dari: ");
        tampilkanDeretPenjumlahan(F);

        int hasilRekursif = penjumlahanRekursif(F);

        System.out.println("= " + hasilRekursif);
    }

    static int penjumlahanRekursif(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + penjumlahanRekursif(n - 1);
        }
    }

    static void tampilkanDeretPenjumlahan(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i);
            if (i < n) {
                System.out.print("+");
            }
        }
    }
}
