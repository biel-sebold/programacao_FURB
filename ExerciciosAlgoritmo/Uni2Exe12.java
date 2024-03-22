package ExerciciosAlgoritmo;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni2Exe12 {
    public static void main(String[] args) {
        //Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles, mostrando 4 casas decimais após a vírgula, segundo a fórmula:

        Scanner dig = new Scanner(System.in);
        DecimalFormat padrao = new DecimalFormat("###,##0.00");

        System.out.print("Informe a coordenada x1: ");
        int x1 = dig.nextInt();

        System.out.print("Informe a coordenada x2: ");
        int x2 = dig.nextInt();

        System.out.print("Informe a coordenada y1: ");
        int y1 = dig.nextInt();

        System.out.print("Informe a coordenada y2: ");
        int y2 = dig.nextInt();

        double xquadrado = Math.pow(x2-x1, 2);
        double yquadrado = Math.pow(y2-y1, 2);
        double distânciaPontos = Math.sqrt(xquadrado+yquadrado);

        System.out.println("A distância dos pontos é igual a: " + distânciaPontos);

        dig.close();





        




    }
    
}
