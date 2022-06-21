package LogicaViradoNoJiraya.EstruturasCondicionais.IF_Else;

import java.util.Scanner;

public class VerificaIdade {
    public static void main(String[] args) {
        /* Receba uma idade como entrada
        SE a idade for maior que 18, é "adulto"
        senão, imprima "não adulto"
        * */
        int idade = 18;
        Scanner sc = new Scanner(System.in);
        String Frase = "Digite a idade da pessoa ";
        System.out.println(Frase);
        int idade2 = sc.nextInt();
        if (idade <= idade2) {
            System.out.println("Adulto");
        } else {
            System.out.println("Não é Adulto");
        }
    }
}
