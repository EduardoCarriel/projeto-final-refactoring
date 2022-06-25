package br.com.infnet.projetofinal.empresaAcme.model;

import br.com.infnet.projetofinal.empresaAcme.enumerator.EnumGrupoSanguineo;

import java.util.Date;

public class Engenheiro extends Funcionario{

    public String numeroConselho;

    public Engenheiro(Pessoa pessoa, EnumGrupoSanguineo grupoSanguineo, Long tempoDeServicoEmAnos,
                      Long numeroMatricula) {
        super(pessoa, grupoSanguineo, tempoDeServicoEmAnos, numeroMatricula);
    }

    public Double calculaBonusEngenheiro() {
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
