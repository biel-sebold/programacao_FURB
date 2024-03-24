package ExerciciosAlgoritmo;

import java.util.Scanner;

public class Uni2Exe15 {
    public static void main(String[] args) {
        //AJUDADO//
        //Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0,50, 0,25, 0,10, 0,05 e 0,01. A seguir mostre a relação de notas de permissão.

        Scanner dig = new Scanner(System.in);

        System.out.print("Digite o valor: ");
        double valor = dig.nextDouble();

        int[] notas = {100, 50, 20, 10, 5, 2};
        double[] moedas = {1, 0.50, 0.25, 0.10, 0.05, 0.01}; 

        System.out.println("Notas permitidas: ");
            for(int nota : notas){
               double quantidadeNotas = valor/nota;
               valor -= quantidadeNotas* nota;
               System.out.printf("%d nota(s) de R$%.2f\n", quantidadeNotas, nota);
            }

            for(double moeda : moedas) {
               int quantidadeMoedas = (int)(valor / moeda);
               valor -= quantidadeMoedas * moeda;
               System.out.printf("%d moeda(s) de R$%.2f\n", quantidadeMoedas, moeda);
            } 
            
        dig.close();   
    }   
}
