package academy.devdojo.Operadores;

public class Aula04Operadores {
    public static void main(String[] args) {
        int numero01 = 10;
        int numero02 = 20;
        double Resultado = ((numero01 / numero02) + 3);
        System.out.println(Resultado);

        // %
        int resto = 21 % 2;
        System.out.println(resto);

        // < > <= >= == !=

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDexIgualDez = 10 == 10;
        boolean isDezDiferenteDex = 10 != 10;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte " + isDezIgualVinte);
        System.out.println("isDexIgualDez " + isDexIgualDez);
        System.out.println("isDezDiferenteDex " + isDezDiferenteDex);

        // && (and) || (or) !

        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlayStation = 5000F;

        boolean isPlayStationCincoCompravel = valorTotalContaCorrente > valorPlayStation || valorTotalContaPoupanca > valorPlayStation;
        System.out.println("isPlaystationCincoCompravel " + isPlayStationCincoCompravel);

        // = += -= *= %=

        double bonus = 1800; // 1800
        bonus += 1000; // 2800
        bonus -= 1000; //1800

        System.out.println(bonus);

        //
        int contador = 0;
        contador += 1;
        contador++;
        contador--;
        ++contador;
        --contador;
        System.out.println(contador);
        int contador2 = 0;
        System.out.println(contador2++);
        System.out.println(contador2);



    }
}
