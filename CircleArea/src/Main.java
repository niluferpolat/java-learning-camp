import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    private static final DecimalFormat df=new DecimalFormat("0.00");
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi= 3.14;
        System.out.print("Lutfen bir yaricap giriniz: ");
        int yaricap= input.nextInt();
        double alan = (pi*pi)*yaricap;
        double cevre = 2*pi*yaricap;
        System.out.println("Alani: "+df.format(alan));
        System.out.println("Cevresi: "+df.format(cevre));
    }
}
