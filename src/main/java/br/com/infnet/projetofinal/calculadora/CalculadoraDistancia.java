package br.com.infnet.projetofinal.calculadora;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class CalculadoraDistancia {
    private Integer x1, x2, y1, y2;

    private void informarDados() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite x1");
        x1 = entrada.nextInt();
        System.out.println("Digite x2");
        x2 = entrada.nextInt();
        System.out.println("Digite y1");
        y1 = entrada.nextInt();
        System.out.println("Digite y2");
        y2 = entrada.nextInt();
    }

    private double calcular(){
        return Math.sqrt(Math.pow((x2 - x1), 2) +  Math.pow((y2 - y1), 2));
    }

    private void imprimirResultado(double resultado) {
        NumberFormat formatter = new DecimalFormat("#0.0000");
        System.out.println(formatter.format(resultado));
    }

    public static void main(String[] args) {
        CalculadoraDistancia calculadoraDistancia = new CalculadoraDistancia();
        calculadoraDistancia.informarDados();
        final double resultado = calculadoraDistancia.calcular();
        calculadoraDistancia.imprimirResultado(resultado);
    }
}
