package ExerciciosAlgoritmo;

import java.util.Scanner;

public class Uni2Exe01 {
    public static void main(String[] args) {
        //Leia 2 valores inteiros e imprima sua soma.

        Scanner dig = new Scanner (System.in);
        System.out.print("Informe dois números: ");

        int A = dig.nextInt();
        int B = dig.nextInt();
        int soma = A + B;

     System.out.println("A soma é " + soma);

//EXEMPLO CONCATENAÇÃO            
    //System.out.printf("A soma de %d com %d é: %d%n", A, B, x);







        
        //VERSÃO BEECROWD

       /*  Scanner teclado = new Scanner (System.in);

        //ENTRADA
        int valorA = teclado.nextInt();
        int valorB = teclado.nextInt();

        //PROCESSO
        int x = valorA + valorB;

        //SAÍDA
        System.out.println("X = " + x);
        teclado.close(); */
       
    }
    
}
