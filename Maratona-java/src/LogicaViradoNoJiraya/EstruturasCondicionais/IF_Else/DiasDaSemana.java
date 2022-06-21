package LogicaViradoNoJiraya.EstruturasCondicionais.IF_Else;

import java.util.Scanner;

public class DiasDaSemana {
    /*
    * Receba um número inteiro do usuário e imprima o dia da semana correspondente
    * Sendo 1, a segunda-feira
    * */
    public static void main(String[] args) {
        Scanner DiaSemana = new Scanner(System.in);
        System.out.println("Insira um dia da semana de forma númerica: ");
        int dia = DiaSemana.nextInt();
        if (dia == 1){
            System.out.println("Segunda-feira");
        } else if (dia == 2) {
            System.out.println("Terça-Feira");
        } else if (dia == 3) {
            System.out.println("Quarta-feira");
        }  else if (dia == 4) {
            System.out.println("Quinta-Feira");
        } else if (dia == 5) {
            System.out.println("Sexta-feira");
        }  else if (dia == 6) {
            System.out.println("Sabado");
        } else if (dia == 7) {
            System.out.println("Domingo");
        } else {
            System.out.println("Entrada inválida");
        }
    }
}
