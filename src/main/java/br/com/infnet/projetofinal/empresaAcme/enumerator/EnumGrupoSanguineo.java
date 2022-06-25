package br.com.infnet.projetofinal.empresaAcme.enumerator;

public enum EnumGrupoSanguineo {

    O((byte) 1),
    A((byte) 2),
    B((byte) 3),
    AB((byte) 4);

    private final byte valor;

    EnumGrupoSanguineo(byte valorOpcao) {
        valor = valorOpcao;
    }

    public byte getValor() {
        return valor;
    }

}
