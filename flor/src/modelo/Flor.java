/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Administrador
 */
public class Flor {
    private Integer codigo;
    private Integer ano;
    private String nome_popular;
    private String nome_cientifico;
    private Double tamanho_petala;
    private Double tamanho_sepala;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getNome_popular() {
        return nome_popular;
    }

    public void setNome_popular(String nome_popular) {
        this.nome_popular = nome_popular;
    }

    public String getNome_cientifico() {
        return nome_cientifico;
    }

    public void setNome_cientifico(String nome_cientifico) {
        this.nome_cientifico = nome_cientifico;
    }

    public Double getTamanho_petala() {
        return tamanho_petala;
    }

    public void setTamanho_petala(Double tamanho_petala) {
        this.tamanho_petala = tamanho_petala;
    }

    public Double getTamanho_sepala() {
        return tamanho_sepala;
    }

    public void setTamanho_sepala(Double tamanho_sepala) {
        this.tamanho_sepala = tamanho_sepala;
    }

    @Override
    public String toString() {
        return  nome_popular;
    }
    
}
