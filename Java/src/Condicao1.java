public class Condicao1 {
    public static void main(String[] args) {
        boolean souBrasileiro = true;
        boolean tenhoMaisDe18 = true;

        if(! (souBrasileiro && tenhoMaisDe18)){
            System.out.println("Executou o código");
        }
        else {
            System.out.println("Executou o else");
        }

        String texto = (souBrasileiro && tenhoMaisDe18) ? "Executou o código" : "Executou o else";
        System.out.println(texto);
    }
}
