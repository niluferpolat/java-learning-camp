import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double ucret= 10.00;
        double km;
        Scanner input = new Scanner(System.in);
        System.out.print("Km giriniz: ");
        km=input.nextDouble();
        ucret= ucret + (km*2.20);
        System.out.print("Sonuc :"+(ucret<20.00? 20.00: ucret )+" TL");

    }
}
