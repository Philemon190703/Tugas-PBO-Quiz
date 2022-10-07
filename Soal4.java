import java.util.Scanner;
public class Soal4 {
    private int nilai;

    public int getNilai() {
        return nilai;
    }

    public void setNilai(int nilai) {
        this.nilai = nilai;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Soal4 input = new Soal4();
        System.out.println("---------------------------------------");
        System.out.println("            GRADING PROGRAM            ");
        System.out.println("---------------------------------------");
        System.out.println("Masukkan Nilai : ");
        input.nilai = sc.nextInt();
        System.out.println("---------------------------------------");
        System.out.println("Nilai kamu : " + input.nilai);
        if (input.nilai >= 0 && input.nilai <40){
            System.out.println("Grade : E ");
        } else if (input.nilai >=40 && input.nilai <50) {
            System.out.println("Grade : D ");
        }  else if (input.nilai >=50 && input.nilai <55) {
            System.out.println("Grade : C- ");
        }  else if (input.nilai >=55 && input.nilai <60) {
            System.out.println("Grade : C ");
        } else if (input.nilai >=60 && input.nilai <65) {
            System.out.println("Grade : C+");
        } else if (input.nilai >=65 && input.nilai <70) {
            System.out.println("Grade :  B-");
        } else if (input.nilai >=70 && input.nilai <75) {
            System.out.println("Grade : B");
        } else if (input.nilai >=75 && input.nilai <80){
            System.out.println("Grade : B+ ");
        }  else if (input.nilai >=80 && input.nilai <85) {
            System.out.println("Grade : A- ");
        }  else if (input.nilai >=85 && input.nilai <90) {
            System.out.println("Grade : A");
        }  else if (input.nilai >=90 && input.nilai <100) {
            System.out.println("Grade : A+");
        } else {
            System.out.println("Sepertinya anda salah memasukkan data ! ");
        }
        System.out.println("-----------------------------------------");
        System.out.println("             TERIMA KASIH !           ");
        System.out.println("-----------------------------------------");
    }
}