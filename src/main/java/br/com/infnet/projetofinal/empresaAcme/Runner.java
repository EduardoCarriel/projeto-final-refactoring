package br.com.infnet.projetofinal.empresaAcme;

import br.com.infnet.projetofinal.empresaAcme.enumerator.EnumGrupoSanguineo;
import br.com.infnet.projetofinal.empresaAcme.model.EnderecoFuncionario;
import br.com.infnet.projetofinal.empresaAcme.model.Engenheiro;
import br.com.infnet.projetofinal.empresaAcme.model.QualificacaoEngenheiro;

public class Runner {

    public static void main(String[] args) {

        Engenheiro engenheiro = new Engenheiro((long) 1,
                                         "Luciano",
                                     "Keunecke",
                                               new EnderecoFuncionario("89.140-000",
                                                                        "Rua Max Weise",
                                                                                  (long) 290,
                                                                       "Bloco 28 Apartamento 31",
                                                                             "Água Verde",
                                                                             "Blumenau",
                                                                             "SC"),
                                               EnumGrupoSanguineo.O,
                                               (long) 10,
                                               (long)4493,
                                  "ABC102030");

        engenheiro.setQualificacaoEngenheiro(new QualificacaoEngenheiro(true, 8, false, (Integer) 0, true));

        System.out.println("Número do Conselho: " + engenheiro.getNumeroConselho());

        System.out.println("Bônus: " + engenheiro.getBonus());

        System.out.println("Engenheiro é qualificado para trabalhar fora? " + engenheiro.engenheiroEhQualificadoParaTrabalhoFora());


    }

}
