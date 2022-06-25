package br.com.infnet.projetofinal.calculadora;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class CalculadoraDistancia {
    private double x1, x2, y1, y2;
    private InformacaoConsole informacaoConsole;

    public  CalculadoraDistancia() {
        this.informacaoConsole = new InformacaoConsole();
    }

    private void solicitarDados() {
        this.informacaoConsole.exibirMensagem("Digite x1");
        this.informacaoConsole.solitarInformacao();
        x1 = this.informacaoConsole.getInformacaoNumerica();

        this.informacaoConsole.exibirMensagem("Digite y1");
        this.informacaoConsole.solitarInformacao();
        y1 = this.informacaoConsole.getInformacaoNumerica();

        this.informacaoConsole.exibirMensagem("Digite x2");
        this.informacaoConsole.solitarInformacao();
        x2 = this.informacaoConsole.getInformacaoNumerica();

        this.informacaoConsole.exibirMensagem("Digite y2");
        this.informacaoConsole.solitarInformacao();
        y2 = this.informacaoConsole.getInformacaoNumerica();
    }

    private double calcular(){
        return Math.sqrt(Math.pow(x2 - x1, 2) +  Math.pow((y2 - y1), 2));
    }

    public static void main(String[] args) {
        CalculadoraDistancia calculadoraDistancia = new CalculadoraDistancia();
        calculadoraDistancia.solicitarDados();
        final double resultado = calculadoraDistancia.calcular();
        calculadoraDistancia.informacaoConsole.exibirResultado(resultado);
    }
}
