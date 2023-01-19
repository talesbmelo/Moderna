public class Exercicio2 {
    public static void main(String[] args) {
        int x = 1900;
        int y = 2000;

        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);

        int anoAtual = 2022;
        int anoNascimento = 1987;

        System.out.println("Tales Melo - Nascido em " + anoNascimento + " com idade " + (anoAtual - anoNascimento));

        float f = 180;
        final float R = 32;
        float n = 5;
        float dn = 9;
        final float D = (n / dn);
        float c = (f - 32) * (n / dn);
        float temperatura = (f - R) * D;

        System.out.println(c);
        System.out.println(temperatura);
    }
}
