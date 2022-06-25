package br.com.infnet.projetofinal.empresaAcme.model;

public abstract class EnderecoFuncionario {

    public EnderecoFuncionario(String numeroCep, String logradouro, long numeroLogradouro, String complemento,
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

    public String getNumeroCep() {
        return numeroCep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public long getNumeroLogradouro() {
        return numeroLogradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }
}
