import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int mat,muzik,fizik,kimya,tarih,turkce;
        System.out.println("Muzik Notunuz: ");
        muzik=input.nextInt();
        System.out.println("Matematik Notunuz: ");
        mat=input.nextInt();
        System.out.println("Fizik Notunuz: ");
        fizik=input.nextInt();
        System.out.println("Kimya Notunuz: ");
        kimya=input.nextInt();
        System.out.println("Tarih Notunuz: ");
        tarih=input.nextInt();
        System.out.println("Turkce Notunuz: ");
        turkce=input.nextInt();

        double toplam= (mat+muzik+fizik+kimya+tarih+turkce)/6.0;
        System.out.println(toplam<60.0 ? "Kaldı": "Gecti");

    }

}
