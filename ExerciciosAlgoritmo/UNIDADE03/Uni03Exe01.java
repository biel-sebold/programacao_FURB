package ExerciciosAlgoritmo.UNIDADE03;
import java.util.Scanner;

public class Uni03Exe01 {
    public static void main(String[] args) {
        //Uma imobiliária vende apenas terrenos retangulares. Faça um programa para ler as dimensões de um terreno e depois exibir a área do terreno.

        Scanner dig = new Scanner(System.in);

        System.out.print("Informe o lado A do retângulo: ");
        double A = dig.nextDouble();

        System.out.print("Informe o lado B do retângulo: ");
        double B = dig.nextDouble();

        double area = A * B;
        System.out.printf("A área do retângulo é %.2f metros quadrados", area);






    }
    
}
