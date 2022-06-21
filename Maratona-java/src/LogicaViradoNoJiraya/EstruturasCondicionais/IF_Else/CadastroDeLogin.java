package LogicaViradoNoJiraya.EstruturasCondicionais.IF_Else;

import java.util.Scanner;

public class CadastroDeLogin {
    /*
    Eu, como adm do sistema, gostaria de permitir que os próprios usuários cadastrassem o nome de usuário
    (login) no sistema para agilizar o processo de migração do sistema antigo para o novo
O usuário não pode deixar o vazio "", ou criar um usuário com o login "admin" ou "administrador".
Se o valor entrado for válido, o sistema deverá exibir uma mensagem <nome do usuário> cadastrado com sucesso.
Senão o sistema deverá mostrar o erro "Usuário inválido".
    * */
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);
        System.out.println("Digite o usuario desejado a ser cadastrado: ");
        String novousuario = usuario.next();
        if (novousuario.equalsIgnoreCase("admin") || novousuario.equalsIgnoreCase("administrador")
                || novousuario.equalsIgnoreCase("")){
            System.out.println(novousuario + ", esse usuário é inválido ");
        } else {
            System.out.println(novousuario + ", cadastrado com sucesso");
        }
    }
}
