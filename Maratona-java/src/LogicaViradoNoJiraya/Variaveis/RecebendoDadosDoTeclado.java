package LogicaViradoNoJiraya.Variaveis;

import java.util.Scanner;

public class RecebendoDadosDoTeclado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digita o nome: ");
        String nome = teclado.next();
        System.out.println("Digita a idade: ");
        int idade = teclado.nextInt();
        System.out.println("O nome digitado é: " + nome);
        System.out.println("O nome digitado é: " + idade);
    }
}
