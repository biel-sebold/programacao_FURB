package ExerciciosAlgoritmo;

import java.util.Scanner;

import org.xml.sax.SAXException;

public class Uni2Exe01 {
    public static void main(String[] args) {
        //Leia 2 valores inteiros e imprima sua soma.

        Scanner teclado = new Scanner (System.in);

        int A = teclado.nextInt();
        int B = teclado.nextInt();
        int x = A + B;

        System.out.println("X = " + x);




        
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
