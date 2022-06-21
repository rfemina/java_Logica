package LogicaViradoNoJiraya.EstruturasCondicionais.IF_Else;

import java.util.Scanner;

public class ImpostoDeRenda {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor para ser calculado: ");

        double salario = ler.nextInt();
        double valor1 = 1903.98;
        double valor2 = 2826.65;
        double valor3 = 3751.05;
        double valor4 = 5664.68;
        double porcentagem;
        if (salario <= valor1){
            System.out.println("O valor digitado é isento de imposto: ");
        } else if (salario > valor1 && salario <= valor2) {
            porcentagem = salario * 0.075;
            salario = salario + porcentagem;
            System.out.println("O valor total com imposto é de: " + salario);
        } else if (salario > valor2 && salario <= valor3) {
            porcentagem = salario * 0.15;
            salario = salario + porcentagem;
            System.out.println("O valor total com imposto é de: " + salario);
        } else if (salario > valor3 && salario <= valor4) {
            porcentagem = salario * 0.225;
            salario = salario + porcentagem;
            System.out.println("O valor total com imposto é de: " + salario);
        } else if (salario > valor4) {
            porcentagem = salario * 0.275;
            salario = salario + porcentagem;
            System.out.println("O valor total com imposto é de: " + salario);
        }
    }
}
