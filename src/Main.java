import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r, aci;
        double pi= 3.14, alan;
        Scanner input=new Scanner(System.in);
        System.out.print("Yarıçapı giriniz: ");
        r= input.nextInt();
        System.out.print("Açıyı giriniz: ");
        aci= input.nextInt();
        alan= (pi*(r*r)*aci)/360;
        System.out.print("Alan: " +alan);
    }

}