import java.util.Scanner;

public class Segitiga {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double Alas;
        double Tinggi;
        double Luas;

        System.out.print("Masukkan Alas: ");
        Alas = sc.nextDouble();
        System.out.print("Masukkan Tinggi: ");
        Tinggi = sc.nextDouble();

        Luas = 0.5 * Alas * Tinggi;
        System.out.println("Menghitung Luas Segitiga");
        System.out.println("Alas = " + Alas + " cm");
        System.out.println("Luas = " + Luas + " cm square");
    }
}

