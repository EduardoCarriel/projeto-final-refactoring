package br.com.infnet.projetofinal.empresaAcme.model;

import br.com.infnet.projetofinal.empresaAcme.enumerator.EnumGrupoSanguineo;
import br.com.infnet.projetofinal.util.Utils;

public class Engenheiro extends Funcionario{

    private String numeroConselho;

    private QualificacaoEngenheiro qualificacaoEngenheiro;

    public Engenheiro(Long id, String nome, String sobrenome, EnderecoFuncionario enderecoFuncionario,
                      EnumGrupoSanguineo grupoSanguineo, Long tempoDeServicoEmAnos, Long numeroMatricula,
                      String numeroConselho) {
        super(id, nome, sobrenome, enderecoFuncionario, grupoSanguineo, tempoDeServicoEmAnos, numeroMatricula);
        this.numeroConselho = numeroConselho;
    }

    public QualificacaoEngenheiro getQualificacaoEngenheiro() {
        return qualificacaoEngenheiro;
    }

    public void setQualificacaoEngenheiro(QualificacaoEngenheiro qualificacaoEngenheiro) {
        this.qualificacaoEngenheiro = qualificacaoEngenheiro;
    }

    public Double getBonus() {
        return getTempoDeServicoEmAnos() * 3.7;
    }

    public String getNumeroConselho() {
        return numeroConselho + Utils.retornarAnoAtual();
    }

    public String engenheiroEhQualificadoParaTrabalhoFora(){
        if (qualificacaoEngenheiro.ehFluenteEmIngles() && (certificadoMestradoAprovado() || certificadoDoutoradoAprovado())) {
            return "Sim";
        }
        return "Não";
    }

    private boolean certificadoMestradoAprovado() {
        return (qualificacaoEngenheiro.getTemMestrado() && qualificacaoEngenheiro.getNotaMestrado() > 7);
    }

    private boolean certificadoDoutoradoAprovado() {
        return (qualificacaoEngenheiro.getTemDoutorado() && qualificacaoEngenheiro.getNotaDoutorado() > 5);
    }
}
