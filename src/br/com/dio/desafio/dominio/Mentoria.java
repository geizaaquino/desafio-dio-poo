package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {
    private String tirulo;
    private String descricao;
    private LocalDate data;

    public Mentoria() {
    }

    public String getTirulo() {
        return tirulo;
    }

    public void setTirulo(String tirulo) {
        this.tirulo = tirulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "tirulo='" + tirulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", data=" + data +
                '}';
    }
}
