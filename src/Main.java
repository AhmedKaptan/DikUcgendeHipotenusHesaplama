import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenlerimizi oluşturalım.
        int a, b;
        double hipo, u, alan, cevre;


        // Kullanıcıdan verilerimizi alalım.
        Scanner girdi = new Scanner(System.in);
        System.out.println("1. Kenarı Giriniz : ");
        a= girdi.nextInt();
        System.out.print("2. Kenarı Giriniz : ");
        b = girdi.nextInt();

        hipo = Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs : " + hipo);

        //Çevre ve Alan Hesaplaması

        u = (a+b+hipo)/2;
        cevre= 2*(u);
        System.out.println("Üçgenin Çevresi: "+cevre);
        alan=Math.sqrt(u*(u-a)*(u-b)*(u-hipo));

        System.out.println("Çevre: "+cevre);
        System.out.println("Alan: "+alan);

    }
}