import java.util.Scanner;
import java.lang.Math;
public class Soal3 {
    private int internet;
    private int pengetikan;
    private int game;
    private int printWarna;
    private int printHP;
    private int teh;
    private int scan;

    public int getScan() {
       scan=  3 * 1000;
        return scan;
    }

    public void setScan(int scan) {
        this.scan = scan;
    }

    public int getInternet() {
        internet = 4000 - 667;
        return internet;
    }

    public void setInternet(int internet) {
        this.internet = internet;

    }

    public int getPengetikan() {
        pengetikan = 2000 - 666;
        return pengetikan;
    }

    public void setPengetikan(int pengetikan) {
        this.pengetikan = pengetikan;
    }

    public int getGame() {
        return game;
    }

    public void setGame(int game) {
        this.game = game;
        game = 5000;
    }

    public int getPrintWarna() {
        printWarna = 2 * 500;
        return printWarna;
    }

    public void setPrintWarna(int printWarna) {
        this.printWarna = printWarna;
        printWarna = 500;
    }

    public int getPrintHP() {
        printHP= 3*300;
        return printHP;
    }

    public void setPrintHP(int printHP) {
        this.printHP = printHP;
    }

    public int getTeh() {
        teh = 3000;
        return teh;
    }

    public void setTeh(int teh) {
        this.teh = teh;
        teh = 3000;
    }

    public static void main(String[] args) {

        Soal3 input = new Soal3();
        double nilaitotal;
        System.out.println("-------------------------------------------");
        System.out.println("               TAGIHAN ANDA !              ");
        System.out.println("-------------------------------------------");
        System.out.println(" Hai UDDIN, Tolong bayar tagihan anda ! JANGAN KAS BON !  ");
        System.out.println(" Rincian Tagihan :                         ");
        System.out.println(" Mengetik : " + input.getPengetikan());
        System.out.println(" Internet : " + input.getInternet());
        System.out.println(" Scan     : " + input.getScan());
        System.out.println(" Print Warna : " + input.getPrintWarna());
        System.out.println(" Print Hitam-Putih : " + input.getPrintHP());
        System.out.println(" Teh Kotak : " + input.getTeh());
        nilaitotal = input.pengetikan + input.internet + input.printHP + input.printWarna + input.scan + input.teh;
        System.out.println(" TAGIHAN ANDA  RP. " + nilaitotal);


    }
}