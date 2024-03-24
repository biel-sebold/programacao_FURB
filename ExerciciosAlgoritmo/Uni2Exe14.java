package ExerciciosAlgoritmo;

import java.util.Scanner;

public class Uni2Exe14 {
    public static void main(String[] args) {
        //AJUDADO//
        //Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas permitida.

        Scanner dig = new Scanner(System.in);

        System.out.print("Digite o valor: R$");
        double valor = dig.nextInt();

        System.out.println("Valor lido: " + valor);

        int notas100 = (int)valor/100;
        valor%=100;
        int notas50 = (int)(valor % 100)/50;
        valor%=50;
        int notas20 = (int)(valor % 50)/20;
        valor%=20;
        int notas10 = (int)(valor % 20)/10;
        valor%=10;
        int notas5 = (int)(valor % 10)/5;
        valor%=5;
        int notas2 = (int)(valor % 5)/2;
        valor%=2;

        System.out.printf(
            "Notas de 100: %d\n"+
            "Notas de 50: %d\n" +
            "Notas de 20: %d\n" +
            "Notas de 10: %d\n" +
            "Notas de 5: %d\n" +
            "Nota de 2: %d\n",
            notas100, notas50, notas20, notas10, notas5, notas2);

        dig.close();

          /* 
        int[] notas = {100, 50, 20, 10, 5, 2};

            for (int nota : notas) {
               int quantidadeNotas = valor / nota;
               valor %= nota;
               System.out.println(nota + ": " + quantidadeNotas + " nota(s)");
        }*/
        
    }
    
}
