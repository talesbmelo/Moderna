public class AulaDois {
    public static void main(String[] args) {
        String nome = "John Doe";
        String dataNascimento = "01/01/1983";
        String casa = "carro branco";
        String juntar1 = "Moderna"+"-"+"Tecnologia";
        String juntar2 = nome + ", nasc: " + dataNascimento;
        int idade = 39;
        juntar2 += ", idade: "+idade;
        String texto = idade > 35 ? "Tá velhinho" : "Quase novo";

        System.out.println(nome);
        System.out.println(dataNascimento);
        System.out.println(casa);
        System.out.println(juntar1);
        System.out.println(juntar2);
        System.out.println(idade);
        System.out.println(juntar2);
        System.out.println(texto);
    }
}
