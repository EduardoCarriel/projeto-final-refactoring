package br.com.infnet.projetofinal.empresaAcme.model;

public abstract class Pessoa {

    public Pessoa(Long id, String nome, String sobrenome, EnderecoPessoa enderecoPessoa) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.enderecoPessoa = enderecoPessoa;
    }

    private Long id;
    private String nome;
    private String sobrenome;
    private EnderecoPessoa enderecoPessoa;

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public EnderecoPessoa getEnderecoPessoa() {
        return enderecoPessoa;
    }
}
