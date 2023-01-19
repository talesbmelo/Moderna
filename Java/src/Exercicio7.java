import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###.00");
        df.format(1234.36);

        System.out.println("Digite o do trabalhador 1:");
        String nomeTrabUm = entrada.nextLine();

        System.out.println("Digite o do trabalhador 2:");
        String nomeTrabDois = entrada.nextLine();

        System.out.println("Digite o do trabalhador 3:");
        String nomeTrabTres = entrada.nextLine();

        System.out.println("Digite o salário de agosto do trabalhador 1:");
        double salAgoTrabUm = Double.parseDouble(entrada.nextLine());

        System.out.println("Digite o salário de setembro do trabalhador 1:");
        double salSetTrabUm = Double.parseDouble(entrada.nextLine());

        System.out.println("Digite o salário de outubro do trabalhador 1:");
        double salOutTrabUm = Double.parseDouble(entrada.nextLine());

        System.out.println("Digite o salário de agosto do trabalhador 2:");
        double salAgoTrabDois = Double.parseDouble(entrada.nextLine());

        System.out.println("Digite o salário de setembro do trabalhador 2:");
        double salSetTrabDois = Double.parseDouble(entrada.nextLine());

        System.out.println("Digite o salário de outubro do trabalhador 2:");
        double salOutTrabDois = Double.parseDouble(entrada.nextLine());

        System.out.println("Digite o salário de agosto do trabalhador 3:");
        double salAgoTrabTres = Double.parseDouble(entrada.nextLine());

        System.out.println("Digite o salário de setembro do trabalhador 3:");
        double salSetTrabTres = Double.parseDouble(entrada.nextLine());

        System.out.println("Digite o salário de outubro do trabalhador 3:");
        double salOutTrabTres = Double.parseDouble(entrada.nextLine());

        double mediaSalTrabUm = ((salAgoTrabUm+salSetTrabUm+salOutTrabUm)/3);
        double mediaSalTrabDois = ((salAgoTrabDois+salSetTrabDois+salOutTrabDois)/3);
        double mediaSalTrabTres = ((salAgoTrabTres+salSetTrabTres+salOutTrabTres)/3);

        System.out.println("A média de salários dos últimos 3 meses de " + nomeTrabUm + " é " + mediaSalTrabUm);

        System.out.println("A média de salários dos últimos 3 meses de " + nomeTrabDois + " é " + mediaSalTrabDois);

        System.out.println("A média de salários dos últimos 3 meses de " + nomeTrabTres + " é " + mediaSalTrabTres);


    }
}
