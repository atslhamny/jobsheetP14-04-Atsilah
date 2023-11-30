import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("MASUKKAN NILAI N: ");
        int n = sc.nextInt();

        deretIteratif(n);
        System.out.println(deretRekursif(n));
    }

    static int deretRekursif(int n){
        if (n == 0) {
            return (1);
        }else
        System.out.print(n + " ");
        return ( n * deretRekursif(n-1));
    }

    static void deretIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }
}
