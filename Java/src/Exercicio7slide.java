import java.util.Scanner;

public class Exercicio7slide {
    public static void main(String[] args) {
        Scanner receba = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = Integer.parseInt(receba.nextLine());

        if (numero%2 == 0) {
            System.out.println("O número é par");
        }
        else {
            System.out.println("O número é impar");
        }
        System.out.println();


    }





}
