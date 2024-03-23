package ExerciciosAlgoritmo;

import java.util.Scanner;

public class Uni2Exe13 {
    public static void main(String[] args) {
        //AJUDADO//
        //Dois carros (X e Y) partem em uma mesma direção. O carro X sai com velocidade constante de 60 Km/h e o carro Y sai com velocidade constante de 90 Km/h. Em uma hora (60 minutos) o carro Y consegue se distanciar 30 quilômetros do carro X, ou seja, consegue se afastar uma milha a cada 2 minutos. Leia a distância (em Km) e calcule quanto tempo leva (em minutos) para o carro e tome essa distância do outro carro.

        Scanner dig = new Scanner(System.in);

        System.out.print("Informe a distância entre os carros (em quilômetros): ");
        double distancia = dig.nextDouble();

        double tempoMinutos = (distancia / (90.0 / 60.0 - 60.0 / 60.0));
        //tempoMinutos = distancia / velocidadeY - velocidadeX

        System.out.println("O carro Y levará " + tempoMinutos + " minutos para alcançar o carro X.");

        dig.close();
 

        
    }
    
}
