import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi1,sayi2,secim;
        System.out.print("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.print("1. Sayiyi giriniz: ");
        sayi1=input.nextInt();
        System.out.print("2. Sayiyi giriniz: ");
        sayi2=input.nextInt();
        System.out.print("Seciminiz :");
        secim=input.nextInt();

        switch (secim){
            case 1:System.out.print("Toplama: "+(sayi1+sayi2));break;
            case 2:System.out.print("Cikarma: "+(sayi1-sayi2));break;
            case 3:System.out.print("Carpma: "+(sayi1*sayi2));break;
            case 4:System.out.print("Bolme: "+(sayi1/sayi2));break;
            default:System.out.print("Yanlis secim!!");break;
        }
    }
}
