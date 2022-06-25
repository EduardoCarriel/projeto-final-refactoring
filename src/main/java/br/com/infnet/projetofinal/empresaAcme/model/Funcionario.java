package br.com.infnet.projetofinal.empresaAcme.model;

import br.com.infnet.projetofinal.empresaAcme.enumerator.EnumGrupoSanguineo;

public abstract class Funcionario {

    public Funcionario(Pessoa dadosFuncionario, EnumGrupoSanguineo grupoSanguineo, Long tempoDeServicoEmAnos,
                       Long numeroMatricula) {
        this.dadosFuncionario = dadosFuncionario;
        this.grupoSanguineo = grupoSanguineo;
        this.tempoDeServicoEmAnos = tempoDeServicoEmAnos;
        this.numeroMatricula = numeroMatricula;
    }

    private Pessoa dadosFuncionario;
    private EnumGrupoSanguineo grupoSanguineo;
    private Long tempoDeServicoEmAnos;
    private Long numeroMatricula;

    public Pessoa getDadosFuncionario() {
        return dadosFuncionario;
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

    public Integer getQuantidadeEmpregadosFabrica(){
        return 34;
    }
}
