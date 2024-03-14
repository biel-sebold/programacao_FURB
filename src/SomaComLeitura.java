package src;

import java.util.Scanner;

public class SomaComLeitura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);

        int A = teclado.nextInt();
        int B = teclado.nextInt();
        int x = A + B;

        System.out.println("X = " + x);
    }
    
}
