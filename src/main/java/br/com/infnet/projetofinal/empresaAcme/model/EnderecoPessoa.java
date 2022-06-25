package br.com.infnet.projetofinal.empresaAcme.model;

public class EnderecoPessoa {

    public EnderecoPessoa(String numeroCep, String logradouro, long numeroLogradouro, String complemento,
                          String bairro, String cidade, String estado) {
        this.numeroCep = numeroCep;
        this.logradouro = logradouro;
        this.numeroLogradouro = numeroLogradouro;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade  = cidade;
        this.estado = estado;
    }
    private String numeroCep;
    private String logradouro;
    private long numeroLogradouro;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
}
