package LogicaViradoNoJiraya.EstruturasCondicionais.IF_Else;

import java.util.Scanner;

public class TorneioDeNatacao {
/*
Eu como usuário gostaria de ter o nome e a idade de participantes de um torneio de natação e que o sistema imprimisse da seguinte forma:
Menor que 10 anos: <Nome> participará da categoria infantil
Entre 11 e 15 anos: <Nome> participará da categoria Juvenil
Entre 16 e 19 anos: <Nome> participará da categoria Pré-adulto
Acima de 20 anos: <Nome> participará da categoria Adulto
* */
    public static void main(String[] args) {
        System.out.println("Digite o nome do participante:");
        Scanner nome = new Scanner(System.in);
        String Participante = nome.next();
        System.out.println("Digite a idade do participante:");
        Scanner idade = new Scanner(System.in);
        int idadeParticipante = idade.nextInt();
        if (idadeParticipante <= 10){
            System.out.println("O participante: " + Participante + " é da Categoria Infantil");
        } else if (idadeParticipante > 10 && idadeParticipante <= 15) {
            System.out.println("O participante: " + Participante + " é da Categoria Juvenil");
        } else if (idadeParticipante > 15 && idadeParticipante <= 19) {
            System.out.println("O participante: " + Participante + " é da Categoria Pré-Adulto");
        } else if (idadeParticipante >= 20) {
            System.out.println("O participante: " + Participante + " é da Categoria Adulto");
        }
    }
}
