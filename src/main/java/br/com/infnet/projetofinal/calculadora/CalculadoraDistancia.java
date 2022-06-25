package br.com.infnet.projetofinal.calculadora;

import br.com.infnet.projetofinal.exception.LancarMensagemExcecao;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CalculadoraDistancia {
    private double x1, x2, y1, y2;

    private void informarDados() {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite x1");
        dadoEntradaEhValido(entrada.next());
        x1 = entrada.nextDouble();

        System.out.println("Digite y1");
        dadoEntradaEhValido(entrada.next());
        y1 = entrada.nextDouble();

        System.out.println("Digite x2");
        dadoEntradaEhValido(entrada.next());
        x2 = entrada.nextDouble();

        System.out.println("Digite y2");
        dadoEntradaEhValido(entrada.next());
        y2 = entrada.nextDouble();
    }

    private void dadoEntradaEhValido(String dadoEntrada) {
        try {
            Double.parseDouble(dadoEntrada);
        } catch (RuntimeException ex) {
            System.out.println("O valor informado não é válido!");
        }
    }

    private double calcular(){
        return Math.sqrt(Math.pow(x2 - x1, 2) +  Math.pow((y2 - y1), 2));
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
