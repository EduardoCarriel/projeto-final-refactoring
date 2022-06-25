package br.com.infnet.projetofinal.empresaAcme.model;

import br.com.infnet.projetofinal.empresaAcme.enumerator.EnumGrupoSanguineo;

public abstract class Funcionario {

    public Funcionario(Pessoa pessoa, EnumGrupoSanguineo grupoSanguineo, Long tempoDeServicoEmAnos,
                       Long numeroMatricula) {
        this.pessoa = pessoa;
        this.grupoSanguineo = grupoSanguineo;
        this.tempoDeServicoEmAnos = tempoDeServicoEmAnos;
        this.numeroMatricula = numeroMatricula;
    }

    private Pessoa pessoa;
    private EnumGrupoSanguineo grupoSanguineo;
    private Long tempoDeServicoEmAnos;
    private Long numeroMatricula;

    public Pessoa getPessoa() {
        return pessoa;
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
