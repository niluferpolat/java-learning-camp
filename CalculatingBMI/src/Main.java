import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    private static  final DecimalFormat df= new DecimalFormat("0.00");
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double bmi;
        System.out.print("Kilonuzu giriniz: ");
        int kilo=input.nextInt();
        System.out.print("Boyunuzu giriniz: ");
        double boy= input.nextDouble();
        bmi=kilo/(boy*boy);
        System.out.print("Kutle Beden Indeksi: "+df.format(bmi));

    }
}
