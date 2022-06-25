package br.com.infnet.projetofinal.empresaAcme;

abstract class Funcionario {

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

    public Long getTempoDeServicoEmAnos() {
        return tempoDeServicoEmAnos;
    }

    /*public void setTempoDeServicoEmAnos(Long tempoDeServicoEmAnos) {
        this.tempoDeServicoEmAnos = tempoDeServicoEmAnos;
    }*/
}
