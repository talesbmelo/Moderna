import java.util.Scanner;

public class Exercicio7SlidePt2 {
    public static void main(String[] args) {
        Scanner receba = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = Integer.parseInt(receba.nextLine());

        System.out.print("Digite o segundo número: ");
        int numero2 = Integer.parseInt(receba.nextLine());

        int soma = numero1+numero2;
        int multiplicacao = numero1*numero2;


        System.out.println("A soma dos dois valores é: "+soma);
        System.out.println("A multiplicação dos dois valores é: "+multiplicacao);

        if (soma==multiplicacao) {
            System.out.println("A soma dos dois valores é igual à multiplicação");
        }
        else {
            System.out.println("A soma dos dois valores não é igual à multiplicação");
        }


    }
}
