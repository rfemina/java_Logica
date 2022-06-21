package LogicaViradoNoJiraya.EstruturasCondicionais.IF_Else;

import java.util.Scanner;

public class CalculadoraImpostoComCondicional {
    public static void main(String[] args) {
        /*
         * Dado um determinado salário
         * Se o salário for maior que 4500, imprima 30% do valor, senão imprima 15% do valor
         * */
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite o valor a ser verificado ");
        double salario = 4500;
        double recebe = valor.nextDouble();

        if (recebe > salario) {
            salario = salario * 0.3;
            System.out.println("O valor a retornar é de 30% = " + salario);
        } else {
            salario = salario * 0.15;
            System.out.println("O valor a retornar é de 15% = " + salario);
        }
    }
}
