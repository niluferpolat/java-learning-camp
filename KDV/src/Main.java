import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    private  static final DecimalFormat df= new DecimalFormat("0.0");
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Lütfen Fiyat Giriniz: ");
       double fiyat = input.nextDouble();
       double kdv_orani=fiyat>0&&fiyat<=1000? 0.18:0.8;
       double kdvli_fiyat=fiyat+(kdv_orani*fiyat);
       System.out.println("KDVsiz fiyat:"+fiyat);
       System.out.println("KDV orani:"+df.format(kdv_orani*fiyat));
       System.out.println("KDVli fiyat:"+kdvli_fiyat);
    }
}
