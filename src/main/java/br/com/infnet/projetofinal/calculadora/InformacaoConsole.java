package br.com.infnet.projetofinal.calculadora;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class InformacaoConsole {
    private Scanner scanner;
    private String informacaoConsole;

    public InformacaoConsole() {
        scanner = new Scanner(System.in);
    }

    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public void exibirResultado(double resultado) {
        NumberFormat formatter = new DecimalFormat("#0.0000");
        this.exibirMensagem(formatter.format(resultado));
    }

    public void solitarInformacao() {
        this.informacaoConsole = this.scanner.next();
    }

    public double getInformacaoNumerica() {
      return this.converterInformacaoParaNumero();
    }

    private double converterInformacaoParaNumero() {
        try {
            return Double.parseDouble(this.informacaoConsole);
        } catch (Exception ex) {
            this.exibirMensagem("O número informado não é válido!");
            this.solitarInformacao();
            return getInformacaoNumerica();
        }
    }
}
