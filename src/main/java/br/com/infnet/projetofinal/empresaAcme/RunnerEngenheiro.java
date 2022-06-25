package br.com.infnet.projetofinal.empresaAcme;

import br.com.infnet.projetofinal.empresaAcme.enumerator.EnumGrupoSanguineo;
import br.com.infnet.projetofinal.empresaAcme.model.EnderecoFuncionario;
import br.com.infnet.projetofinal.empresaAcme.model.Engenheiro;
import br.com.infnet.projetofinal.empresaAcme.model.QualificacaoEngenheiro;

public class RunnerEngenheiro {

    public static void main(String[] args) {

        Engenheiro engenheiro = fichaCadastralEngenheiro();

        qualificacaoTecnicaEngenheiro(engenheiro);

        imprimirDadosEngenheiro(engenheiro);
    }

    private static Engenheiro fichaCadastralEngenheiro() {
        return new Engenheiro((long) 1,
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
    }

    private static void qualificacaoTecnicaEngenheiro(Engenheiro engenheiro) {
        engenheiro.setQualificacaoEngenheiro(new QualificacaoEngenheiro(true,
                                                                        8,
                                                                       true,
                                                                       3,
                                                                     true));
    }

    private static void imprimirDadosEngenheiro(Engenheiro engenheiro) {
        System.out.println("Número do Conselho: " + engenheiro.getNumeroConselho());

        System.out.println("Bônus: " + engenheiro.getBonus());

        System.out.println("Engenheiro é qualificado para trabalhar fora? " + engenheiro.engenheiroEhQualificadoParaTrabalhoFora());
    }

}
