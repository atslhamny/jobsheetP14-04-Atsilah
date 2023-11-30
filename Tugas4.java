import java.util.Scanner;

public class Tugas4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bulan ke berapa: ");
        int bulan = sc.nextInt();

        int jumlahMarmut = hitungJumlahMarmut(bulan);

        System.out.println("Pada akhir bulan ke-" + bulan + ", jumlah pasangan marmut adalah: " + jumlahMarmut);
    }

    static int hitungJumlahMarmut(int bulan) {
        if (bulan <= 2) {
            return 1;
        } else {
            return hitungJumlahMarmut(bulan - 2) + hitungJumlahMarmut(bulan - 1);
        }
    }
}
