package EXERCICIOS.src.UNIDADE05;

import java.util.Scanner;

public class Uni5Exe29 {
    public static void main(String[] args) {
        //Um caixa automático possui cédulas de 1, 2, 5, 10 e 20. Faça um programa que leia um valor e informe a quantidade mínima de cédulas que ele precisará combinar para entregar o valor solicitado. Por exemplo: se o valor for 6, então ele fornecerá uma cédula de 5 e outra de 1. Se o número for 47, então ele fornecerá duas cédulas de 20, uma de 5 e outras de 2.

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um valor: ");
        int valor = sc.nextInt();

        System.out.println(valor/20 + " nota(s) de R$ 20,00");
        valor = valor % 20;
        System.out.println(valor/10 + " nota(s) de R$ 10,00");
        valor = valor % 10;
        System.out.println(valor/5 + " nota(s) de R$ 5,00");
        valor = valor % 5;
        System.out.println(valor/2 + " nota(s) de R$ 2,00");
        valor = valor % 2;
        System.out.println(valor/1 + " nota(s) de R$ 1,00");
        valor = valor % 1;

        sc.close();
    }

}
