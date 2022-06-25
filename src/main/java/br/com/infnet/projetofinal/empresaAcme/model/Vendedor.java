package br.com.infnet.projetofinal.empresaAcme.model;

import br.com.infnet.projetofinal.empresaAcme.enumerator.EnumGrupoSanguineo;

import java.util.List;
import java.util.Map;

public class Vendedor extends Funcionario{

    private Long quantidadeDeVendas;

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

    public boolean isPlatinumEBateuMeta(Boolean metaBatida){
        boolean isPlatinum = false;
        int quantidadeDeCursos = cursos.size();
        if(quantidadeDeVendas > 35 && quantidadeDeCursos > 3 && metaBatida){
            isPlatinum = true;
        }
        return  isPlatinum;
    }
    public Integer getQuantidadeEmpregadosFabrica(){
        return 34;
    }

}
