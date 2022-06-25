package br.com.infnet.projetofinal.empresaAcme.model;

import br.com.infnet.projetofinal.empresaAcme.enumerator.EnumGrupoSanguineo;

import java.util.Date;

public class Engenheiro extends Funcionario{

    private String numeroConselho;

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

    public Integer verificaQualificacoesParaTrabalhoFora(Boolean temMestrado, Integer notaMestrado,
                                         boolean temDoutorado, Integer notaDoutorado, boolean ehMenorDe50Anos,
                                         boolean fluenteEmIngles){
        Integer aprovado = -1;

        if (fluenteEmIngles) {
            if(temMestrado){
                if(notaMestrado > 7){
                    aprovado = 1;
                }
            }else if(temDoutorado){
                if(notaDoutorado > 5){
                    aprovado = 1;
                }
            }
        } else {

        }
    return aprovado;
    }

}
