package br.com.infnet.projetofinal.empresaAcme.model;

import br.com.infnet.projetofinal.empresaAcme.enumerator.EnumGrupoSanguineo;

import java.util.Date;

public class Engenheiro extends Funcionario{

    private String numeroConselho;

    private Integer idade;

    private QualificacaoEngenheiro qualificacaoEngenheiro;

    public Engenheiro(Long id, String nome, String sobrenome, EnderecoFuncionario enderecoFuncionario,
                      EnumGrupoSanguineo grupoSanguineo, Long tempoDeServicoEmAnos, Long numeroMatricula,
                      String numeroConselho) {
        super(id, nome, sobrenome, enderecoFuncionario, grupoSanguineo, tempoDeServicoEmAnos, numeroMatricula);
        this.numeroConselho = numeroConselho;
    }

    public Double calcularBonusEngenheiro() {
        return getTempoDeServicoEmAnos() * 3.7;
    }

    public String getNumeroConselho() {
        return numeroConselho + new Date().getYear();
    }

    public Boolean engenheiroQualificadoParaTrabalhoFora(){
        return (qualificacaoEngenheiro.ehFluenteEmIngles() && (certificadoMestradoAprovado() || certificadoDoutoradoAprovado()));
    }

    private boolean certificadoMestradoAprovado() {
        return (qualificacaoEngenheiro.getTemMestrado() && qualificacaoEngenheiro.getNotaMestrado() > 7);
    }

    private boolean certificadoDoutoradoAprovado() {
        return (qualificacaoEngenheiro.getTemDoutorado() && qualificacaoEngenheiro.getNotaDoutorado() > 5);
    }

}
