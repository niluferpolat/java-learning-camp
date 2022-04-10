import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    private static  final DecimalFormat df= new DecimalFormat("0.00");
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tutar;
        System.out.print("Armut kac kilo? ");
        int armut=input.nextInt();
        System.out.print("Elma kac kilo? ");
        int elma= input.nextInt();
        System.out.print("Domates kac kilo? ");
        int domates=input.nextInt();
        System.out.print("Muz kac kilo? ");
        int muz= input.nextInt();
        System.out.print("Patlican kac kilo? ");
        int patlican= input.nextInt();
        tutar=(armut*2.14)+(elma*3.67)+(domates*1.11)+(muz*0.95)+(patlican*5.0);
        System.out.print("Tutar: "+df.format( tutar));

    }
}
