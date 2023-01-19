import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu nome:");
        String nome = entrada.nextLine();

        System.out.println("Digite a sua idade:");
        int idade = Integer.parseInt(entrada.nextLine());

        System.out.println("Digite o seu CPF (000.000.000-00):");
        String cpf = entrada.nextLine();

        System.out.println("Digite o seu gênero");
        String genero = entrada.nextLine();

        System.out.println("Digite o seu Email:");
        String email = entrada.nextLine();

        System.out.println("Digite o seu telefone:");
        String telefone = entrada.nextLine();

        System.out.println("Digite o seu endereço");
        String endereco = entrada.nextLine();

        System.out.println("############### Formulário Moderna ###############");
        System.out.println("Nome: "+nome+"       "+"Idade: "+idade);
        System.out.println("CPF: "+cpf);
        System.out.println("Gênero: "+genero);
        System.out.println("Email: "+email);
        System.out.println("Telefone: "+telefone);
        System.out.println("Endereço: "+endereco);



    }
}
