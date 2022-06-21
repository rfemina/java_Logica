package academy.devdojo.EstruturasCondicionais;

public class CalculadoraDiferencaIdade {
    public static void main(String[] args) {
        /*
        Variável para guardar a diferença entre as idades
        * Variável para guardar a primeira idade
        * Variável para guardar a segunda idade
        * */
        int primeiraIdade = 10;
        int segundaIdade = 10;
        int diferencaIdades = segundaIdade - primeiraIdade;
        if (diferencaIdades != 0){
            System.out.println("A diferença entre as idades é de: " + diferencaIdades);
        } else {
            System.out.println("Quase hein haha");
        }
    }
}
