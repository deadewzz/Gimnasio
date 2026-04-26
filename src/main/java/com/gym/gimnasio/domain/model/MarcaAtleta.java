package com.gym.gimnasio.domain.model;

import java.time.LocalDate;

public class MarcaAtleta {
    private Long id;
    private Long atletaId;
    private String ejercicio;
    private double peso;
    private int repeteciones;
    private LocalDate fecha;

    public MarcaAtleta() {
    }

    public MarcaAtleta(Long id, Long atletaId, String ejercicio,
            double peso, int repeteciones, LocalDate fecha) {
        this.id = id;
        this.atletaId = atletaId;
        this.ejercicio = ejercicio;
        this.peso = peso;
        this.repeteciones = repeteciones;
        this.fecha = fecha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAtletaId() {
        return atletaId;
    }

    public void setAtletaId(Long atletaId) {
        this.atletaId = atletaId;
    }

    public String getEjercicio() {
        return ejercicio;
    }

    public void setEjercicio(String ejercicio) {
        this.ejercicio = ejercicio;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getRepeteciones() {
        return repeteciones;
    }

    public void setRepeteciones(int repeteciones) {
        this.repeteciones = repeteciones;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    // Con este metodo validamos si la maraca del atleta es valida
    public boolean esValidad() {
        return peso > 0 && repeticiones > 0 && fecha != null;
    }

}
