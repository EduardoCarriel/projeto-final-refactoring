package br.com.infnet.projetofinal.empresaAcme.model;

import br.com.infnet.projetofinal.empresaAcme.enumerator.EnumGrupoSanguineo;

import java.util.List;
import java.util.Map;

public class Vendedor extends Funcionario{

    private Long quantidadeDeVendas;

    private Boolean metaBatida;

    public Vendedor(Pessoa pessoa, EnumGrupoSanguineo grupoSanguineo, Long tempoDeServicoEmAnos, Long numeroMatricula) {
        super(pessoa, grupoSanguineo, tempoDeServicoEmAnos, numeroMatricula);
    }

    //Armazena um curso e sua nota;
    private List<Map<String, Integer>>cursos;

    public List<Map<String, Integer>> getCursos() {
        return cursos;
    }

    public void setCursos(List<Map<String, Integer>> cursos) {
        this.cursos = cursos;
    }

    public boolean isPlatinumEBateuMeta(){
        return (quantidadeDeVendas > 35 && getQuantidadeDeCursos() > 3 && metaBatida);
    }

    private int getQuantidadeDeCursos() {
        return cursos.size();
    }

}
