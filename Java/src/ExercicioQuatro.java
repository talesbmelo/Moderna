public class ExercicioQuatro {
    public static void main(String[] args) {
        String usuario = "########### USUÁRIO ###########";
        String nomeDec = "Nome:  ";
        String cpfDec =  "CPF:   ";
        String emailDec = "Email: ";
        String senhaDec = "Senha: ";
        String fim = "###############################";
        String nome = "Tales Melo";
        int cpfp1 = 064;
        int cpfp2 = 452;
        int cpfp3 = 404;
        int cpfp4 = 96;
        String email = "tales.resto@hotmail.com";
        String senha = "acelga10";

        System.out.println(usuario);
        System.out.println(nomeDec + nome);
        System.out.println(cpfDec+cpfp1+"."+cpfp2+"."+cpfp3+"-"+cpfp4);
        System.out.println(emailDec+email);
        System.out.println(senhaDec+senha);
        System.out.println(fim);
        System.out.println(senhaDec+senha.replaceAll("[@#$%&*A-Za-Z0-9]","*"));
    }
}
