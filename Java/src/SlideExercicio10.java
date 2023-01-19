import java.util.Scanner;

public class SlideExercicio10 {
    public static void main(String[] args) {
        Scanner receba = new Scanner(System.in);
        System.out.println("Informe uma das opções abaixo:");
        System.out.println("(1) Cadastrar aluno");
        System.out.println("(2) Cadastrar endereço");
        System.out.println("(3) Imprimir aluno");
        System.out.println("(4) Imprimir endereço");
        System.out.println("(5) Sair");
        int ocpao = Integer.parseInt(receba.nextLine());
        String nome, sexo, idade, anoNascimento;
        String rua, numero, bairro, cep;

        switch (ocpao){
            case 1:
                System.out.println("Informe o nome do aluno: " );
                nome = receba.nextLine();
                System.out.println("Informe o sexo do aluno(M/F): " );
                sexo = receba.nextLine();
                System.out.println("Informe a idade do aluno: " );
                idade = receba.nextLine();
                System.out.println("Informe o ano de nascimento do aluno: " );
                anoNascimento = receba.nextLine();
                break;
            case 2:
                System.out.println("Informe o nome da rua: " );
                rua = receba.nextLine();
                System.out.println("Informe o número do endereço: " );
                numero = receba.nextLine();
                System.out.println("Informe o bairro: " );
                bairro = receba.nextLine();
                System.out.println("Informe o cep: " );
                cep = receba.nextLine();
                break;
            case 3:
                System.out.println("########### Aluno ##########" );
                System.out.println("Nome: "+nome+" Idade: "+idade);
                System.out.println("Sexo: "+sexo+" Ano de Nasc: "+anoNascimento);
                break;
        }
    }
}
