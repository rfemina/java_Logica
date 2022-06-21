package LogicaViradoNoJiraya.EstruturasCondicionais.IF_Else;
import java.util.Scanner;

public class ImparPar {
    public static void main(String[] args) {
        /*Dado um determinado número inteiro, imprima se é impar ou par*/

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número para verificar se é Impar ou Par");

        int numero = ler.nextInt();
        if (numero %2 == 0){
            System.out.println("O número " + numero + " é Par");
        }else {
            System.out.println("O número " + numero + " é Impar");
        }
    }
}
