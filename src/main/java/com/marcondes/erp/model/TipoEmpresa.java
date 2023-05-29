package com.marcondes.erp.model;

public enum TipoEmpresa {
    MEI("Micromrpeendedor Individual"),
    EIRELU("Emrpesa individual de Responsabilidade Limitada"),
    LTDA("Sociedade Limitada"),
    SA("Sociedade Anonima");

    private String descricao;

    TipoEmpresa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
