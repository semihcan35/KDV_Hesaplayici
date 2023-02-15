import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float tutar, kdvOran= (float)0.18F;
        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen ücreti giriniz:");
        tutar = input.nextFloat();
        float kdv = (float)(tutar*kdvOran) ;
        System.out.println( "KDV'siz fiyat:"+tutar);
        System.out.println("KDV'li fiyat:"+(kdv+tutar));
        System.out.println("KDV tutarı:"+kdv);
    }


}