package LogicaViradoNoJiraya.EstruturasCondicionais.IF_Else;

import java.util.Scanner;

public class AlistamentoMilitar {
    /*
    Como secretário de alistamento militar eu gostaria que meu sistema aceitasse os seguintes parâmetros para que eu possa agilizar o processo de cadastramento:
Sexo, sendo válido apenas M ou F e idade.
Se o sexo for Masculino e a idade for maior ou igual a 18 o sistema deve imprimir alistamento obrigatório
Se o sexo for Masculino e a idade for menor que 18 o sistema deve imprimir, alistamento não permitido
Se o sexo for Feminino e a idade for maior ou igual a 18 o sistema deve Perguntar se a pessoa deseja se alistar
Se o sexo for Feminino e a idade for menor que 18 o sistema deve imprimir, alistamento não permitido
    * */
    public static void main(String[] args) {
        Scanner MouF = new Scanner(System.in);
        System.out.println("Digite o Sexo: ");
        String Sexo = MouF.next();
        Scanner Novaidade = new Scanner(System.in);
        System.out.println("Digite a idade: ");
        int idade = Novaidade.nextInt();
        if (Sexo.equalsIgnoreCase("Masculino") || Sexo.equalsIgnoreCase("M") && idade >= 18){
            System.out.println("Alistamento obrigatório!");
        } else if (Sexo.equalsIgnoreCase("Masculino") || Sexo.equalsIgnoreCase("M") && idade < 18) {
            System.out.println("Alistamento não permitido!");
        } else if (Sexo.equalsIgnoreCase("Feminino") || Sexo.equalsIgnoreCase("F") && idade >= 18) {
            System.out.println("Deseja se alistar ? ");
        } else if (Sexo.equalsIgnoreCase("Feminino") || Sexo.equalsIgnoreCase("F") && idade < 18) {
            System.out.println("Alistamento não permitido!");
        } else {
            System.out.println("Entrada de dados inválido");
        }
    }
}
