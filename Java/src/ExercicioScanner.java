import java.util.Scanner;

public class ExercicioScanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome do seu pai:");
        String nomePai = entrada.nextLine();

        System.out.println("Digite a idade do seu pai:");
        int idadePai = Integer.parseInt(entrada.nextLine());

        System.out.println("Digite o nome da sua mãe:");
        String nomeMae = entrada.nextLine();

        System.out.println("Digite a idade da sua mãe:");
        int idadeMae = Integer.parseInt(entrada.nextLine());

        System.out.println("Pai: "+nomePai+" -"+" Idade: "+idadePai);
        System.out.println("Mãe: "+nomeMae+" -"+" Idade: "+idadeMae);
    }
}
