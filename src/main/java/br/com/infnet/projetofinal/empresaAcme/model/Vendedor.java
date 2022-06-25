package br.com.infnet.projetofinal.empresaAcme.model;

import br.com.infnet.projetofinal.empresaAcme.enumerator.EnumGrupoSanguineo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Vendedor extends Funcionario{

    public Vendedor(Long id, String nome, String sobrenome, EnderecoFuncionario enderecoFuncionario,
                    EnumGrupoSanguineo grupoSanguineo, Long tempoDeServicoEmAnos, Long numeroMatricula) {
        super(id, nome, sobrenome, enderecoFuncionario, grupoSanguineo, tempoDeServicoEmAnos, numeroMatricula);
    }

    private Long quantidadeDeVendas;

    private Double valorTotalDeVendas;

    private List<Map<String, Integer>> listaDeCursos = new ArrayList<>();

    public Long getQuantidadeDeVendas() {
        return quantidadeDeVendas;
    }

    public void setQuantidadeDeVendas(Long quantidadeDeVendas) {
        this.quantidadeDeVendas = quantidadeDeVendas;
    }

    public Double getValorTotalDeVendas() {
        return valorTotalDeVendas;
    }

    public void setValorTotalDeVendas(Double valorTotalDeVendas) {
        this.valorTotalDeVendas = valorTotalDeVendas;
    }

    public List<Map<String, Integer>> getListaDeCursos() {
        return listaDeCursos;
    }

    public void setListaDeCursos(Map<String, Integer> listaCursos) {
        this.listaDeCursos.add(listaCursos);
    }

    public boolean getEhPlatinumEBateuMeta(){
        return (quantidadeDeVendas > 35 && getQuantidadeDeCursos() > 3 && getMetaBatida());
    }

    private Integer getQuantidadeDeCursos() {
        return listaDeCursos.size();
    }

    public Boolean getMetaBatida() {
        return valorTotalDeVendas > 500.000;
    }
}
