import java.util.Scanner;
public class DikUcgenProgrami {
    public static void main(String[] args) {

        double a, b, c, u, cevre, alan;
        System.out.println("Lütfen Üçgeninizin Hipotenüsünü, Alanını ve Çevresini Bulmak İçin İki Dik Kenar Uzunluğunu Giriniz:");
        Scanner input = new Scanner(System.in);

        System.out.print("1.Dik Kenar Uzunluğu Giriniz:");
        a = input.nextInt();
        System.out.print("2.Dik Kenar Uzunluğu Giriniz:");
        b = input.nextInt();

        c = Math.sqrt((a * a) + (b * b));
        u = (a + b + c)/2;
        cevre = 2*u;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.print("Hipotenüs:"+c);
        System.out.println(" Birim");

        System.out.print("Çevre:"+cevre);
        System.out.println(" Birim");

        System.out.print("Alan:"+alan);
        System.out.println(" Birimkare");
    }
}

