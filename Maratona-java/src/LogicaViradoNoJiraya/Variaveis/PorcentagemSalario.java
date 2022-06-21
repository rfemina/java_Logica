package LogicaViradoNoJiraya.Variaveis;

public class PorcentagemSalario {
    public static void main(String[] args) {
        // Crie uma classe quee calcule uma determinada porcentam de um dado salário
        float salario = 8000;
        int porcentagem = 50;
        float porcentagemSalario = (salario + ((salario / 100) * porcentagem));
        System.out.println("O valor do salário é de: " + salario + " , e a porcentagem de '" + porcentagem +
                "' acrescida fica em: " + porcentagemSalario);

    }
}