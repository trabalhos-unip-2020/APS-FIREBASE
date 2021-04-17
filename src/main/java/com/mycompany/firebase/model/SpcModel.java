package com.mycompany.firebase.model;

/**
 *
 * @author Diogo Enrico Marianna
 */
public class SpcModel {
    String fauflo;
    String grupo;
    String familia;
    String especie;
    String nome_comum;
    String categoria;
    String sigla_categoria;
    String bioma;
    String ameaca;
    String presenca;
    String plano_acao;
    String ordenamento;
    int nv_protecao;
    String exclusiva_br;
    String estado;

    
    // --> Fauna/Flora
    public String getFauflo() {
        return fauflo;
    }

    public void setFauflo(String fauflo) {
        this.fauflo = fauflo;
    }
    // <-- Fauna/Flora

    // --> Grupo
    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
    // <-- Grupo
    
    // --> Família
    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }
    // <-- Família
    
    // --> Espécie (Simplificado)
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    // <-- Espécie (Simplificado)
    
    // --> Nome Comum
    public String getNome_comum() {
        return nome_comum;
    }

    public void setNome_comum(String nome_comum) {
        this.nome_comum = nome_comum;
    }
    // <-- Nome Comum

    // --> Categoria de Ameaça
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    // <-- Categoria de Ameaça

    // --> Sigla Categoria de Ameaça
    public String getSigla_categoria() {
        return sigla_categoria;
    }

    public void setSigla_categoria(String sigla_categoria) {
        this.sigla_categoria = sigla_categoria;
    }
    // <-- Sigla Categoria de Ameaça

    // --> Bioma
    public String getBioma() {
        return bioma;
    }

    public void setBioma(String bioma) {
        this.bioma = bioma;
    }
    // <-- Bioma

    // --> Principais Ameaças
    public String getAmeaca() {
        return ameaca;
    }

    public void setAmeaca(String ameaca) {
        this.ameaca = ameaca;
    }
    // <-- Principais Ameaças
    
    // --> Presença em Áreas Protegidas
    public String getPresenca() {
        return presenca;
    }

    public void setPresenca(String presenca) {
        this.presenca = presenca;
    }
    // <-- Presença em Áreas Protegidas

    // --> Plano de Ação Nacional para Conservação
    public String getPlano_acao() {
        return plano_acao;
    }

    public void setPlano_acao(String plano_acao) {
        this.plano_acao = plano_acao;
    }
    // <-- Plano de Ação Nacional para Conservação

    // --> Ordenamento Pesqueiro
    public String getOrdenamento() {
        return ordenamento;
    }

    public void setOrdenamento(String ordenamento) {
        this.ordenamento = ordenamento;
    }
    // <-- Ordenamento Pesqueiro

    // --> Nível de Proteção
    public int getNv_protecao() {
        return nv_protecao;
    }

    public void setNv_protecao(int nv_protecao) {
        this.nv_protecao = nv_protecao;
    }
    // <-- Nível de Proteção

    // --> Espécie Exclusiva
    public String getExclusiva_br() {
        return exclusiva_br;
    }

    public void setExclusiva_br(String exclusiva_br) {
        this.exclusiva_br = exclusiva_br;
    }
    // <-- Espécie Exclusiva

    // --> Estados de Ocorrência
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    // <-- Estados de Ocorrência

}
