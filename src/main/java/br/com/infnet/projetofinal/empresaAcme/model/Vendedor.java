package br.com.infnet.projetofinal.empresaAcme.model;

import br.com.infnet.projetofinal.empresaAcme.enumerator.EnumGrupoSanguineo;

import java.util.List;
import java.util.Map;

public class Vendedor extends Funcionario{

    public Vendedor(Long id, String nome, String sobrenome, EnderecoFuncionario enderecoFuncionario,
                    EnumGrupoSanguineo grupoSanguineo, Long tempoDeServicoEmAnos, Long numeroMatricula) {
        super(id, nome, sobrenome, enderecoFuncionario, grupoSanguineo, tempoDeServicoEmAnos, numeroMatricula);
    }

    private Long quantidadeDeVendas;

    private Boolean metaBatida;

    private List<Map<String, Integer>> listaCursos;

    public Long getQuantidadeDeVendas() {
        return quantidadeDeVendas;
    }

    public void setQuantidadeDeVendas(Long quantidadeDeVendas) {
        this.quantidadeDeVendas = quantidadeDeVendas;
    }

    public Boolean getMetaBatida() {
        return metaBatida;
    }

    public void setMetaBatida(Boolean metaBatida) {
        this.metaBatida = metaBatida;
    }

    public List<Map<String, Integer>> getListaCursos() {
        return listaCursos;
    }

    public void setListaCursos(List<Map<String, Integer>> listaCursos) {
        this.listaCursos = listaCursos;
    }

    public boolean isPlatinumEBateuMeta(){
        return (quantidadeDeVendas > 35 && getQuantidadeDeCursos() > 3 && metaBatida);
    }

    private Integer getQuantidadeDeCursos() {
        return listaCursos.size();
    }
}
