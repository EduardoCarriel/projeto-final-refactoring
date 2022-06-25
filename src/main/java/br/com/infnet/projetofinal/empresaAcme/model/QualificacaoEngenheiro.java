package br.com.infnet.projetofinal.empresaAcme.model;

public abstract class QualificacaoEngenheiro {

    public QualificacaoEngenheiro(Boolean temMestrado, Integer notaMestrado, boolean temDoutorado, Integer notaDoutorado, boolean ehFluenteEmIngles) {
        this.temMestrado = temMestrado;
        this.notaMestrado = notaMestrado;
        this.temDoutorado = temDoutorado;
        this.notaDoutorado = notaDoutorado;
        this.ehFluenteEmIngles = ehFluenteEmIngles;
    }

    private Boolean temMestrado;
    private Integer notaMestrado;
    private boolean temDoutorado;
    private Integer notaDoutorado;
    private boolean ehFluenteEmIngles;

    public Boolean getTemMestrado() {
        return temMestrado;
    }

    public Integer getNotaMestrado() {
        return notaMestrado;
    }

    public boolean getTemDoutorado() {
        return temDoutorado;
    }

    public Integer getNotaDoutorado() {
        return notaDoutorado;
    }

    public boolean ehFluenteEmIngles() {
        return ehFluenteEmIngles;
    }
}
