import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Digite uma medida em metros: ");
        double metros = sc.nextDouble();
        sc.close();

        double centimetros = metros * 100;
        System.out.println(metros + "metros, correspondente à " + centimetros +" centímetros.");
    }
}
