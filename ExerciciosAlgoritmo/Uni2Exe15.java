package ExerciciosAlgoritmo;

import java.util.Scanner;

public class Uni2Exe15 {
    public static void main(String[] args) {
        //AJUDADO//
        //Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0,50, 0,25, 0,10, 0,05 e 0,01. A seguir mostre a relação de notas de permissão.

        Scanner dig = new Scanner(System.in);

        System.out.print("Digite o valor: R$");
        double valor = dig.nextDouble();

        //NOTAS
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

        //MOEDAS
        int moedas1 = (int)valor % 2;
        valor %= 1;
        int moedas50 = (int)(valor / 0.50);
        valor %= 0.50;
        int moedas25 = (int)(valor / 0.25);
        valor %= 0.25;
        int moedas10 = (int)(valor / 0.10);
        valor %= 0.10;
        int moedas5 = (int)(valor / 0.05);
        valor %= 0.05;
        int moedas1Cent = (int)(valor / 0.01);
        
        System.out.printf(
            "Notas de 100: %d\n"+
            "Notas de 50: %d\n" +
            "Notas de 20: %d\n" +
            "Notas de 10: %d\n" +
            "Notas de 5: %d\n" +
            "Nota de 2: %d\n" +
            "Moedas de 1: %d\n" +
            "Moedas de 50 centavos: %d\n" +
            "Moedas de 25 centavos: %d\n" +
            "Moedas de 10 centavos: %d\n" +
            "Moedas de 5 centavos: %d\n" +
            "Moedas de 1 centavo: %d\n",
            notas100, notas50, notas20, notas10, notas5, notas2, moedas1, moedas50, moedas25, moedas10, moedas5, moedas1Cent);
            
        dig.close();   
    }   
}
