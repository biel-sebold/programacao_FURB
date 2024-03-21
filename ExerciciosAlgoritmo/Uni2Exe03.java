package ExerciciosAlgoritmo;

import java.util.Scanner;

public class Uni2Exe03 {
    public static void main(String[] args) {
    //Calcule a área da faixa elevando o valor do raio ao quadrado e multiplicando por π (π = 3,14159).

    Scanner dig = new Scanner (System.in);
    System.out.print("Informe o valor do raio: ");

    double raio = dig.nextDouble();
    double rQuadrado = Math.pow(raio, 2);
    double pi = Math.PI;
    double area = rQuadrado * pi;


    System.out.println("A área da faixa é igual a: " + area); 
    }
}    