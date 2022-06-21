package academy.devdojo.EstruturasDeRepetição;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for

        int count = 12;
        while (count < 10){
            System.out.println(count);
            count = count + 1;
        }
        count = 3;
        do {
            System.out.println("Dentro do Do-while" + ++count);
        } while (count < 10);


        for (int i=0;i<10;i++){
            System.out.println("For " + i);
        }

    }
}
