package academy.devdojo.Arrays;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, long, float, double = 0
        // char '\u0000' = ' '
        // boolean false
        // String null

        String[] nomes = new String[4];
        nomes[0] = "Naruto ";
        nomes[1] = "Luffy ";
        nomes[2] = "Zoro ";
        nomes[3] = "Jiraya ";

        for (int i = 0;i < nomes.length; i++){
            System.out.println(nomes[i]);
        }
        nomes = new String[5];

    }
}
