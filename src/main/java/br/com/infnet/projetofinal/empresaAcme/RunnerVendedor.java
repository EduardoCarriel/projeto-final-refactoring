package br.com.infnet.projetofinal.empresaAcme;

import br.com.infnet.projetofinal.empresaAcme.enumerator.EnumGrupoSanguineo;
import br.com.infnet.projetofinal.empresaAcme.model.EnderecoFuncionario;
import br.com.infnet.projetofinal.empresaAcme.model.Vendedor;

import java.util.HashMap;
import java.util.Map;

public class RunnerVendedor {

    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor((long) 1,
                                   "Eduardo",
                               "Carriel",
                                         new EnderecoFuncionario("80.330-180",
                                                        "Rua Rezala Simão",
                                                                 (long) 650,
                                                      "BL 12 APTO 4",
                                                            "Santa Quitéria",
                                                            "Curitiba",
                                                            "PR"),
                                         EnumGrupoSanguineo.A,
                                         (long) 3,
                                         (long) 5972);
        vendedor.setQuantidadeDeVendas((long) 56);
        setInformacoesVenda(vendedor);
        imprimirInformacoesVenda(vendedor);
    }

    private static void setInformacoesVenda(Vendedor vendedor) {
        Map<String, Integer> listaCursos = new HashMap<String, Integer>();
        listaCursos.put("Desenvolvimento em Java", 9);
        listaCursos.put("SOLID", 7);
        listaCursos.put("Design Patterns", 8);

        vendedor.setListaDeCursos(listaCursos);
        vendedor.setQuantidadeDeVendas((long) 56);
        vendedor.setValorTotalDeVendas((double) 19600);
    }

    private static void imprimirInformacoesVenda(Vendedor vendedor) {
        System.out.println("Vendedor: " + vendedor.getNome() + " " + vendedor.getSobrenome());
        System.out.println("Quantidade de vendas: " + vendedor.getQuantidadeDeVendas());
        System.out.println("Valor total de vendas: " + vendedor.getValorTotalDeVendas());

        System.out.println("Cursos realizos:");
        vendedor.getListaDeCursos().forEach((map) -> {
            map.forEach((curso,nota) -> {
                System.out.println(curso + " - Nota: " + nota);
            });
        });

        if (vendedor.getMetaBatida()) {
            System.out.println("A meta de vendas do vendedor foi alcançada.");
        }
    }
}
