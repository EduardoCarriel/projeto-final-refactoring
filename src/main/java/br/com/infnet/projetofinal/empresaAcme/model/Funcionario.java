package br.com.infnet.projetofinal.empresaAcme.model;

import br.com.infnet.projetofinal.empresaAcme.enumerator.EnumGrupoSanguineo;

public abstract class Funcionario {

    public Funcionario(Long id, String nome, String sobrenome, EnderecoFuncionario enderecoFuncionario,
                       EnumGrupoSanguineo grupoSanguineo, Long tempoDeServicoEmAnos, Long numeroMatricula) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.enderecoFuncionario = enderecoFuncionario;
        this.grupoSanguineo = grupoSanguineo;
        this.tempoDeServicoEmAnos = tempoDeServicoEmAnos;
        this.numeroMatricula = numeroMatricula;
    }

    private Long id;
    private String nome;
    private String sobrenome;
    private EnderecoFuncionario enderecoFuncionario;
    private EnumGrupoSanguineo grupoSanguineo;
    private Long tempoDeServicoEmAnos;
    private Long numeroMatricula;

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public EnderecoFuncionario getEnderecoFuncionario() {
        return enderecoFuncionario;
    }

    public EnumGrupoSanguineo getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public Long getTempoDeServicoEmAnos() {
        return tempoDeServicoEmAnos;
    }

    public Long getNumeroMatricula() {
        return numeroMatricula;
    }
}
