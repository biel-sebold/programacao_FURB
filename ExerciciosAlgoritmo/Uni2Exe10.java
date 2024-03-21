package ExerciciosAlgoritmo;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni2Exe10 {
    public static void main(String[] args) {
    //Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.

    Scanner dig = new Scanner(System.in);
    DecimalFormat padrao = new DecimalFormat("00.00");

    System.out.print("Informe o tempo de duração do evento em segundos: ");
    int tSegundos = dig.nextInt();
    double tHoras = tSegundos / 60;

    System.out.print("O tempo em horas será: " + tHoras);

    dig.close();

        
    }
    
}
