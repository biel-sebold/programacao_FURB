package ExerciciosAlgoritmo;

import java.util.Scanner;

public class Uni2Exe14 {
    public static void main(String[] args) {
        //AJUDADO//
        //Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas permitida.

        Scanner dig = new Scanner(System.in);

        // Ler o valor inteiro
        System.out.print("Digite o valor: ");
        int valor = dig.nextInt();

        // Array de notas disponíveis
        int[] notas = {100, 50, 20, 10, 5, 2, 1};

        // Mostrar o valor lido
        System.out.println("Valor lido: " + valor);

        // Mostrar a relação de notas permitida
        System.out.println("Notas permitidas:");
            for (int nota : notas) {
               int quantidadeNotas = valor / nota;
               valor %= nota;
               System.out.println(nota + ": " + quantidadeNotas + " nota(s)");
        }

        dig.close();

    



        
    }
    
}
