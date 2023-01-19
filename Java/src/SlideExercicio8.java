import java.util.Scanner;

public class SlideExercicio8 {
    public static void main(String[] args) {
        Scanner receba = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = Integer.parseInt(receba.nextLine());
        System.out.print("Digite o segundo número: ");
        int numero2 = Integer.parseInt(receba.nextLine());
        System.out.print("Digite o terceiro número: ");
        int numero3 = Integer.parseInt(receba.nextLine());
        System.out.print("Digite o quarto número: ");
        int numero4 = Integer.parseInt(receba.nextLine());
        System.out.print("Digite o quinto número: ");
        int numero5 = Integer.parseInt(receba.nextLine());

        if (numero1<numero2 && numero1<numero3 && numero1<numero4 && numero1<numero5) {
            System.out.println("Menor: "+numero1);
        }
        else if (numero2<numero1&&numero2<numero3&&numero2<numero4&&numero2<numero5) {
            System.out.println("Menor: "+numero2);
        }
        else if (numero3<numero1&&numero3<numero2&&numero3<numero4&&numero3<numero5) {
            System.out.println("Menor: "+numero3);
        }
        else if (numero4<numero1&&numero4<numero3&&numero4<numero2&&numero4<numero5) {
            System.out.println("Menor: "+numero4);
        }
        else if (numero5<numero1&&numero5<numero3&&numero5<numero4&&numero5<numero2) {
            System.out.println("Menor: "+numero5);
        }
        else {

        }

        if (numero1>numero2&&numero1>numero3&&numero1>numero4&&numero1>numero5) {
            System.out.println("Maior: " + numero1);
        }
        else if (numero2>numero1&&numero2>numero3&&numero2>numero4&&numero2>numero5) {
            System.out.println("Menor: "+numero2);
        }
        else if (numero3>numero1&&numero3>numero2&&numero3>numero4&&numero3>numero5) {
            System.out.println("Menor: "+numero3);
        }
        else if (numero4>numero1&&numero4>numero3&&numero4>numero2&&numero4>numero5) {
            System.out.println("Menor: "+numero4);
        }
        else if (numero5>numero1&&numero5>numero3&&numero5>numero4&&numero5>numero2) {
            System.out.println("Menor: "+numero5);
        }
        else {

        }


    }
}
